package com.bave.inventariorest.service;

import com.bave.inventariorest.dao.IRcvTransactionsDao;
import com.bave.inventariorest.model.RcvTransactions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class RcvTransactionsService {

    @Autowired
    IRcvTransactionsDao iRcvTransactionsDao;


    @PersistenceContext()
    private EntityManager entityManager;

    public void insert(RcvTransactions rcvTransactions){

        iRcvTransactionsDao.save(rcvTransactions);

    }

    public void delete(Long transactionId){

        iRcvTransactionsDao.deleteById(transactionId);
    }

    public RcvTransactions get(Long transactionId){
        try{
            return entityManager.createQuery("SELECT r FROM RcvTransactions r WHERE r.transactionId=?1",RcvTransactions.class).setParameter(1,transactionId).getSingleResult();
        } catch(NoResultException e){

            return null;

        }
    }

    public List<RcvTransactions> getAllByShipment(Long shipmentHeaderId){
        try{
            return entityManager.createQuery("SELECT r FROM RcvTransactions r WHERE r.shipmentHeaderId=?1",RcvTransactions.class).setParameter(1,shipmentHeaderId).getResultList();
        } catch(NoResultException e){

            return null;

        }
    }

    public List<RcvTransactions> getAllByShipmentInventory(Long shipmentHeaderId, Long inventoryItemId){
        try{
            return entityManager.createQuery("SELECT r FROM RcvTransactions r WHERE r.shipmentHeaderId=?1 and r.itemId = ?2").setParameter(1,shipmentHeaderId).setParameter(2,inventoryItemId).getResultList();
        } catch(NoResultException e){

            return null;

        }
    }

    public List<String> getSegmentsByShipment(Long shipmentHeaderId){
        try{
            return entityManager.createQuery("SELECT m.segment1 FROM MtlSystemItems m where m.inventoryItemId in (SELECT distinct(r.itemId) FROM RcvTransactions r where r.shipmentHeaderId=?1)",String.class).setParameter(1,shipmentHeaderId).getResultList();
        } catch(NoResultException e){

            return null;

        }

    }

}
