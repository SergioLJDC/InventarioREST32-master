package com.bave.inventariorest.service;

import com.bave.inventariorest.MultipleKey.RcvTransactionsId;
import com.bave.inventariorest.dao.IRcvTransactionsInterfaceNew;
import com.bave.inventariorest.model.RcvTransactionsInterfaceNew;
import org.springframework.beans.factory.annotation.Autowired;
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
}
