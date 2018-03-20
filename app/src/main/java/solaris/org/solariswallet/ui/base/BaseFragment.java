package solaris.org.solariswallet.ui.base;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;

import solaris.org.solariswallet.SolarisApplication;
import solaris.org.solariswallet.module.SolarisModule;

/**
 * Created by mingxiao on 2018.3.19.
 */

public class BaseFragment extends Fragment {

    protected SolarisApplication solarisApplication;
    protected SolarisModule solarisModule;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        solarisApplication = SolarisApplication.getInstance();
        solarisModule = solarisApplication.getModule();
    }

    protected boolean checkPermission(String permission) {
        int result = ContextCompat.checkSelfPermission(getActivity(),permission);
        return result == PackageManager.PERMISSION_GRANTED;
    }
}
