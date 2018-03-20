package solaris.org.solariswallet.utils;

import org.solarisj.core.ScriptException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

import solaris.org.solariswallet.contacts.AddressLabel;
import solaris.org.solariswallet.module.SolarisModule;
import solaris.org.solariswallet.ui.wallet_activity.TransactionWrapper;

/**
 * Created by ming on 2018.3.19.
 */

public class TxUtils {

    private static Logger logger = LoggerFactory.getLogger(TxUtils.class);

    public static String getAddressOrContact(SolarisModule solarisModule, TransactionWrapper data) {
        String text;
        if (data.getOutputLabels()!=null && !data.getOutputLabels().isEmpty()){
            Collection<AddressLabel> addressLabels = data.getOutputLabels().values();
            AddressLabel addressLabel = addressLabels.iterator().next();
            if (addressLabel !=null) {
                if (addressLabel.getName() != null)
                    text = addressLabel.getName();
                else
                    text = addressLabel.getAddresses().get(0);
            }else {
                try {
                    text = data.getTransaction().getOutput(0).getScriptPubKey().getToAddress(solarisModule.getConf().getNetworkParams(), true).toBase58();
                }catch (ScriptException e){
                    text = data.getTransaction().getOutput(1).getScriptPubKey().getToAddress(solarisModule.getConf().getNetworkParams(),true).toBase58();
                }
            }
        }else {
            text = "Error";
            logger.warn(data.toString());
        }
        return text;
    }

}
