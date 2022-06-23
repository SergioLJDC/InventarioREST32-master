package com.bave.inventariorest.service;


import com.bave.inventariorest.model.ConsultaItem;
import com.bave.inventariorest.model.ConsultaResumenItem;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class ConsultaItemService {


    @PersistenceContext()
    private EntityManager entityManager;


    @Transactional
    public List<ConsultaItem> getAllByItem(Long inventoryItemId){


       try {
           return entityManager.createQuery("SELECT new com.bave.inventariorest.model.ConsultaItem(c.subinventoryCode,c.locatorCode,c.lotNumber,c.serialNumber,c.inventoryItemId,c.sigle,c.description,c.cantidad,c.unidad) FROM ConsultaItemV  c WHERE c.inventoryItemId=?1").setParameter(1, inventoryItemId).getResultList();
       }
          catch(NoResultException e){

            return null;

        }

    }

    @Transactional
    public List<ConsultaItem> getAllBySubinventory(String subinventoryCode){


        try {
            return entityManager.createQuery("SELECT new com.bave.inventariorest.model.ConsultaItem(c.subinventoryCode,c.locatorCode,c.lotNumber,c.serialNumber,c.inventoryItemId,c.sigle,c.description,c.cantidad,c.unidad) FROM ConsultaItemV  c WHERE c.subinventoryCode=?1").setParameter(1, subinventoryCode).getResultList();
        }
        catch(NoResultException e){

            return null;

        }

    }

    @Transactional
    public List<ConsultaItem> getAllBySubinventoryItem(String subinventoryCode, Long inventoryItemId) {


        try {
            return entityManager.createQuery("SELECT new com.bave.inventariorest.model.ConsultaItem(c.subinventoryCode,c.locatorCode,c.lotNumber,c.serialNumber,c.inventoryItemId,c.sigle,c.description,c.cantidad,c.unidad) FROM ConsultaItemV  c WHERE c.subinventoryCode=?1 and c.inventoryItemId=?2").setParameter(1, subinventoryCode).setParameter(2,inventoryItemId).getResultList();
        }
        catch(NoResultException e){

            return null;

        }

    }

    @Transactional
    public List<ConsultaResumenItem> getAllBySubinventoryResumen(String subinventoryCode){

        try {
            Query query = entityManager.createQuery("SELECT new com.bave.inventariorest.model.ConsultaResumenItem(a.inventoryItemId," +
                    "c.segment1," +
                    "c.description," +
                    "SUM(a.primaryTransactionQuantity)," +
                    "c.primaryUomCode)" +
                    " FROM MtlOnhandQuantities a  left join Localizador b " +
                    " on  a.locatorId = b.idLocalizador join  MtlSystemItems c " +
                    "on a.inventoryItemId=c.inventoryItemId " +
                    "WHERE a.subinventoryCode=?1 GROUP BY a.inventoryItemId," +
                    "c.segment1,c.description,c.primaryUomCode ORDER BY c.description");


            return query.setParameter(1, subinventoryCode).getResultList();
        }
        catch(NoResultException e){

            return null;

        }

    }

}
