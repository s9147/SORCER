package edu.pjatk.inn.coffeemaker;

import sorcer.service.Context;
import sorcer.service.ContextException;

import java.rmi.RemoteException;

/**
 * Created by wojciech.kalkus on 2016-01-28.
 */
public interface InventoryService {

    public Context isEnoughMilk(Context context) throws RemoteException, ContextException;
}
