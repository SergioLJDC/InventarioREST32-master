package com.bave.inventariorest.service;


import com.bave.inventariorest.dao.IPoDistributionsAllDao;
import com.bave.inventariorest.model.PoDistributionsAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class PoDistributionsAllService {

    @Autowired
    IPoDistributionsAllDao iPoDistributionsAllDao;


    @PersistenceContext()
    private EntityManager entityManager;

    @Transactional
    public void insert(PoDistributionsAll poDistributionsAll){

        iPoDistributionsAllDao.save(poDistributionsAll);
    }

    @Transactional
    public void delete(Long poHeaderId){

        iPoDistributionsAllDao.deleteByPoHeaderId(poHeaderId);
    }

    public PoDistributionsAll getById(Long poDistributionId){

        return  entityManager.createQuery("SELECT p FROM PoDistributionsAll  p  where p.poDistributionId=?1",PoDistributionsAll.class).setParameter(1,poDistributionId).getSingleResult();

    }

}
