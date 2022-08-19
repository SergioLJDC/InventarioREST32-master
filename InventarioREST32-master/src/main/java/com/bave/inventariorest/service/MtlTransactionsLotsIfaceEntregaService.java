package com.bave.inventariorest.service;

import com.bave.inventariorest.dao.IMtlTransactionsLotsIfaceEntregaDao;
import com.bave.inventariorest.model.MtlTransactionsLotsIfaceEntrega;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MtlTransactionsLotsIfaceEntregaService {

    @Autowired
    IMtlTransactionsLotsIfaceEntregaDao iMtlTransactionsLotsIfaceEntregaDao;


    @Transactional
    public void insert(MtlTransactionsLotsIfaceEntrega mtlTransactionsLotsIfaceEntrega){

        iMtlTransactionsLotsIfaceEntregaDao.save(mtlTransactionsLotsIfaceEntrega);

    }






}
