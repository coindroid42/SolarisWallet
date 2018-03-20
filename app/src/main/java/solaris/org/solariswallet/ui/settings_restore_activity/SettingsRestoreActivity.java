package solaris.org.solariswallet.ui.settings_restore_activity;

import android.os.Bundle;
import android.view.ViewGroup;

import solaris.org.solariswallet.R;
import solaris.org.solariswallet.ui.base.BaseActivity;

/**
 * Created by ming on 2018.3.19.
 */

public class SettingsRestoreActivity extends BaseActivity {

    @Override
    protected void onCreateView(Bundle savedInstanceState,ViewGroup container) {
        getLayoutInflater().inflate(R.layout.fragment_settings_restore, container);
        setTitle("Restore Wallet");
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
