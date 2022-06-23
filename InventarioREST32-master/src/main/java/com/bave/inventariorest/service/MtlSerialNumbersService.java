package com.bave.inventariorest.service;

import com.bave.inventariorest.dao.IMtlSerialNumbersDao;
import com.bave.inventariorest.model.MtlSerialNumbers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class MtlSerialNumbersService {

    @Autowired
    IMtlSerialNumbersDao iMtlSerialNumbersDao;

    @PersistenceContext()
    private EntityManager entityManager;




    @Transactional(readOnly = true)
    public List<MtlSerialNumbers> getAllByShipmentHeaderIdInventoryItemId(Long shipmentHeaderId, Long inventoryItemId){

        try{
            Query query = entityManager.createQuery("SELECT mtl FROM MtlSerialNumbers mtl WHERE mtl.shipmentHeaderId=?1 and mtl.inventoryItemId=?2",MtlSerialNumbers.class);

            return (List<MtlSerialNumbers>) query.setParameter(1,shipmentHeaderId).setParameter(2,inventoryItemId).getResultList();
        } catch(NoResultException e){

            return null;

        }

    }





}
