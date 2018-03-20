package solaris.org.solariswallet.ui.settings_rates;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import solaris.org.solariswallet.R;
import solaris.org.solariswallet.ui.base.BaseActivity;

/**
 * Created by ming on 2018.3.19.
 */

public class SettingsRatesActivity extends BaseActivity {

    View root;

    @Override
    protected void onCreateView(Bundle savedInstanceState, ViewGroup container) {
        root = getLayoutInflater().inflate(R.layout.settings_rates, container);
        setTitle("Rates");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
}
