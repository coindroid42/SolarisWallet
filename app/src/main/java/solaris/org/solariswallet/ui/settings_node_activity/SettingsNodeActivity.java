package solaris.org.solariswallet.ui.settings_node_activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;

import solaris.org.solariswallet.R;
import solaris.org.solariswallet.ui.base.BaseActivity;
import solaris.org.solariswallet.ui.wallet_activity.WalletActivity;

/**
 * Created by mingxiao on 2018.3.19.
 */

public class SettingsNodeActivity extends BaseActivity implements View.OnClickListener {
    View root;
    Button btnSelectNode;
    Spinner spinner;
    @Override
    protected void onCreateView(Bundle savedInstanceState, ViewGroup container) {
        root = getLayoutInflater().inflate(R.layout.fragment_start_node, container);
        setTitle("Node preferences");
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnSelectNode = (Button) root.findViewById(R.id.btnSelectNode);
        spinner = (Spinner) root.findViewById(R.id.spinner);

        btnSelectNode.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id==R.id.btnSelectNode){
            startActivity(new Intent(v.getContext(),WalletActivity.class));
        }
    }
}
