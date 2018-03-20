package solaris.org.solariswallet.contacts;

/**
 * Created by mingxiao on 2018.3.19.
 */
public class CantBuildContactException extends RuntimeException {
    public CantBuildContactException(Exception e) {
        super(e);
    }
}
