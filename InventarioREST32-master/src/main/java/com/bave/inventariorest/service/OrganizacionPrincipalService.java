package com.bave.inventariorest.service;

import com.bave.inventariorest.dao.IOrganizacionPrincipalDao;
import com.bave.inventariorest.model.OrganizacionPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class OrganizacionPrincipalService {

    @Autowired
    private IOrganizacionPrincipalDao iOrganizacionPrincipalDao;


    @PersistenceContext()
    private EntityManager entityManager;


    @Transactional
    public void insert(OrganizacionPrincipal organizacionPrincipal){

        iOrganizacionPrincipalDao.save(organizacionPrincipal);

    }
    @Transactional(readOnly = true)
    public OrganizacionPrincipal getId(Long id){

        return   iOrganizacionPrincipalDao.getId(id);
    }


    public OrganizacionPrincipal getOneLimited1(){

        return entityManager.createQuery("SELECT o FROM OrganizacionPrincipal o",OrganizacionPrincipal.class).getSingleResult();

    }

}
