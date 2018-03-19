package xlrtrum.listeners;

import xlrtrum.XlrtrumPeer;

/**
 * Created by ming on 2018.3.19.
 */

public interface PeerListener {

    void onConnected(XlrtrumPeer xlrtrumPeer);

    void onDisconnected(XlrtrumPeer xlrtrumPeer);

    void onExceptionCaught(XlrtrumPeer xlrtrumPeer, Exception e);
}
