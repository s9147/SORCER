package edu.pjatk.inn.coffeemaker.impl;

import edu.pjatk.inn.coffeemaker.InventoryService;
import sorcer.service.Context;
import sorcer.service.ContextException;

import java.rmi.RemoteException;

/**
 * Created by wojciech.kalkus on 2016-01-28.
 */
public class InventoryImpl implements InventoryService {

    @Override
    public Context isEnoughMilk(Context context) throws RemoteException, ContextException {
        Integer milkState = 100;

        System.out.println("\n\nweszlo INVENTORY IMPL\n\n");

        Integer milkAmount = (Integer)context.getValue("coffee/milk");
        boolean enough;
        if(milkState>=milkAmount){
            enough = true;
        }else {
            enough = false;
        }
        context.putValue("enought", enough);
        if (context.getReturnPath() != null) {
            context.setReturnValue(enough);
        }

        return context;
    }
}
