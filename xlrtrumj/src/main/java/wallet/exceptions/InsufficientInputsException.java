package wallet.exceptions;

import org.solarisj.core.Coin;

/**
 * Created by ming on 2018.3.19.
 */

public class InsufficientInputsException extends Exception {

    private final Coin missing;

    public InsufficientInputsException(String s,Coin missing) {
        super(s);
        this.missing = missing;
    }

    public Coin getMissing() {
        return missing;
    }
}
