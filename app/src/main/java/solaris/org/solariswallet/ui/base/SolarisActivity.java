package solaris.org.solariswallet.ui.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;

import solaris.org.solariswallet.SolarisApplication;
import solaris.org.solariswallet.R;
import solaris.org.solariswallet.module.SolarisModule;
import solaris.org.solariswallet.service.IntentsConstants;
import solaris.org.solariswallet.ui.base.dialogs.SimpleTextDialog;
import solaris.org.solariswallet.utils.DialogBuilder;
import solaris.org.solariswallet.utils.DialogsUtil;

import static solaris.org.solariswallet.service.IntentsConstants.ACTION_STORED_BLOCKCHAIN_ERROR;
import static solaris.org.solariswallet.service.IntentsConstants.ACTION_TRUSTED_PEER_CONNECTION_FAIL;

/**
 * Created by ming on 2018.3.19.
 */

public class SolarisActivity extends AppCompatActivity {

    protected SolarisApplication solarisApplication;
    protected SolarisModule solarisModule;

    protected LocalBroadcastManager localBroadcastManager;
    private static final IntentFilter intentFilter = new IntentFilter(ACTION_TRUSTED_PEER_CONNECTION_FAIL);
    private static final IntentFilter errorIntentFilter = new IntentFilter(ACTION_STORED_BLOCKCHAIN_ERROR);

    protected boolean isOnForeground = false;

    private BroadcastReceiver trustedPeerConnectionDownReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action.equals(ACTION_TRUSTED_PEER_CONNECTION_FAIL)) {
                SimpleTextDialog simpleTextDialog = DialogsUtil.buildSimpleErrorTextDialog(context,R.string.title_no_trusted_peer_connection,R.string.message_no_trusted_peer_connection);
                simpleTextDialog.show(getFragmentManager(),"fail_node_connection_dialog");
            }else if (action.equals(ACTION_STORED_BLOCKCHAIN_ERROR)){
                SimpleTextDialog simpleTextDialog = DialogsUtil.buildSimpleErrorTextDialog(context,R.string.title_blockstore_error,R.string.message_blockstore_error);
                simpleTextDialog.show(getFragmentManager(),"blockstore_error_dialog");
            }
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        solarisApplication = SolarisApplication.getInstance();
        solarisModule = solarisApplication.getModule();
        localBroadcastManager = LocalBroadcastManager.getInstance(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        isOnForeground = true;
        localBroadcastManager.registerReceiver(trustedPeerConnectionDownReceiver,intentFilter);
        localBroadcastManager.registerReceiver(trustedPeerConnectionDownReceiver,errorIntentFilter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        isOnForeground = false;
        localBroadcastManager.unregisterReceiver(trustedPeerConnectionDownReceiver);
    }
}
