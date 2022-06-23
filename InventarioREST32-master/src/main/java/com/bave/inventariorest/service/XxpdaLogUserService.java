package com.bave.inventariorest.service;

import com.bave.inventariorest.dao.XxpdaLogUserInfo;
import com.bave.inventariorest.model.MtlTransactionsInterface;
import com.bave.inventariorest.model.XxpdaLogUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class XxpdaLogUserService {

    @Autowired
    XxpdaLogUserInfo xxpdaLogUserInfo;


    @Transactional
    public void insert(XxpdaLogUser xxpdaLogUser) {

        xxpdaLogUserInfo.save(xxpdaLogUser);
    }



}
