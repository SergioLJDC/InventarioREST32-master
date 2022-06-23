package com.bave.inventariorest.service;


import com.bave.inventariorest.dao.IMtlSystemItemsDao;
import com.bave.inventariorest.model.MtlSystemItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class MtlSystemItemsService {


    @Autowired
    private IMtlSystemItemsDao iMtlSystemItemsDao;


    @PersistenceContext()
    private EntityManager entityManager;

    @Transactional(readOnly = true)
    public MtlSystemItems  getBySegment(String segment){

        return (MtlSystemItems) iMtlSystemItemsDao.getBySegment(segment);

    }

    @Transactional(readOnly = true)
    public List<MtlSystemItems> getAllByOcReceipt(Long PoHeaderId,Long ReceiptNum){

        return (List<MtlSystemItems>) iMtlSystemItemsDao.getArticulosByOcReceipt(PoHeaderId,ReceiptNum);

    }

    @Transactional(readOnly = true)
    public MtlSystemItems get(Long inventoryItemId){

        return (MtlSystemItems) iMtlSystemItemsDao.get(inventoryItemId);

    }
    @Transactional(readOnly = true)
    public List<MtlSystemItems> getAll(){

        return (List<MtlSystemItems>) iMtlSystemItemsDao.getAll();

    }
    @Transactional(readOnly = true)
    public List<MtlSystemItems> getAllByDescription(String pattern){
        return (List<MtlSystemItems>) iMtlSystemItemsDao.getAllByDescription(pattern);

    }
    @Transactional(readOnly = true)
    public List<MtlSystemItems> getAllByDescriptionPoHeaderId(String  pattern,Long poHeaderId){
        return (List<MtlSystemItems>) iMtlSystemItemsDao.getAllByDescriptionPoHeaderId(pattern,poHeaderId);


    }

    @Transactional(readOnly = true)
    public List<MtlSystemItems> getAllByDescriptionShipment(String pattern,Long shipmentHeaderId){

        return (List<MtlSystemItems>) iMtlSystemItemsDao.getAllByDescriptionShipment(pattern,shipmentHeaderId);
    }

    @Transactional(readOnly = true)
    public List<MtlSystemItems> getAllByDescriptionSubinvLocator(String pattern, String subinventario, String locatorCodigo){
        List<MtlSystemItems> salida;
        if(locatorCodigo != null ) {
            Query query = entityManager.createNativeQuery(" SELECT * " +
                    " FROM " +
                    "     mtl_system_items " +
                    " WHERE " +
                    "     description || long_description like ?1 " +
                    "     AND inventory_item_id in (SELECT distinct(inventory_item_id) FROM mtl_onhand_quantities WHERE subinventory_code = ?2 and locator_id = ?3)",MtlSystemItems.class);

        try{
            salida = query.setParameter(1,pattern).setParameter(2,subinventario).setParameter(3,locatorCodigo).getResultList();
        } catch (NoResultException e) {

            salida = null;

        }
        }
        else{

            Query query = entityManager.createNativeQuery(" SELECT * " +
                    " FROM " +
                    "     mtl_system_items " +
                    " WHERE " +
                    "     description || long_description like ?1 " +
                    "     AND inventory_item_id in (SELECT distinct(inventory_item_id) FROM mtl_onhand_quantities WHERE subinventory_code = ?2)",MtlSystemItems.class);
            try{
            salida = query.setParameter(1,pattern).setParameter(2,subinventario).getResultList();
        } catch (NoResultException e) {

            salida = null;

        }

        }

        return salida;

    }



    @Transactional(readOnly = true)
    public List<MtlSystemItems> getMtlSystemItemsByCycleHeaders(Long CycleHeaders){
        return (List<MtlSystemItems>) iMtlSystemItemsDao.getMtlSystemItemsByCycleHeaders(CycleHeaders);
    }



}
