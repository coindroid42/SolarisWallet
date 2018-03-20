package solaris.org.solariswallet.ui.wallet_activity;

/**
 * Created by mingxiao on 2018.3.19.
 */

public class TransactionData {
    public String title;
    public String description;
    public String amount;
    public String amountLocal;
    public int imageId;

    public TransactionData(String title, String description, int imageId, String amount, String amountLocal) {
        this.title = title;
        this.description = description;
        this.imageId = imageId;
        this.amount = amount;
        this.amountLocal = amountLocal;
    }
}
