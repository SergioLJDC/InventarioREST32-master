package com.bave.inventariorest.service;


import com.bave.inventariorest.dao.IRcvHeadersInterfaceEntregaDao;
import com.bave.inventariorest.model.RcvHeadersInterfaceEntrega;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RcvHeadersInterfaceEntregaService {

    @Autowired
    IRcvHeadersInterfaceEntregaDao iRcvHeadersInterfaceEntregaDao;

    @Transactional
    public void insert(RcvHeadersInterfaceEntrega rcvHeadersInterfaceEntrega){

        iRcvHeadersInterfaceEntregaDao.save(rcvHeadersInterfaceEntrega);

    }



}
