package solaris.org.solariswallet.module;

/**
 * Created by mingxiao on 2018.3.19.
 */

public class UpgradeException extends Exception {

    public UpgradeException(String message) {
        super(message);
    }

    public UpgradeException(String message, Throwable cause) {
        super(message, cause);
    }
}
