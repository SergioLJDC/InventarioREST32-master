package com.bave.inventariorest.service;


import com.bave.inventariorest.dao.IMtlTransactionsLotsIfaceDao;
import com.bave.inventariorest.dao.MtlTransactionsLotsIfaceDesDao;
import com.bave.inventariorest.model.MtlTransactionsLotsIface;
import com.bave.inventariorest.model.MtlTransactionsLotsIfaceDes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Service
public class MtlTransactionsLotsIfaceService {

    @Autowired
    IMtlTransactionsLotsIfaceDao iMtlTransactionsLotsIfaceDao;


    @Autowired
    MtlTransactionsLotsIfaceDesDao mtlTransactionsLotsIfaceDesDao;



    @PersistenceContext()
    private EntityManager entityManager;

    @Transactional
    public MtlTransactionsLotsIface getByInterfaceTransactionId(Long InterfaceTransactionId){

        try {
        Query query = entityManager.createQuery("SELECT mtl from MtlTransactionsLotsIface  mtl WHERE mtl.productTransactionId=?1",MtlTransactionsLotsIface.class);

        return (MtlTransactionsLotsIface) query.setParameter(1,InterfaceTransactionId).getSingleResult();

        }
        catch(NoResultException e){

            return null;
        }

    }

    @Transactional
    public void insert(MtlTransactionsLotsIface mtlTransactionsLotsIface){


        iMtlTransactionsLotsIfaceDao.save(mtlTransactionsLotsIface);


    }

    @Transactional
    public void delete(Long transactionInterfaceId){

        iMtlTransactionsLotsIfaceDao.deleteById(transactionInterfaceId);

    }

    @Transactional(readOnly = true)
    public MtlTransactionsLotsIface get(Long transactionInterfaceId) {

        Query query = entityManager.createNativeQuery("SELECT * FROM MTL_TRANSACTIONS_LOTS_IFACE mti WHERE mti.TRANSACTION_INTERFACE_ID=?1",MtlTransactionsLotsIface.class);

        try{
        return (MtlTransactionsLotsIface) query.setParameter(1,transactionInterfaceId).getSingleResult();
        } catch (NoResultException e) {

            return null;

        }
    }

    @Transactional(readOnly = true)
    public MtlTransactionsLotsIface getAll(Long transactionInterfaceId){


        Query query = entityManager.createNativeQuery("SELECT * FROM MTL_TRANSACTIONS_LOTS_IFACE mti WHERE mti.TRANSACTION_INTERFACE_ID=?1",MtlTransactionsLotsIface.class);

        try{
            return (MtlTransactionsLotsIface) query.setParameter(1,transactionInterfaceId).getSingleResult();
        } catch (NoResultException e) {

            return null;

        }

    }


    @Transactional(readOnly = true)
    public MtlTransactionsLotsIface NewLoteEntrega(Long transactionInterfaceId,Long keyID){


        Query query = entityManager.createNativeQuery("SELECT * FROM MTL_TRANSACTIONS_LOTS_IFACE mti WHERE mti.TRANSACTION_INTERFACE_ID=?1 and mti.CREATED_BY =?2",MtlTransactionsLotsIface.class);

        try{
            return (MtlTransactionsLotsIface) query.setParameter(1,transactionInterfaceId).setParameter(2,keyID).getSingleResult();
        } catch (NoResultException e) {

            return null;

        }

    }
    @Transactional
    public void insertDes (MtlTransactionsLotsIfaceDes mtlTransactionsLotsIfaceDes) {
        mtlTransactionsLotsIfaceDesDao.save(mtlTransactionsLotsIfaceDes );
    }

    public MtlTransactionsLotsIfaceDes getByTransactionId(Long TransactionId){
         return mtlTransactionsLotsIfaceDesDao.findByTransactionId(TransactionId);
    }


}
