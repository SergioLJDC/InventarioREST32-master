package com.bave.inventariorest.service;

import com.bave.inventariorest.dao.IMtlCycleCountHeadersDao;
import com.bave.inventariorest.model.MtlCycleCountHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class MtlCycleCountHeadersService {


    @Autowired
    IMtlCycleCountHeadersDao iMtlCycleCountHeadersDao;

    @PersistenceContext()
    private EntityManager entityManager;

    public void insert(MtlCycleCountHeaders mtlCycleCountHeaders){

        iMtlCycleCountHeadersDao.save(mtlCycleCountHeaders);


    }


    public void delete(Long cycle_count_header_id){

        iMtlCycleCountHeadersDao.deleteById(cycle_count_header_id);

    }

    public MtlCycleCountHeaders get(Long cycle_count_header_id) {


        Query query = entityManager.createQuery("SELECT m FROM MtlCycleCountHeaders m WHERE m.cycleCountHeaderId=?1", MtlCycleCountHeaders.class);

        try{
        return (MtlCycleCountHeaders) query.setParameter(1, cycle_count_header_id).getSingleResult();
    } catch(NoResultException e){

            return null;
        }

    }

    public List<MtlCycleCountHeaders> getAll() {

        Query query = entityManager.createQuery("SELECT m FROM MtlCycleCountHeaders m ", MtlCycleCountHeaders.class);

        try{
        return (List<MtlCycleCountHeaders>) query.getResultList();

         }catch(NoResultException e){

            return null;
        }


    }




}
