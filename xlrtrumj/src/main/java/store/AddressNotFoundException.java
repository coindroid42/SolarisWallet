package store;

/**
 * Created by mingxiao on 2018.3.19.
 */

public class AddressNotFoundException extends Exception {

    public AddressNotFoundException(String message) {
        super(message);
    }

    public AddressNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
