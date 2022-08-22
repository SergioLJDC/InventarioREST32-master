package com.bave.inventariorest.service;

import com.bave.inventariorest.dao.IRcvTransactionsInterfaceDaoV2;
import com.bave.inventariorest.model.RcvTransactionsInterface;
import com.bave.inventariorest.model.RcvTransactionsInterfaceV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IRcvTransactionsInterfaceServicieV2 {

    @Autowired
    IRcvTransactionsInterfaceDaoV2 iRcvTransactionsInterfaceDaoV2;

    public List<RcvTransactionsInterfaceV2> test(int ParenTransactionID){
        return iRcvTransactionsInterfaceDaoV2.test(ParenTransactionID);
    }




}
