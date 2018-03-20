package solaris.org.solariswallet.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import solaris.org.solariswallet.ui.wallet_activity.WalletActivity;

/**
 * Created by mingxiao on 2018.3.19.
 */

public class NavigationUtils {

    public static void goBackToHome(Activity activity){
        Intent upIntent = new Intent(activity,WalletActivity.class);
        upIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        activity.startActivity(upIntent);
        activity.finish();
    }

}
