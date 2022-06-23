package com.bave.inventariorest.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Service
public class XXPDA_HOMOLOGACION_VService {


    @PersistenceContext()
    private EntityManager entityManager;



    @Transactional(readOnly = true)
    public String getHomologacion(String codBarra){

        Query query = entityManager.createQuery("SELECT h.ITEM FROM XXPDA_HOMOLOGACION_V  h where h.HOMOLOGACION=?1",String.class);

        return (String) query.setParameter(1,codBarra).getSingleResult();

    }



}
