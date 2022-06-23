package com.bave.inventariorest.service;

import com.bave.inventariorest.dao.IMtlPhysicalInventoriesDao;
import com.bave.inventariorest.model.MtlPhysicalInventories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;


@Service
public class MtlPhysicalInventoriesService {

@Autowired
    IMtlPhysicalInventoriesDao iMtlPhysicalInventoriesDao;


    @PersistenceContext()
    private EntityManager entityManager;


    @Transactional
    public void insert(MtlPhysicalInventories mtlPhysicalInventories){
        iMtlPhysicalInventoriesDao.save(mtlPhysicalInventories);

    }

    @Transactional(readOnly = true)
    public MtlPhysicalInventories get(Long id){


        Query query = entityManager.createQuery("SELECT m FROM MtlPhysicalInventories m WHERE m.physicalInventoryId=?1",MtlPhysicalInventories.class);
        try {
            return (MtlPhysicalInventories) query.setParameter(1, id)
                    .getSingleResult();

        }
        catch(
                NoResultException e){

            return null;
        }


    }

    @Transactional(readOnly = true)
    public List<MtlPhysicalInventories> getAll(){


        Query query = entityManager.createQuery("SELECT m FROM MtlPhysicalInventories m",MtlPhysicalInventories.class);
        try {
            return (List<MtlPhysicalInventories>) query.getResultList();

        }
        catch(
                NoResultException e){

            return null;
        }

    }

    @Transactional
    public void delete(Long id){


        iMtlPhysicalInventoriesDao.deleteById(id);

    }





}
