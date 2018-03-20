package global;

import java.util.ArrayList;
import java.util.List;

import xlrtrum.XlrtrumPeerData;

/**
 * Created by mingxiao on 2018.3.19.
 */

public class XlrtrumGlobalData {

    public static final String FURSZY_TESTNET_SERVER = "185.101.98.175";
    public static final String[] TRUSTED_NODES = new String[]{"solarisnode.dyndns.org"};

    public static final List<XlrtrumPeerData> listTrustedHosts(){
        List<XlrtrumPeerData> list = new ArrayList<>();
        //list.add(new XlrtrumPeerData(FURSZY_TESTNET_SERVER,8443,55552));
        for (String trustedNode : TRUSTED_NODES) {
            //list.add(new XlrtrumPeerData(trustedNode,51472,55552));
            list.add(new XlrtrumPeerData(trustedNode,60020,55552));
        }
        return list;
    }

}
