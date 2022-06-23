package com.bave.inventariorest.service;

import com.bave.inventariorest.dao.IMtlMaterialTransactionsDao;
import com.bave.inventariorest.model.EntregaOrgsHeader;
import com.bave.inventariorest.model.MtlMaterialTransactions;
import com.bave.inventariorest.model.TransactionsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class MtlMaterialTransactionsService {

    @Autowired
    IMtlMaterialTransactionsDao iMtlMaterialTransactionsDao;


    @PersistenceContext()
    private EntityManager entityManager;


    @Transactional(readOnly = true)
    public MtlMaterialTransactions get(Long transactionId) {

        try {
            Query query = entityManager.createQuery("SELECT mtl FROM MtlMaterialTransactions  mtl where mtl.transactionId=?1", MtlMaterialTransactions.class);

            return (MtlMaterialTransactions) query.setParameter(1, transactionId).getSingleResult();


        } catch (NoResultException e) {

            return null;

        }

    }


    @Transactional
    public void insert(MtlMaterialTransactions mtlMaterialTransactions) {

        iMtlMaterialTransactionsDao.save(mtlMaterialTransactions);

    }


    @Transactional
    public void delete(Long transactionId) {

        iMtlMaterialTransactionsDao.deleteById(transactionId);


    }

    @Transactional
    public void deleteByShipmentHeaderId(Long shipmentHeaderId) {

        Query query = entityManager.createQuery("DELETE FROM MtlMaterialTransactions  mtl where mtl.shipmentHeaderId=?1");

        int retorno = query.setParameter(1, shipmentHeaderId).executeUpdate();


    }


    @Transactional(readOnly = true)
    public List<MtlMaterialTransactions> getAllByShipmentHeaderId(Long shipmentHeaderId) {

        try {

            Query query = entityManager.createQuery("SELECT mtl FROM MtlMaterialTransactions  mtl WHERE mtl.shipmentHeaderId=?1", MtlMaterialTransactions.class);

            return (List<MtlMaterialTransactions>) query.setParameter(1, shipmentHeaderId).getResultList();

        } catch (NoResultException e) {

            return null;

        }


    }

    @Transactional(readOnly = true)
    public List<MtlMaterialTransactions> getAllByShipmentInventory(Long shipmentHeaderId, Long inventoryItemId) {

        Query query = entityManager.createQuery("SELECT mtl FROM MtlMaterialTransactions mtl WHERE mtl.shipmentHeaderId=?1 and mtl.inventoryItemId=?2", MtlMaterialTransactions.class);

        try {


            return (List<MtlMaterialTransactions>) query.setParameter(1, shipmentHeaderId).setParameter(2, inventoryItemId).getResultList();

        } catch (NoResultException e) {

            return null;

        }

    }

    @Transactional(readOnly = true)
    public List<MtlMaterialTransactions> getAllByShipmentEntrega(Long shipmentHeaderId) {


        try {
            Query query = entityManager.createQuery("SELECT mtl FROM MtlMaterialTransactions mtl WHERE mtl.shipmentHeaderId=?1 and mtl.entregaCreationDate is not null ", MtlMaterialTransactions.class);
            return (List<MtlMaterialTransactions>) query.setParameter(1, shipmentHeaderId).getResultList();
        } catch (NoResultException e) {

            return null;

        }


    }

    @Transactional(readOnly = true)
    public List<String> getSegmentsByShipment(Long shipmentHeaderId) {
        try {
            Query query = entityManager.createQuery("SELECT msi.segment1 FROM MtlSystemItems msi WHERE msi.inventoryItemId in (SELECT DISTINCT(mtl.inventoryItemId) FROM MtlMaterialTransactions mtl WHERE mtl.shipmentHeaderId=?1)", String.class);

            return (List<String>) query.setParameter(1, shipmentHeaderId).getResultList();
        } catch (NoResultException e) {

            return null;

        }

    }

    @Transactional(readOnly = true)
    public List<EntregaOrgsHeader> getAllEntregaOrgs() {

        try {
            return iMtlMaterialTransactionsDao.getAllEntregaOrgs();

        } catch (NoResultException e) {

            return null;

        }
    }


    @Transactional(readOnly = true)
    public EntregaOrgsHeader getEntregaOrgs(Long shipmentHeaderId) {
        try {
            return iMtlMaterialTransactionsDao.getEntregaOrgs(shipmentHeaderId);
        } catch (NoResultException e) {

            return null;

        }

    }

    @Transactional(readOnly = true)
    public List<TransactionsDto> getTransactionAll() {
        try {
            return (List<TransactionsDto>) iMtlMaterialTransactionsDao.getTransactionAll();
        } catch (NoResultException e) {

            return null;

        }


    }

    @Transactional(readOnly = true)
    public List<TransactionsDto> getTransaction(Long shipmentHeaderId) {
        try {
            return (List<TransactionsDto>) iMtlMaterialTransactionsDao.getTransaction(shipmentHeaderId);
        } catch (NoResultException e) {

            return null;

        }


    }




}