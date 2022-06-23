package com.bave.inventariorest.service;

import com.bave.inventariorest.dao.IPoLineLocationsAllDao;
import com.bave.inventariorest.model.PoLineLocationsAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class PoLineLocationsAllService {

    @Autowired
    IPoLineLocationsAllDao iPoLineLocationsAllDao;


    @PersistenceContext()
    private EntityManager entityManager;


    @Transactional
    public void insert(PoLineLocationsAll poLineLocationsAll){
        iPoLineLocationsAllDao.save(poLineLocationsAll);
    }


    @Transactional(readOnly = true)
    public PoLineLocationsAll getById(Long lineLocationId){
        return entityManager.createQuery("select p from PoLineLocationsAll p where p.lineLocationId=?1 ",PoLineLocationsAll.class).setParameter(1,lineLocationId).getSingleResult();

    }

    @Transactional
    public void delete(Long poHeaderId) {

        iPoLineLocationsAllDao.deleteByPoHeaderId(poHeaderId);

    }



}
