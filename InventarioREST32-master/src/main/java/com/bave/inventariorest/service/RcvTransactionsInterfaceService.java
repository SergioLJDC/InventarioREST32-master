package com.bave.inventariorest.service;

import com.bave.inventariorest.dao.IRcvTransactionsInterfaceDao;
import com.bave.inventariorest.model.DatosCabeceraRecepcion;
import com.bave.inventariorest.model.DatosRecepcion;
import com.bave.inventariorest.model.RcvTransactionsInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class RcvTransactionsInterfaceService  {

    @Autowired
    private IRcvTransactionsInterfaceDao iRcvTransactionsInterfaceDao;


    @PersistenceContext()
    private EntityManager entityManager;

    @Transactional(readOnly = true)
    public List<RcvTransactionsInterface> getArticulos(Long id){
        return (List<RcvTransactionsInterface>) iRcvTransactionsInterfaceDao.getArticulos(id);
    }


    @Transactional
    public void insert(RcvTransactionsInterface rcvTransactionsInterface) {
        iRcvTransactionsInterfaceDao.save(rcvTransactionsInterface);

    }
    @Transactional
    public void delete(Long interfaceTransactionId){
        iRcvTransactionsInterfaceDao.deleteByInterfaceTransactionId(interfaceTransactionId);

    }
    @Transactional
    public void deleteByHeaderInterfaceId(Long headerInterfaceId){
        iRcvTransactionsInterfaceDao.deleteByHeaderInterfaceId(headerInterfaceId);

    }


    @Transactional(readOnly = true)
    public RcvTransactionsInterface get(Long headerInterfaceId, String codigoSigle, Long poLineId) {

        RcvTransactionsInterface retorno = new RcvTransactionsInterface();
        retorno.setInterfaceTransactionId(Long.parseLong("0"));


        try{

            return (RcvTransactionsInterface) entityManager.createQuery(" SELECT rti FROM RcvTransactionsInterface rti, MtlSystemItems msi where  rti.itemId = msi.inventoryItemId and rti.headerInterfaceId = ?1  and msi.segment1 = ?2 and rti.poLineId = ?3", RcvTransactionsInterface.class).setParameter(1, headerInterfaceId).setParameter(2, codigoSigle).setParameter(3, poLineId).getSingleResult();
        }
        catch(NoResultException e){

            return retorno;

        }



    }


    @Transactional(readOnly = true)
    public RcvTransactionsInterface getByTransactionId(Long parentTransactionId){
        RcvTransactionsInterface rcv = new RcvTransactionsInterface();

        try {

            return (RcvTransactionsInterface) entityManager.createQuery(" SELECT rti "
                    + " FROM "
                    + "     RcvTransactionsInterface rti, "
                    + "     MtlSystemItems msi "
                    + " WHERE "
                    + "     rti.itemId = msi.inventoryItemId "
                    + "     AND rti.parentTransactionId = ?1 "
                    , RcvTransactionsInterface.class).setParameter(1, parentTransactionId).getSingleResult();

        } catch(NoResultException e){

            return rcv;

        }

    }


    public RcvTransactionsInterface getByInterfaceTransactionId(Long interfaceTransactionId){

        return (RcvTransactionsInterface) entityManager.createQuery("SELECT rti " + " FROM " + "RcvTransactionsInterface rti, " + "MtlSystemItems msi"
                + " WHERE " + "rti.itemId = msi.inventoryItemId " + "AND rti.interfaceTransactionId = ?1 ",RcvTransactionsInterface.class).setParameter(1,interfaceTransactionId).getSingleResult();
    }
    public List<RcvTransactionsInterface> getAllByHeaderV2(Long headerInterfaceId){


        try {

            Query query = entityManager.createQuery("select r from RcvTransactionsInterface  r where r.groupId not in (select concat(s.receip_num,s.po_header_id) from RcvStatus  s where s.process_flag=3 ) and r.headerInterfaceId=?1", RcvTransactionsInterface.class);

            return query.setParameter(1, headerInterfaceId).getResultList();
        }
        catch(NoResultException e){

            return null;
        }
    }





    public List<RcvTransactionsInterface> getAllByHeader(Long headerInterfaceId){

        return (List<RcvTransactionsInterface>) iRcvTransactionsInterfaceDao.getAllByHeader(headerInterfaceId);




    }


    @Transactional
    public List<RcvTransactionsInterface> getAll(){

        try {
            Query query = entityManager.createQuery("SELECT r FROM RcvTransactionsInterface r", RcvTransactionsInterface.class);


            return (List<RcvTransactionsInterface>) query.getResultList();
        }
        catch(NoResultException e){

            return null;
        }
    }


    @Transactional
    public List<RcvTransactionsInterface> getbyShipmentHeaderId(Long shipment_header_id){

        Query query = entityManager.createQuery("SELECT r FROM RcvTransactionsInterface r WHERE r.parentTransactionId IN (SELECT t.transactionId FROM RcvTransactions t WHERE t.shipmentHeaderId=?1)",RcvTransactionsInterface.class);


        try {
            return (List<RcvTransactionsInterface>) query.setParameter(1, shipment_header_id).getResultList();
        }
        catch(NoResultException e){

            return null;
        }
    }

    @Transactional
   public List<Long> getPolineasBysegmentAndPoHeader(String segment , Long poHeaderId){
        return iRcvTransactionsInterfaceDao.getPolineasBysegmentAndPoHeader(segment,poHeaderId);
    }

    @Transactional
    public int getSumaEntregadosByParentTransactionId(int ParenTransactionID){
        return iRcvTransactionsInterfaceDao.getSumaEntregadosByParentTransactionId(ParenTransactionID);
    }


    @Transactional
    public List<RcvTransactionsInterface> getRcvTransactionsInterfaceByParentTransactionId(int ParenTransactionID){
        return iRcvTransactionsInterfaceDao.getRcvTransactionsInterfaceByParentTransactionId(ParenTransactionID);
    }



}
