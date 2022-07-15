package com.bave.inventariorest.service;


import com.bave.inventariorest.dao.IMtlOnhandQuantitiesDao;
import com.bave.inventariorest.model.MtlOnhandQuantities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class MtlOnhandQuantitiesService {

    @Autowired
    IMtlOnhandQuantitiesDao iMtlOnhandQuantitiesDao;

    @PersistenceContext()
    private EntityManager entityManager;



    @Transactional
    public void insert(MtlOnhandQuantities mtlOnhandQuantities){

        iMtlOnhandQuantitiesDao.save(mtlOnhandQuantities);

    }
    @Transactional(readOnly = true)
    public MtlOnhandQuantities get(String articulo, String lote, String subinventario, String localizador){

        Query query = entityManager.createNativeQuery("SELECT moq.* FROM mtl_onhand_quantities moq, mtl_system_items msi, localizador loc " +
                "WHERE moq.inventory_item_id = msi.inventory_item_id " +
                "AND loc.id_localizador = moq.locator_id " +
                "AND msi.segment1 = ?1 AND nvl(moq.lot_number,'') = ?2 " +
                "AND moq.subinventory_code = ?3 AND nvl(loc.cod_localizador,'') = ?4",MtlOnhandQuantities.class);

        try {
            return (MtlOnhandQuantities) query.setParameter(1, articulo)
                    .setParameter(2, lote)
                    .setParameter(3, subinventario)
                    .setParameter(4, localizador)
                    .getSingleResult();
        }
        catch(
                NoResultException e){

            return null;
        }

    }


    @Transactional(readOnly = true)
    public MtlOnhandQuantities getLocatorNull(String articulo, String lote, String subinventario){

        Query query = entityManager.createNativeQuery("SELECT moq.* FROM mtl_onhand_quantities moq, mtl_system_items msi " +
                "WHERE moq.inventory_item_id = msi.inventory_item_id " +
                "AND msi.segment1 = ?1 AND nvl(moq.lot_number,'') = ?2 " +
                "AND moq.subinventory_code =?3",MtlOnhandQuantities.class);

        try {
            return (MtlOnhandQuantities) query.setParameter(1, articulo)
                    .setParameter(2, lote)
                    .setParameter(3, subinventario)
                    .getSingleResult();
        }
        catch(
                NoResultException e){

            return null;
        }
    }
    @Transactional(readOnly = true)
    public Double getCantidad(String articulo, String lote, String subinventario, String localizador){


        Query query = entityManager.createNativeQuery("SELECT SUM(moq.primary_transaction_quantity) FROM mtl_onhand_quantities moq, mtl_system_items msi, localizador loc " +
                "WHERE moq.inventory_item_id = msi.inventory_item_id " +
                "AND loc.id_localizador = moq.locator_id " +
                "AND msi.segment1 = ?1 AND nvl(moq.lot_number,'') = ?2 " +
                "AND moq.subinventory_code = ?3 AND nvl(loc.cod_localizador,'') = ?4");


        try {

            BigDecimal a = (BigDecimal) (query.setParameter(1, articulo)
                    .setParameter(2, lote)
                    .setParameter(3, subinventario)
                    .setParameter(4, localizador)
                    .getSingleResult());

            return a.doubleValue();
        }
         catch(NoResultException e){

            return null;
        }
        catch (NullPointerException a){
            Double r = 0.0;
            return r;
        }


    }

    @Transactional(readOnly = true)
    public Double getCantidadLocatorNull(String articulo, String lote, String subinventario){


        Query query = entityManager.createNativeQuery("SELECT SUM(moq.primary_transaction_quantity) FROM mtl_onhand_quantities moq, mtl_system_items msi " +
                "WHERE moq.inventory_item_id = msi.inventory_item_id " +
                "AND msi.segment1 = ?1 AND nvl(moq.lot_number,'') = ?2 " +
                "AND moq.subinventory_code = ?3");

        try {

            BigDecimal a =(BigDecimal) (query.setParameter(1, articulo)
                    .setParameter(2, lote)
                    .setParameter(3, subinventario)
                    .getSingleResult());

            return a.doubleValue();

        }
        catch(
                NoResultException e){

            return null;
        }


    }

    @Transactional(readOnly = true)
    public MtlOnhandQuantities validaSerie(String articulo, String lote, String subinventario, String localizador, String serie){

        Query query = entityManager.createNativeQuery("SELECT * FROM mtl_onhand_quantities moq, mtl_system_items msi, localizador loc " +
                "WHERE moq.inventory_item_id = msi.inventory_item_d " +
                "AND loc.id_localizador = moq.locator_id " +
                "AND msi.segment1 = ?1 AND nvl(moq.lot_number,'') = ?2 " +
                "AND moq.subinventory_code = ?3 AND nvl(loc.cod_localizador,'') = ?4 " +
                "AND moq.serial_number = ?5 ",MtlOnhandQuantities.class);
        try {
            return (MtlOnhandQuantities) query.setParameter(1, articulo)
                    .setParameter(2, lote)
                    .setParameter(3, subinventario)
                    .setParameter(4, localizador)
                    .setParameter(5, serie)
                    .getSingleResult();
        }
        catch(
                NoResultException e){

            return null;
        }



    }
    @Transactional(readOnly = true)
    public List<MtlOnhandQuantities> getAll(String articulo, String lote, String subinventario, String localizador){


        Query query = entityManager.createNativeQuery("SELECT moq.* FROM mtl_onhand_quantities moq, mtl_system_items msi, localizador loc " +
                "WHERE moq.inventory_item_id = msi.inventory_item_id " +
                "AND loc.id_localizador = moq.locator_id " +
                "AND msi.segment1 = ?1 AND nvl(moq.lot_number,'') = ?2 " +
                "AND moq.subinventory_code = ?3 AND nvl(loc.cod_localizador,'') = ?4",MtlOnhandQuantities.class);


        try {
            return (List<MtlOnhandQuantities>) query.setParameter(1, articulo)
                    .setParameter(2, lote)
                    .setParameter(3, subinventario)
                    .setParameter(4, localizador)
                    .getResultList();
        }
        catch(NoResultException e){

            return null;
        }


    }
    @Transactional(readOnly = true)
    public List<String> getSegment1BySubinventory(String subinventory){

        Query query = entityManager.createNativeQuery(" SELECT " +
                " DISTINCT(msi.segment1) " +
                " FROM " +
                " mtl_onhand_quantities moq, mtl_system_items msi " +
                " WHERE moq.inventory_item_id = msi.inventory_item_id " +
                " AND subinventory_code = ?1 " +
                " ORDER BY " +
                " segment1 ");


    try {
        return (List<String>) query.setParameter(1, subinventory)
                .getResultList();
    }
    catch(NoResultException e){

        return null;
    }


    }

    @Transactional(readOnly = true)
    public List<String> getSegment1BySubinventoryLocator(String subinventory, Long locatorId)  {


        List<String> salida = new ArrayList<>();


        if (locatorId != null) {

           // salida = super.selectManyString(MtlOnhandQuantitiesCatalogo.SELECT_SEGMENT1_BY_INVENTORY_SUBINVENTORY_LOCATOR, subinventory, locatorId);

            Query query = entityManager.createNativeQuery( " SELECT " +
                    " DISTINCT(msi.segment1) " +
                    " FROM " +
                    " mtl_onhand_quantities moq, mtl_system_items msi " +
                    " WHERE moq.inventory_item_id = msi.inventory_item_id " +
                    " AND subinventory_code = ?1 " +
                    " AND locator_id = ?2 " +
                    " ORDER BY " +
                    " segment1 ");

            query.setParameter(1,subinventory)
                 .setParameter(2,locatorId);
            try {
                salida = (List<String>) query.getResultList();
            }
            catch(NoResultException e){

            salida =  null;
        }

        } else {

          //  salida = super.selectManyString(MtlOnhandQuantitiesCatalogo.SELECT_SEGMENT1_BY_INVENTORY_SUBINVENTORY_LOCATORNULL, subinventory);


            Query query = entityManager.createNativeQuery(  " SELECT " +
                    " DISTINCT(msi.segment1) " +
                    " FROM " +
                    " mtl_onhand_quantities moq, mtl_system_items msi " +
                    " WHERE moq.inventory_item_id = msi.inventory_item_id " +
                    " AND moq.subinventory_code = ?1 " +
                    " AND moq.locator_id is null " +
                    " ORDER BY " +
                    " msi.segment1 ");

            query.setParameter(1,subinventory);

            try {
                salida = (List<String>) query.getResultList();
            }
            catch(NoResultException e){

                salida =  null;
            }


        }



        return salida;
    }

    @Transactional(readOnly = true)
    public List<String> getLoteBySubinventory(String subinventory, String segment1){


        Query query = entityManager.createNativeQuery(  " SELECT " +
                " DISTINCT(moq.lot_number) " +
                " FROM " +
                " mtl_onhand_quantities moq, mtl_system_items msi " +
                " WHERE moq.inventory_item_id = msi.inventory_item_id " +
                " AND moq.subinventory_code = ?1 " +
                " AND msi.segment1 = ?2 ");

        try {

            return (List<String>) query.setParameter(1, subinventory)
                    .setParameter(2, segment1)
                    .getResultList();
        }
        catch(NoResultException e){

            return  null;
        }


    }

   @Transactional(readOnly = true)
   public List<String> getLoteBySubinventoryLocator(String subinventory, Long locatorId, String segment1){



       List<String> salida = new ArrayList<>();


       if (locatorId != null) {


           Query query = entityManager.createNativeQuery( " SELECT " +
                   " DISTINCT(moq.lot_number) " +
                   " FROM " +
                   " mtl_onhand_quantities moq, mtl_system_items msi " +
                   " WHERE moq.inventory_item_id = msi.inventory_item_id " +
                   " AND moq.subinventory_code = ?1 " +
                   " AND moq.locator_id = ?2 " +
                   " AND msi.segment1 = ?3 ");

           query.setParameter(1,subinventory)
                   .setParameter(2,locatorId)
                   .setParameter(3,segment1);

           try {
               salida = (List<String>) query.getResultList();
           }
           catch(NoResultException e){

               salida =  null;
           }

       } else {



           Query query = entityManager.createNativeQuery(   " SELECT " +
                   " DISTINCT(moq.lot_number) " +
                   " FROM " +
                   " mtl_onhand_quantities moq, mtl_system_items msi " +
                   " WHERE moq.inventory_item_id = msi.inventory_item_id " +
                   " AND subinventory_code = ?1 " +
                   " AND locator_id is null " +
                   " AND msi.segment1 = ?2 " );

           query.setParameter(1,subinventory)
                .setParameter(2,segment1);

           try {
               salida = (List<String>) query.getResultList();
           }
           catch(NoResultException e){

               salida =  null;
           }


       }



       return salida;


   }

}
