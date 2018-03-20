package solaris.org.solariswallet.ui.initial;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import solaris.org.solariswallet.SolarisApplication;
import solaris.org.solariswallet.ui.splash_activity.SplashActivity;
import solaris.org.solariswallet.ui.wallet_activity.WalletActivity;
import solaris.org.solariswallet.utils.AppConf;

/**
 * Created by ming on 8/19/17.
 */

public class InitialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SolarisApplication solarisApplication = SolarisApplication.getInstance();
        AppConf appConf = solarisApplication.getAppConf();
        // show report dialog if something happen with the previous process
        Intent intent;
        if (!appConf.isAppInit() || appConf.isSplashSoundEnabled()){
            intent = new Intent(this, SplashActivity.class);
        }else {
            intent = new Intent(this, WalletActivity.class);
        }
        startActivity(intent);
        finish();
    }
}
