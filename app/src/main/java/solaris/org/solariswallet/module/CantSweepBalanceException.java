package solaris.org.solariswallet.module;

import java.util.concurrent.TimeoutException;

/**
 * Created by mingxiao on 2018.3.19.
 */

public class CantSweepBalanceException extends Throwable {
    public CantSweepBalanceException(String s,Exception e) {
        super(s,e);
    }
}
