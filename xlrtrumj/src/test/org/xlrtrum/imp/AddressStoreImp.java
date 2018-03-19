package org.xlrtrum.imp;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import store.AddressBalance;
import store.AddressNotFoundException;
import store.AddressStore;
import store.CantInsertAddressException;
import store.DbException;

/**
 * Created by ming on 2018.3.19.
 */

public class AddressStoreImp implements AddressStore {

    ConcurrentMap<String,AddressBalance> addresses = new ConcurrentHashMap();

    @Override
    public void insert(String address, AddressBalance addressBalance) throws CantInsertAddressException {
        addresses.put(address,addressBalance);
    }

    @Override
    public AddressBalance getAddressStatus(String address) throws AddressNotFoundException {
        return addresses.get(address);
    }

    @Override
    public Collection<AddressBalance> listBalance() {
        return addresses.values();
    }

    @Override
    public Map<String, AddressBalance> map() {
        return null;
    }

    @Override
    public boolean contains(String address) throws DbException {
        return false;
    }
}
