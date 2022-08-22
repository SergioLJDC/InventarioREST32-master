package com.bave.inventariorest.service;

import com.bave.inventariorest.MultipleKey.RcvTransactionsId;
import com.bave.inventariorest.dao.IRcvTransactionsInterfaceNew;
import com.bave.inventariorest.model.RcvTransactionInterfaceDesModel;
import com.bave.inventariorest.model.RcvTransactionInterfaceId;
import com.bave.inventariorest.model.RcvTransactionsInterface;
import com.bave.inventariorest.model.RcvTransactionsInterfaceNew;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RcvTransactionsInterfaceNewService {

    @Autowired
    IRcvTransactionsInterfaceNew iRcvTransactionsInterfaceNew;

    public void insert(RcvTransactionsInterfaceNew rcvTransactionsInterfaceNew){
        iRcvTransactionsInterfaceNew.save(rcvTransactionsInterfaceNew);
    }


    public void deleteTransacion(Long transaction , Long id){
        iRcvTransactionsInterfaceNew.deleteTransacion(transaction,id);
    }

    public int getSumaEntregadosByParentTransactionId(int ParenTransactionID){
        return iRcvTransactionsInterfaceNew.getSumaEntregadosByParentTransactionId(ParenTransactionID);
    }

    public List<RcvTransactionsInterface> getRcvTransactionsInterfaceByParentTransactionId(int ParenTransactionID){
        return iRcvTransactionsInterfaceNew.getRcvTransactionsInterfaceByParentTransactionId(ParenTransactionID);
    }

    public List<RcvTransactionInterfaceId> test(int ParenTransactionID){
        return iRcvTransactionsInterfaceNew.test(ParenTransactionID);
    }


    public  List<RcvTransactionsInterfaceNew> getToShipment(Long  Shipment)
    {
        return iRcvTransactionsInterfaceNew.getToShipment( Shipment);
    }


    public List<RcvTransactionsInterfaceNew> getByShipmentHeaderId(Long Shipment){
        return  iRcvTransactionsInterfaceNew.getByShipmentHeaderId(Shipment);
    }





}
