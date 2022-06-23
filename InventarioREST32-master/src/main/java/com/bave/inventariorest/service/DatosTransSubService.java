package com.bave.inventariorest.service;

import com.bave.inventariorest.model.DatosTransSubinv;
import com.bave.inventariorest.model.DatosTransSubinvDetalle;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class DatosTransSubService {


    @PersistenceContext()
    private EntityManager entityManager;



    public List<DatosTransSubinv> getTransSubinv(){

        Query query = entityManager.createQuery("SELECT new com.bave.inventariorest.model.DatosTransSubinv(m.transactionReference, m.transactionSourceName) FROM MtlTransactionsInterface m WHERE m.transactionActionId = 2 AND m.transactionTypeId = 2 group by m.transactionReference, m.transactionSourceName", DatosTransSubinv.class);
        try{
        return query.getResultList();
        } catch (NoResultException e) {

            return null;

        }
    }

    public List<DatosTransSubinvDetalle> getTransferencias(String transactionReference){


        Query query2 = entityManager.createQuery(" SELECT new com.bave.inventariorest.model.DatosTransSubinvDetalle(msi.segment1,mti.subinventoryCode,mti.transactionInterfaceId," +
                "(SELECT loc.codLocalizador FROM Localizador loc WHERE loc.idLocalizador=mti.locatorId ) AS localizador," +
                "mti.transferSubinventory AS subinventario_hasta," +
                "(SELECT loc.codLocalizador FROM Localizador loc WHERE loc.idLocalizador=mti.transferLocator ) AS localizador_hasta,mti.transactionQuantity) " +
                "FROM MtlTransactionsInterface   mti,MtlSystemItems  msi " +
                "WHERE mti.inventoryItemId=msi.inventoryItemId and mti.transactionReference=?1 " +
                "",DatosTransSubinvDetalle.class);



        try{
        return query2.setParameter(1,transactionReference).getResultList();
        } catch (NoResultException e) {

            return null;

        }

    }

}
