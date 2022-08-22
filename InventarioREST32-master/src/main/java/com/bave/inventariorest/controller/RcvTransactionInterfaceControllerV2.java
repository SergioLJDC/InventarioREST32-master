package com.bave.inventariorest.controller;


import com.bave.inventariorest.dao.IRcvTransactionsInterfaceDaoV2;
import com.bave.inventariorest.model.RcvTransactionsInterface;
import com.bave.inventariorest.model.RcvTransactionsInterfaceV2;
import com.bave.inventariorest.service.IRcvTransactionsInterfaceServicieV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RcvTransactionInterfaceControllerV2 {


    @Autowired
    IRcvTransactionsInterfaceServicieV2 rcvTransactionsInterfaceServicieV2;


    @GetMapping("/rcvTransactionInterface/{ParenTransactionID}")
    List<RcvTransactionsInterfaceV2> test(@PathVariable int ParenTransactionID){
        return rcvTransactionsInterfaceServicieV2.test(ParenTransactionID);
    }


}
