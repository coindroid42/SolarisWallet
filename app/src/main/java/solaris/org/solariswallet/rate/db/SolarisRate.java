package solaris.org.solariswallet.rate.db;

import java.math.BigDecimal;

/**
 * Created by mingxiao on 2018.3.19.
 */

public class SolarisRate {

    /** Coin letters (USD,EUR,etc..) */
    private final String code;
    /** Value of 1 xlr in this rate */
    private final BigDecimal rate;
    /** Last update time */
    private final long timestamp;

    public SolarisRate(String code, BigDecimal rate, long timestamp) {
        this.code = code;
        this.rate = rate;
        this.timestamp = timestamp;

    }

    public String getCode() {
        return code;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public long getTimestamp() {
        return timestamp;
    }

    /**
     * Old method..
     */
    public String getLink(){
        return null;
    }

}
