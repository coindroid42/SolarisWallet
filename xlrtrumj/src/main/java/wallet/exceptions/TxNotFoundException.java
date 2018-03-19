package wallet.exceptions;

/**
 * Created by ming on 2018.3.19.
 */

public class TxNotFoundException extends Exception {
    public TxNotFoundException(String s) {
        super(s);
    }
}
