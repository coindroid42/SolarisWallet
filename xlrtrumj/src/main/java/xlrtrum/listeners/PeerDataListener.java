package xlrtrum.listeners;

import java.util.List;

import xlrtrum.XlrtrumPeer;
import xlrtrum.messages.responses.StatusHistory;
import xlrtrum.messages.responses.Unspent;

/**
 * Created by mingxiao on 2018.3.19.
 */

public interface PeerDataListener {

    void onSubscribedAddressChange(XlrtrumPeer xlrtrumPeer, String address, String status);

    void onListUnpent(XlrtrumPeer xlrtrumPeer,String address, List<Unspent> unspent);

    void onBalanceReceive(XlrtrumPeer xlrtrumPeer, String address, long confirmed, long unconfirmed);

    void onGetHistory(XlrtrumPeer xlrtrumPeer, StatusHistory statusHistory);
}
