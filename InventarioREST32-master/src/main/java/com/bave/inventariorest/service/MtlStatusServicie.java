package com.bave.inventariorest.service;

import com.bave.inventariorest.dao.MtlStatusRepository;
import com.bave.inventariorest.model.MtlStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MtlStatusServicie {

    @Autowired
    MtlStatusRepository mtlStatusRepository;


    @Transactional
    public void insert(MtlStatus mtlStatus) {

        mtlStatusRepository.save(mtlStatus);
    }

}
