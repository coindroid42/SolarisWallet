package store;

/**
 * Created by mingxiao on 2018.3.19.
 */

public class DbException extends Exception {

    public DbException() {
    }

    public DbException(String s) {
        super(s);
    }

    public DbException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
