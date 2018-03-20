package xlrtrum;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by mingxiao on 2018.3.19.
 *
 * Class in charge of have the default params and save data from the network like servers.
 */

public class NetworkConf {

    private static final String CLIENT_NAME = "solaris_mobile";
    private static final String MAX_PROTOCOL_VERSION = "2.9.5";
    private static final String MIN_PROTOCOL_VERSION = "1.0";
    /** Trusted server selected on the first screen of the app */
    private XlrtrumPeerData trustedHost;
    /** Known servers from the network */
    private List<InetSocketAddress> networkServers;

    public NetworkConf() {
        this.networkServers = new ArrayList<>();
    }

    public XlrtrumPeerData getTrustedServer() {
        return trustedHost;
    }

    public void setTrustedServer(XlrtrumPeerData xlrtrumPeerData) {
        this.trustedHost = xlrtrumPeerData;

    }

    public void addAll(Collection<InetSocketAddress> networkServers){
        networkServers.addAll(networkServers);
    }

    public List<InetSocketAddress> getNetworkServers(){
        return networkServers;
    }

    public String getClientName() {
        return CLIENT_NAME;
    }

    public String getMaxProtocolVersion() {
        return MAX_PROTOCOL_VERSION;
    }

    public String getMinProtocolVersion() {
        return MIN_PROTOCOL_VERSION;
    }

    public void addPeers(List<InetSocketAddress> peers) {
        networkServers.addAll(peers);
    }
}
