package com.bave.inventariorest.service;

import com.bave.inventariorest.dao.IMtlSerialNumbersInterfaceEntregaDao;
import com.bave.inventariorest.model.MtlSerialNumbersInterfaceEntrega;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MtlSerialNumbersInterfaceEntregaService {

    @Autowired
    IMtlSerialNumbersInterfaceEntregaDao iMtlSerialNumbersInterfaceEntregaDao;


    @Transactional
    public void insert(MtlSerialNumbersInterfaceEntrega mtlSerialNumbersInterfaceEntrega){

        iMtlSerialNumbersInterfaceEntregaDao.save(mtlSerialNumbersInterfaceEntrega);
    }
}
