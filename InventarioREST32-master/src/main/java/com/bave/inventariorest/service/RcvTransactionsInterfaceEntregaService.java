package com.bave.inventariorest.service;


import com.bave.inventariorest.dao.IRcvTransactionsInterfaceEntregaDao;
import com.bave.inventariorest.model.RcvTransactionsInterfaceEntrega;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RcvTransactionsInterfaceEntregaService {


    @Autowired
    IRcvTransactionsInterfaceEntregaDao iRcvTransactionsInterfaceEntregaDao;

    @Transactional
    public void insert(RcvTransactionsInterfaceEntrega rcvTransactionsInterfaceEntrega ){

        iRcvTransactionsInterfaceEntregaDao.save(rcvTransactionsInterfaceEntrega);

    }


}
