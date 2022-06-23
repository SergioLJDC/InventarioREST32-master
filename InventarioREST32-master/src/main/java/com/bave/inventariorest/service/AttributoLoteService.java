package com.bave.inventariorest.service;

import com.bave.inventariorest.dao.IAttriburoLoteDao;
import com.bave.inventariorest.model.AttributoLote;
import com.bave.inventariorest.model.AttributoLote2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class AttributoLoteService {


    @PersistenceContext()
    private EntityManager entityManager;

    public List<AttributoLote2> getAll(){
        Query query = entityManager.createNativeQuery("select * from XXPDA_ATTRIBUTO_LOTE_V");
        return  query.getResultList();
    }



}
