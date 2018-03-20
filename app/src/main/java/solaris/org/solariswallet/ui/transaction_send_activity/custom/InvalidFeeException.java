package solaris.org.solariswallet.ui.transaction_send_activity.custom;

/**
 * Created by mingxiao on 2018.3.19.
 */

class InvalidFeeException extends Exception {

    public InvalidFeeException(String message) {
        super(message);
    }
}
