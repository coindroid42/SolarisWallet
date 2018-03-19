package store;

/**
 * Created by ming on 2018.3.19.
 */

public class CantInsertAddressException extends Exception {

    public CantInsertAddressException(String message, Throwable cause) {
        super(message, cause);
    }

    public CantInsertAddressException(String message) {
        super(message);
    }
}
