package com.bave.inventariorest.service;

import com.bave.inventariorest.dao.MtlStatusNewRepository;
import com.bave.inventariorest.model.MtlStatusNew;
import com.bave.inventariorest.model.XxpdaLogUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class MtlStatusNewServicie {

    @Autowired
    MtlStatusNewRepository mtlStatusNewRepository;
    @PersistenceContext()
    private EntityManager entityManager;

    @Transactional
    public void insert(MtlStatusNew mtlStatusNew) {

        mtlStatusNewRepository.save(mtlStatusNew);
    }

}
