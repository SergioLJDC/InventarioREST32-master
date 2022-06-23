package com.bave.inventariorest.service;

import com.bave.inventariorest.dao.IMtlPhysicalInventoryTagsDao;
import com.bave.inventariorest.model.MtlPhysicalInventoryTags;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class MtlPhysicalInventoryTagsService {


@Autowired
    IMtlPhysicalInventoryTagsDao iMtlPhysicalInventoryTagsDao;


    @PersistenceContext()
    private EntityManager entityManager;



    @Transactional
    public void insert(MtlPhysicalInventoryTags mtlPhysicalInventoryTags){

        iMtlPhysicalInventoryTagsDao.save(mtlPhysicalInventoryTags);
    }

    @Transactional
    public void delete(Long tagId){

        iMtlPhysicalInventoryTagsDao.deleteById(tagId);

    }

    @Transactional(readOnly = true)
    public MtlPhysicalInventoryTags get(Long tagId){

        Query query = entityManager.createQuery("SELECT m FROM MtlPhysicalInventoryTags m  WHERE m.tagId=?1 ",MtlPhysicalInventoryTags.class);

        try {
            return (MtlPhysicalInventoryTags) query.setParameter(1, tagId).getSingleResult();
        }
        catch(NoResultException e){

            return null;

        }

    }

    @Transactional
    public void deleteByPhysicalInventory(Long physicalInventoryId){

        int r;

        Query query = entityManager.createQuery("DELETE  FROM MtlPhysicalInventoryTags m  WHERE m.physicalInventoryId=?1 ");
        try {
             r = query.setParameter(1, physicalInventoryId).executeUpdate();
        }
        catch(NoResultException e){

            r=0;

        }

    }


    @Transactional(readOnly = true)
    public List<MtlPhysicalInventoryTags> getAllByInventory(Long physicalInventoryId){


        Query query = entityManager.createNativeQuery( " SELECT " +
                "     a.*, " +
                "     b.description, " +
                "     b.long_description, " +
                "     c.cod_localizador " +
                " FROM " +
                "     mtl_physical_inventory_tags a LEFT JOIN mtl_system_items b  ON a.inventory_item_id = b.inventory_item_id " +
                "     LEFT JOIN localizador c ON a.locator_id = c.id_localizador " +
                " WHERE " +
                "     a.physical_inventory_id = ?1",MtlPhysicalInventoryTags.class);

        try {
            return (List<MtlPhysicalInventoryTags>) query.setParameter(1, physicalInventoryId).getResultList();
        }
        catch(NoResultException e){

            return null;

        }
    }

    @Transactional(readOnly = true)
    public List<MtlPhysicalInventoryTags> getAllByInventorySubinventory(Long physicalInventoryId, String subinventory){

        Query query = entityManager.createNativeQuery(" SELECT " +
                "     a.*, " +
                "     b.description, " +
                "     b.long_description, " +
                "     c.cod_localizador " +
                " FROM " +
                "     mtl_physical_inventory_tags a LEFT JOIN mtl_system_items b  ON a.inventory_item_id = b.inventory_item_id " +
                "     LEFT JOIN localizador c ON a.locator_id = c.id_localizador " +
                " WHERE " +
                "     a.physical_inventory_id = ?1" +
                "     AND a.subinventory = ?2",MtlPhysicalInventoryTags.class);

        try {
            return (List<MtlPhysicalInventoryTags>) query.setParameter(1, physicalInventoryId).setParameter(2, subinventory).getResultList();
        }
        catch(NoResultException e){

            return null;

        }


    }

    @Transactional(readOnly = true)
    public List<MtlPhysicalInventoryTags> getAllInventariadosByInventory(Long physicalInventoryId){

        Query query = entityManager.createNativeQuery(" SELECT " +
                "     a.*, " +
                "     b.description, " +
                "     b.long_description, " +
                "     c.cod_localizador " +
                " FROM " +
                "     mtl_physical_inventory_tags a LEFT JOIN mtl_system_items b  ON a.inventory_item_id = b.inventory_item_id " +
                "     LEFT JOIN localizador c ON a.locator_id = c.id_localizador " +
                " WHERE " +
                "     a.physical_inventory_id = ?1" +
                "     AND  a.primary_count is not null " +
                "     AND  a.last_updated is not null ",MtlPhysicalInventoryTags.class);

        try {
            return (List<MtlPhysicalInventoryTags>) query.setParameter(1, physicalInventoryId).getResultList();
        }
        catch(NoResultException e){

            return null;

        }
    }

    @Transactional(readOnly = true)
    public List<MtlPhysicalInventoryTags> getAllInventariadosByInventorySubinventory(Long physicalInventoryId, String subinventory){


        Query query = entityManager.createNativeQuery( " SELECT " +
                "     a.*, " +
                "     b.description, " +
                "     b.long_description, " +
                "     c.cod_localizador " +
                " FROM " +
                "     mtl_physical_inventory_tags a LEFT JOIN mtl_system_items b  ON a.inventory_item_id = b.inventory_item_id " +
                "     LEFT JOIN localizador c ON a.locator_id = c.id_localizador " +
                " WHERE " +
                "     a.physical_inventory_id = ?1" +
                "     AND a.subinventory = ?2" +
                "     AND  a.primary_count is not null " +
                "     AND  a.last_updated is not null ",MtlPhysicalInventoryTags.class);

        try {
            return (List<MtlPhysicalInventoryTags>) query.setParameter(1, physicalInventoryId).setParameter(2,subinventory).getResultList();
        }
        catch(NoResultException e){

            return null;

        }

    }

    @Transactional(readOnly = true)
    public List<MtlPhysicalInventoryTags> getAllNoInventariadosByInventorySubinventory(Long physicalInventoryId, String subinventory){

        Query query = entityManager.createNativeQuery( " SELECT " +
                "     a.*, " +
                "     b.description, " +
                "     b.long_description, " +
                "     c.cod_localizador " +
                " FROM " +
                "     mtl_physical_inventory_tags a LEFT JOIN mtl_system_items b  ON a.inventory_item_id = b.inventory_item_id " +
                "     LEFT JOIN localizador c ON a.locator_id = c.id_localizador " +
                " WHERE " +
                "     a.physical_inventory_id = ?1" +
                "     AND a.subinventory = ?2" +
                "     " +
                "     AND  a.last_updated is null " ,MtlPhysicalInventoryTags.class);

        try {
            return (List<MtlPhysicalInventoryTags>) query.setParameter(1, physicalInventoryId).setParameter(2,subinventory).getResultList();
        }
        catch(NoResultException e){

            return null;

        }



    }

    @Transactional(readOnly = true)
    public List<MtlPhysicalInventoryTags> getAllByInventorySubinventorySegmentSerieLote(Long physicalInventoryId, String subinventory, Long locatorId, String segment, String serie, String lote, String vencimiento){


        Query query = entityManager.createNativeQuery(" SELECT " +
                "     a.*, " +
                "     b.description, " +
                "     b.long_description, " +
                "     c.cod_localizador " +
                " FROM " +
                "     mtl_physical_inventory_tags a LEFT JOIN mtl_system_items b  ON a.inventory_item_id = b.inventory_item_id " +
                "     LEFT JOIN localizador c ON a.locator_id = c.id_localizador " +
                " WHERE " +
                "     a.physical_inventory_id = ?1" +
                "     AND a.subinventory = ?2" +
                "     AND  a.locator_id = ?3" +
                "     AND a.segment1 = ?4 " +
                "     AND NVL(a.serial_num, '') = ?5 " +
                "     AND NVL(a.lot_number, '') = ?6" +
                "     AND NVL(a.lot_expiration_date, '') = ?7 " ,MtlPhysicalInventoryTags.class);

        try {
            return (List<MtlPhysicalInventoryTags>) query.setParameter(1, physicalInventoryId)
                                                    .setParameter(2,subinventory)
                                                    .setParameter(3,locatorId)
                                                    .setParameter(4,segment)
                                                    .setParameter(5,serie)
                                                    .setParameter(6,lote)
                                                    .setParameter(7,vencimiento).getResultList();
        }
        catch(NoResultException e){

            return null;

        }


    }

    @Transactional(readOnly = true)
    public List<MtlPhysicalInventoryTags> getAllByInventorySubinventorySegmentSerieLoteLocatorNull(Long physicalInventoryId, String subinventory, String segment, String serie, String lote, String vencimiento){


        Query query = entityManager.createNativeQuery( " SELECT " +
                "     a.*, " +
                "     b.description, " +
                "     b.long_description, " +
                "     c.cod_localizador " +
                " FROM " +
                "     mtl_physical_inventory_tags a LEFT JOIN mtl_system_items b  ON a.inventory_item_id = b.inventory_item_id " +
                "     LEFT JOIN localizador c ON a.locator_id = c.id_localizador " +
                " WHERE " +
                "     a.physical_inventory_id = ?1" +
                "     AND a.subinventory = ?2" +
                "     AND a.segment1 = ?3 " +
                "     AND NVL(a.serial_num, '') = ?4 " +
                "     AND NVL(a.lot_number, '') = ?5" +
                "     AND NVL(a.lot_expiration_date, '') = ?6 " ,MtlPhysicalInventoryTags.class);

        try {
            return (List<MtlPhysicalInventoryTags>) query.setParameter(1, physicalInventoryId)
                    .setParameter(2,subinventory)
                    .setParameter(3,segment)
                    .setParameter(4,serie)
                    .setParameter(5,lote)
                    .setParameter(6,vencimiento).getResultList();
        }
        catch(NoResultException e){

            return null;

        }



    }

    @Transactional(readOnly = true)
    public List<String> getLocatorByInventorySubinventory(Long physicalInventoryId, String subinventory){

        Query query = entityManager.createNativeQuery(" SELECT " +
                "     distinct(c.cod_localizador) " +
                " FROM " +
                "     mtl_physical_inventory_tags a LEFT JOIN mtl_system_items b  ON a.inventory_item_id = b.inventory_item_id " +
                "     LEFT JOIN localizador c ON a.locator_id = c.id_localizador " +
                " WHERE " +
                "     a.locator_id is not null " +
                "     AND a.physical_inventory_id = ?1" +
                "     AND a.subinventory = ?2",MtlPhysicalInventoryTags.class);
        try{
        return (List<String>) query.setParameter(1,physicalInventoryId)
                                   .setParameter(2,subinventory)
                                   .getResultList();
        }
        catch(NoResultException e){

            return null;

        }
    }
    @Transactional(readOnly = true)
    public List<String> getSegment1ByInventorySubinventory(Long physicalInventoryId, String subinventory){

        Query query = entityManager.createNativeQuery(     " SELECT " +
                "     DISTINCT(segment1) " +
                " FROM " +
                "     MTL_PHYSICAL_INVENTORY_TAGS " +
                " WHERE " +
                "     physical_inventory_id = ?1 " +
                "     AND subinventory = ?2 " +
                " ORDER BY " +
                "     segment1 ",MtlPhysicalInventoryTags.class);
        try{
            return (List<String>) query.setParameter(1,physicalInventoryId)
                    .setParameter(2,subinventory)
                    .getResultList();
        }
        catch(NoResultException e){

            return null;

        }



    }

    @Transactional(readOnly = true)
    public List<String> getSegment1ByInventorySubinventoryLocator(Long physicalInventoryId, String subinventory, Long locatorId){


        try{

            List<String> salida;
            if (locatorId != null) {
                Query query = entityManager.createNativeQuery(" SELECT " +
                        "     DISTINCT(segment1) " +
                        " FROM " +
                        "     MTL_PHYSICAL_INVENTORY_TAGS " +
                        " WHERE " +
                        "     physical_inventory_id = ?1 " +
                        "     AND subinventory = ?2 " +
                        "     AND locator_id = ?3 " +
                        " ORDER BY " +
                        "     segment1 " ,MtlPhysicalInventoryTags.class);


                salida = (List<String>) query.setParameter(1,physicalInventoryId)
                        .setParameter(2,subinventory)
                        .setParameter(3,locatorId)
                        .getResultList();

            } else {
                Query query = entityManager.createNativeQuery(  " SELECT " +
                        "     DISTINCT(segment1) " +
                        " FROM " +
                        "     MTL_PHYSICAL_INVENTORY_TAGS " +
                        " WHERE " +
                        "     physical_inventory_id = ?1 " +
                        "     AND subinventory = ?2 " +
                        "     AND locator_id is null " +
                        " ORDER BY " +
                        "     segment1 " ,MtlPhysicalInventoryTags.class);

                salida = (List<String>) query.setParameter(1,physicalInventoryId)
                        .setParameter(2,subinventory)
                        .getResultList();
            }
            return salida;



        }
        catch(NoResultException e){

            return null;

        }


    }


    @Transactional(readOnly = true)
    public List<String> getSeriesByInventorySubinventory(Long physicalInventoryId, String subinventory){


        Query query = entityManager.createNativeQuery(      " SELECT " +
                "     DISTINCT(serial_num) " +
                " FROM " +
                "     MTL_PHYSICAL_INVENTORY_TAGS " +
                " WHERE " +
                "     physical_inventory_id = ?1 " +
                "     AND subinventory = ?2 " +
                " ORDER BY " +
                "     serial_num " ,MtlPhysicalInventoryTags.class);
        try{
            return (List<String>) query.setParameter(1,physicalInventoryId)
                    .setParameter(2,subinventory)
                    .getResultList();
        }
        catch(NoResultException e){

            return null;

        }


    }

    @Transactional(readOnly = true)
    public List<String> getSeriesByInventorySubinventoryLocator(Long physicalInventoryId, String subinventory, Long locatorId){


        Query query = entityManager.createNativeQuery(" SELECT " +
                "     DISTINCT(serial_num) " +
                " FROM " +
                "     MTL_PHYSICAL_INVENTORY_TAGS " +
                " WHERE " +
                "     physical_inventory_id = ?1 " +
                "     AND subinventory = ?2 " +
                "     AND locator_id = ?3 " +
                " ORDER BY " +
                "     serial_num " ,MtlPhysicalInventoryTags.class);
        try{
            return (List<String>) query.setParameter(1,physicalInventoryId)
                    .setParameter(2,subinventory)
                    .setParameter(3,locatorId)
                    .getResultList();
        }
        catch(NoResultException e){

            return null;

        }


    }

    @Transactional(readOnly = true)
    public List<String> getSeriesByInventorySubinventoryLocatorSegment(Long physicalInventoryId, String subinventory, Long locatorId, String segment){


        Query query = entityManager.createNativeQuery(" SELECT " +
                "     DISTINCT(serial_num) " +
                " FROM " +
                "     MTL_PHYSICAL_INVENTORY_TAGS " +
                " WHERE " +
                "     physical_inventory_id = ?1 " +
                "     AND subinventory = ?2 " +
                "     AND locator_id = ?3 " +
                "     AND segment1 = ?4 " +
                " ORDER BY " +
                "     serial_num ",MtlPhysicalInventoryTags.class);
        try{
            return (List<String>) query.setParameter(1,physicalInventoryId)
                    .setParameter(2,subinventory)
                    .setParameter(3,locatorId)
                    .setParameter(4,segment)
                    .getResultList();
        }
        catch(NoResultException e){

            return null;

        }

    }


    @Transactional(readOnly = true)
    public List<String> getLotesByInventorySubinventory(Long physicalInventoryId, String subinventory){


        Query query = entityManager.createNativeQuery(" SELECT " +
                "     DISTINCT(lot_number) " +
                " FROM " +
                "     MTL_PHYSICAL_INVENTORY_TAGS " +
                " WHERE " +
                "     physical_inventory_id = ?1 " +
                "     AND subinventory = ?2 " +
                " ORDER BY " +
                "     lot_number ",MtlPhysicalInventoryTags.class);
        try{
            return (List<String>) query.setParameter(1,physicalInventoryId)
                    .setParameter(2,subinventory)
                    .getResultList();
        }
        catch(NoResultException e){

            return null;

        }


    }

    @Transactional(readOnly = true)
    public List<String> getLotesByInventorySubinventoryLocatorSegment(Long physicalInventoryId, String subinventory, Long locatorId, String segment){



        Query query = entityManager.createNativeQuery(" SELECT " +
                "     DISTINCT(lot_number) " +
                " FROM " +
                "     MTL_PHYSICAL_INVENTORY_TAGS " +
                " WHERE " +
                "     physical_inventory_id = ?1 " +
                "     AND subinventory = ?2 " +
                "     AND locator_id = ?3 " +
                "     AND segment1 = ?4 " +
                " ORDER BY " +
                "     lot_number ",MtlPhysicalInventoryTags.class);
        try{
            return (List<String>) query.setParameter(1,physicalInventoryId)
                    .setParameter(2,subinventory)
                    .setParameter(3,locatorId)
                    .setParameter(4,segment)
                    .getResultList();
        }
        catch(NoResultException e){

            return null;

        }


    }

    @Transactional(readOnly = true)
    public List<String> getVencimientosByInventorySubinventoryLocatorSegment(Long physicalInventoryId, String subinventory, Long locatorId, String segment){


        Query query = entityManager.createNativeQuery(" SELECT " +
                "     DISTINCT(lot_expiration_date) " +
                " FROM " +
                "     MTL_PHYSICAL_INVENTORY_TAGS " +
                " WHERE " +
                "     physical_inventory_id = ?1 " +
                "     AND subinventory = ?2 " +
                "     AND locator_id = ?3 " +
                "     AND segment1 = ?4 " +
                " ORDER BY " +
                "     lot_expiration_date ",MtlPhysicalInventoryTags.class);
        try{
            return (List<String>) query.setParameter(1,physicalInventoryId)
                    .setParameter(2,subinventory)
                    .setParameter(3,locatorId)
                    .setParameter(4,segment)
                    .getResultList();
        }
        catch(NoResultException e){

            return null;

        }



    }



}
