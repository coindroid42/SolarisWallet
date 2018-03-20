package solaris.org.solariswallet.rate;

/**
 * Created by ming on 2018.3.19.
 */
public class RequestSolarisRateException extends Exception {
    public RequestSolarisRateException(String message) {
        super(message);
    }

    public RequestSolarisRateException(String message, Throwable cause) {
        super(message, cause);
    }

    public RequestSolarisRateException(Exception e) {
        super(e);
    }
}
