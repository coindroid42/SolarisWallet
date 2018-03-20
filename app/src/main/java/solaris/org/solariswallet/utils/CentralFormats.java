package solaris.org.solariswallet.utils;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by mingxiao on 2018.3.19.
 */

public class CentralFormats {

    private NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);

    public CentralFormats(AppConf appConf) {
        // number format
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setMinimumFractionDigits(2);
    }

    public NumberFormat getNumberFormat() {
        return numberFormat;
    }

    public String format(BigDecimal bigDecimal){
        return numberFormat.format(bigDecimal).substring(1);
    }
}
