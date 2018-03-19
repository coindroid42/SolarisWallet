/*
package org.xlrtrum;

import org.solarisj.core.Address;
import org.solarisj.core.Coin;
import org.solarisj.utils.MonetaryFormat;
import org.furszy.client.exceptions.ConnectionFailureException;
import org.junit.Test;
import org.xlrtrum.imp.AddressStoreImp;
import org.xlrtrum.imp.ContextWrapperImp;
import org.xlrtrum.imp.WalletConfigurationsImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import global.WalletConfiguration;
import xlrtrum.NetworkConf;
import xlrtrum.XlrtrumPeer;
import xlrtrum.XlrtrumPeergroup;
import xlrtrum.listeners.AddressListener;
import store.AddressStore;
import store.CantInsertAddressException;
import wallet.WalletManager;

*
 * Created by ming on 2018.3.19.
 * todo: probar qué id tienen los push del servidor del subscribe address o del subscribe height... necesito saber eso para decodificarlo.



public class PeergroupTest {


    @Test
    public void connectXlrtrumPeergroupTest() throws IOException, ConnectionFailureException, InterruptedException {
        ContextWrapperImp contextWrapperImp = new ContextWrapperImp();
        WalletConfiguration walletConfiguration = new WalletConfigurationsImp();
        NetworkConf networkConf = new NetworkConf("localhost",50001);
        WalletManager walletManager = new WalletManager(contextWrapperImp,walletConfiguration);
        walletManager.init();
        AddressStore addressStore = new AddressStoreImp();
        XlrtrumPeergroup xlrtrumPeergroup = new XlrtrumPeergroup(networkConf,walletManager,addressStore);
        xlrtrumPeergroup.start();
        while (true){
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //assert xlrtrumPeergroup.isRunning():"XlrtrumPeergroup is not running..";
    }

    @Test
    public void pushAddressXlrtrumPeergroupTest() throws IOException, CantInsertAddressException, ConnectionFailureException, InterruptedException {
        ContextWrapperImp contextWrapperImp = new ContextWrapperImp();
        WalletConfiguration walletConfiguration = new WalletConfigurationsImp();
        NetworkConf networkConf = new NetworkConf("localhost",50001);
        // fake non trusted peers to start testing..
        networkConf.addPeers(fakePeers());
        WalletManager walletManager = new WalletManager(contextWrapperImp,walletConfiguration);
        walletManager.init();
        AddressStore addressStore = new AddressStoreImp();
        XlrtrumPeergroup xlrtrumPeergroup = new XlrtrumPeergroup(networkConf,walletManager,addressStore);
        xlrtrumPeergroup.addAddressListener(new AddressListener() {
            @Override
            public void onBalanceChange(String address, long confirmed, long unconfirmed,int numConfirmations) {
                System.out.println("onBalanceChange, address: "+address+
                        ", confirmed amount: "+Coin.valueOf(confirmed).toFriendlyString()+
                        " ,unconfirmed amount: "+Coin.valueOf(unconfirmed).toFriendlyString()+
                        "\n Amount of confirmations: "+numConfirmations);
            }
        });
        xlrtrumPeergroup.start();
        while (!xlrtrumPeergroup.isRunning()){
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        assert xlrtrumPeergroup.isRunning():"XlrtrumPeergroup is not running..";
        // subscribe address
        Address address = Address.fromBase58(walletConfiguration.getNetworkParams(),"yCRaSQvLd5a9VFFv9dzns2zNMJhWyymtAd");
        xlrtrumPeergroup.addWatchedAddress(address);
        while (true){
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    private List<InetSocketAddress> fakePeers(){
        List<InetSocketAddress> peers = new ArrayList<>();
        peers.add(new InetSocketAddress("localhost",50001));
        peers.add(new InetSocketAddress("localhost",50001));
        peers.add(new InetSocketAddress("localhost",50001));
        peers.add(new InetSocketAddress("localhost",50001));
        return peers;
    }


}
*/
