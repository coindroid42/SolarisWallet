package global;

import java.util.ArrayList;
import java.util.List;

import pivtrum.PivtrumPeerData;

/**
 * Created by furszy on 7/2/17.
 */

public class PivtrumGlobalData {

    public static final String FURSZY_TESTNET_SERVER = "185.101.98.175";

     //public static final String[] TRUSTED_NODES = new String[]{"node.pivxwiki.org"};
   // public static final String[] TRUSTED_NODES = new String[]{"getgetmage.club"};
    public static final String[] TRUSTED_NODES = new String[]{"139.99.105.178"};

    public static final List<PivtrumPeerData> listTrustedHosts(){
        List<PivtrumPeerData> list = new ArrayList<>();
        list.add(new PivtrumPeerData(FURSZY_TESTNET_SERVER,8443,55552));
        for (String trustedNode : TRUSTED_NODES) {
            //list.add(new PivtrumPeerData(trustedNode,51472,55552));
            list.add(new PivtrumPeerData(trustedNode,60020,55552));
        }
        return list;
    }

}
