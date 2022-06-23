package com.bave.inventariorest.service;

import com.bave.inventariorest.dao.IMtlTransactionLotNumbersDao;
import com.bave.inventariorest.model.MtlTransactionLotNumbers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class MtlTransactionLotNumbersService {

    @Autowired
    IMtlTransactionLotNumbersDao iMtlTransactionLotNumbersDao;


    @PersistenceContext()
    private EntityManager entityManager;



    @Transactional(readOnly = true)
    public MtlTransactionLotNumbers get(Long transactionId){

        try{
            Query query = entityManager.createQuery("SELECT mtl FROM MtlTransactionLotNumbers mtl WHERE mtl.transactionId=?1",MtlTransactionLotNumbers.class);

            return (MtlTransactionLotNumbers) query.setParameter(1,transactionId).getSingleResult();
        } catch(NoResultException e){

            return null;

        }
    }

    @Transactional
    public void deleteByShipmentHeaderId(Long shipmentHeaderId){

        Query query = entityManager.createQuery("DELETE  FROM MtlTransactionLotNumbers mtl WHERE mtl.shipmentHeaderId=?1");


        int i = query.setParameter(1,shipmentHeaderId).executeUpdate();





    }

    @Transactional
    public void insert(MtlTransactionLotNumbers mtlTransactionLotNumbers){

        iMtlTransactionLotNumbersDao.save(mtlTransactionLotNumbers);

    }
    @Transactional(readOnly = true)
    public List<MtlTransactionLotNumbers> getAllByShipmentHeaderId(Long shipmentHeaderId){

        Query query = entityManager.createQuery("SELECT mtl FROM MtlTransactionLotNumbers mtl WHERE mtl.shipmentHeaderId=?1",MtlTransactionLotNumbers.class);

        try{
        return query.setParameter(1,shipmentHeaderId).getResultList();
        } catch(NoResultException e){

            return null;

        }
    }
    @Transactional(readOnly = true)
    public List<MtlTransactionLotNumbers> getAllByShipmentHeaderIdInventoryItemId(Long shipmentHeaderId, Long inventoryItemId){

        Query query = entityManager.createQuery("SELECT mtl FROM MtlTransactionLotNumbers mtl WHERE mtl.shipmentHeaderId=?1 and mtl.inventoryItemId=?2",MtlTransactionLotNumbers.class);
        try{
            return query.setParameter(1,shipmentHeaderId).setParameter(2,inventoryItemId).getResultList();
        } catch(NoResultException e){

            return null;

        }

    }



}
