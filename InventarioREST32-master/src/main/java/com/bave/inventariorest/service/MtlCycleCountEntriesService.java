package com.bave.inventariorest.service;


import com.bave.inventariorest.dao.IMtlCycleCountEntriesDao;
import com.bave.inventariorest.model.MtlCycleCountEntries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Entity;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class MtlCycleCountEntriesService {

    @Autowired
    IMtlCycleCountEntriesDao iMtlCycleCountEntriesDao;



    @PersistenceContext()
    private EntityManager entityManager;



    @Transactional
    public void insert(MtlCycleCountEntries mtlCycleCountEntries){

        iMtlCycleCountEntriesDao.save(mtlCycleCountEntries);

    }

    @Transactional
    public void delete(Long cycleCountEntryId){


        iMtlCycleCountEntriesDao.deleteById(cycleCountEntryId);


    }

    @Transactional
    public void deleteByHeader(Long headerId){

        Query query = entityManager.createQuery("DELETE FROM MtlCycleCountEntries m WHERE m.cycleCountHeaderId=?1").setParameter(1,headerId);

        int operacion = query.executeUpdate();

    }

    @Transactional(readOnly = true)
    public MtlCycleCountEntries get(Long cycleCountEntryId){

        Query query = entityManager.createQuery("SELECT m FROM MtlCycleCountEntries m WHERE m.cycleCountEntryId=?1",MtlCycleCountEntries.class);

        try {
            return (MtlCycleCountEntries) query.setParameter(1, cycleCountEntryId).getSingleResult();
        }
    catch(
    NoResultException e){

        return null;
    }
        }



    @Transactional(readOnly = true)
    public List<MtlCycleCountEntries> getAll(){


        Query query = entityManager.createQuery("SELECT m FROM MtlCycleCountEntries m",MtlCycleCountEntries.class);

        try {
            return (List<MtlCycleCountEntries>) query.getResultList();
        }
        catch(
                NoResultException e){

            return null;
        }

    }
    @Transactional(readOnly = true)
    public List<MtlCycleCountEntries> getAllBySubinventarioLocatorSegmentLoteSerie(Long countHeaderId, String subinventory, Long locatorId, String segment, String serie, String lote){

        try {
            Query query = entityManager.createNativeQuery("SELECT a.*,b.DESCRIPTION,B.LONG_DESCRIPTION,C.COD_LOCALIZADOR FROM MTL_CYCLE_COUNT_ENTRIES a left join MTL_SYSTEM_ITEMS b ON a.INVENTORY_ITEM_ID=b.INVENTORY_ITEM_ID LEFT JOIN LOCALIZADOR c ON a.LOCATOR_ID=c.ID_LOCALIZADOR WHERE a.CYCLE_COUNT_HEADER_ID=?1 and a.SUBINVENTORY=?2 and a.LOCATOR_ID=?3 and a.SEGMENT1=?4 and nvl(a.LOT_NUMBER,'0')=?5 and nvl(a.SERIAL_NUMBER,'0')=?6", MtlCycleCountEntries.class);

            return (List<MtlCycleCountEntries>) query.setParameter(1,countHeaderId)
                                                        .setParameter(2,subinventory)
                                                        .setParameter(3,locatorId)
                                                        .setParameter(4,segment)
                                                        .setParameter(5,lote)
                                                        .setParameter(6,serie).getResultList();

        }
        catch(
                NoResultException e){

            return null;
        }

    }
    @Transactional(readOnly = true)
    public List<MtlCycleCountEntries> getAllBySubinventarioSegmentLoteSerie(Long countHeaderId, String subinventory, String segment, String serie, String lote){

        try {
            Query query = entityManager.createNativeQuery("SELECT a.*,b.DESCRIPTION,B.LONG_DESCRIPTION,C.COD_LOCALIZADOR FROM MTL_CYCLE_COUNT_ENTRIES a left join MTL_SYSTEM_ITEMS b ON a.INVENTORY_ITEM_ID=b.INVENTORY_ITEM_ID LEFT JOIN LOCALIZADOR c ON a.LOCATOR_ID=c.ID_LOCALIZADOR WHERE a.CYCLE_COUNT_HEADER_ID=?1 and a.SUBINVENTORY=?2  and a.SEGMENT1=?3 and nvl(a.LOT_NUMBER,'')=?4 and nvl(a.SERIAL_NUMBER,'')=?5", MtlCycleCountEntries.class);

            return (List<MtlCycleCountEntries>) query.setParameter(1,countHeaderId)
                    .setParameter(2,subinventory)
                    .setParameter(3,segment)
                    .setParameter(4,lote)
                    .setParameter(5,serie).getResultList();

        }
        catch(
                NoResultException e){

            return null;
        }


    }

    @Transactional(readOnly = true)
    public List<MtlCycleCountEntries> getAllInventariadosByHeader(Long countHeaderId){

        try {
            Query query = entityManager.createNativeQuery("SELECT a.*,b.DESCRIPTION,B.LONG_DESCRIPTION,C.COD_LOCALIZADOR FROM MTL_CYCLE_COUNT_ENTRIES a left join MTL_SYSTEM_ITEMS b ON a.INVENTORY_ITEM_ID=b.INVENTORY_ITEM_ID LEFT JOIN LOCALIZADOR c ON a.LOCATOR_ID=c.ID_LOCALIZADOR WHERE a.CYCLE_COUNT_HEADER_ID=?1 and a.COUNT is not null and a.LAST_UPDATED is not null", MtlCycleCountEntries.class);

            return (List<MtlCycleCountEntries>) query.setParameter(1,countHeaderId)
                    .getResultList();

        }
        catch(
                NoResultException e){

            return null;
        }


    }

    @Transactional(readOnly = true)
    public List<MtlCycleCountEntries> getAllInventariadosBySubinventario(Long countHeaderId, String subinventory){

        try {
            Query query = entityManager.createNativeQuery("SELECT a.*,b.DESCRIPTION,B.LONG_DESCRIPTION,C.COD_LOCALIZADOR FROM MTL_CYCLE_COUNT_ENTRIES a left join MTL_SYSTEM_ITEMS b ON a.INVENTORY_ITEM_ID=b.INVENTORY_ITEM_ID LEFT JOIN LOCALIZADOR c ON a.LOCATOR_ID=c.ID_LOCALIZADOR WHERE a.CYCLE_COUNT_HEADER_ID=?1 and a.SUBINVENTORY=?2  and a.COUNT is not null and a.LAST_UPDATED is not null", MtlCycleCountEntries.class);

            return (List<MtlCycleCountEntries>) query.setParameter(1,countHeaderId)
                    .setParameter(2,subinventory)
                    .getResultList();

        }
        catch(
                NoResultException e){

            return null;
        }


    }

    @Transactional(readOnly = true)
    public List<String> getSegmentsByCountHeaderLocator(Long countHeaderId, Long locatorId){


    Query query = entityManager.createNativeQuery(" SELECT " +
            "     segment1 " +
            " FROM " +
            "     mtl_system_items " +
            " WHERE " +
            "     inventory_item_id in ( SELECT distinct(inventory_item_id) FROM mtl_cycle_count_entries WHERE cycle_count_header_id = ?1 and locator_id = ?2 ) " +
            " ORDER BY " +
            "     segment1 ");

    try {

        return (List<String>) query.setParameter(1, countHeaderId)
                .setParameter(2, locatorId)
                .getResultList();
    }
    catch(NoResultException e){

        return null;
    }
    }

    @Transactional(readOnly = true)
    public List<String> getSegmentsByCountHeaderSubinventory(Long countHeaderId, String subinventory){

    Query query = entityManager.createNativeQuery(" SELECT " +
            "     segment1 " +
            " FROM " +
            "     mtl_system_items " +
            " WHERE " +
            "     inventory_item_id in ( SELECT distinct(inventory_item_id) FROM mtl_cycle_count_entries WHERE cycle_count_header_id = ?1 and subinventory = ?2 ) " +
            " ORDER BY " +
            "     segment1 ");

    try {
        return (List<String>) query.setParameter(1, countHeaderId)
                .setParameter(2, subinventory)
                .getResultList();
    }
    catch(NoResultException e){

        return null;
    }

    }
    @Transactional(readOnly = true)
    public List<String> getSegmentsByCountHeaderSubinventoryLocator(Long countHeaderId, String subinventory, Long locatorId){


    Query query = entityManager.createNativeQuery(" SELECT " +
            "     m.SEGMENT1 " +
            " FROM " +
            "     MTL_SYSTEM_ITEMS m" +
            " WHERE " +
            "     m.INVENTORY_ITEM_ID in ( SELECT distinct(c.INVENTORY_ITEM_ID) FROM MTL_CYCLE_COUNT_ENTRIES c WHERE c.CYCLE_COUNT_HEADER_ID = ?1 and c.SUBINVENTORY = ?2 and c.LOCATOR_ID = ?3 ) " +
            " ORDER BY " +
            "     m.SEGMENT1 ");

        try {
            return (List<String>) query.setParameter(1, countHeaderId)
                    .setParameter(2, subinventory)
                    .setParameter(3, locatorId)
                    .getResultList();
        }
        catch(NoResultException e){

            return null;
        }


    }
    @Transactional(readOnly = true)
    public List<String> getLoteByCountHeaderLocatorSegment(Long cycleCountHeaderId, Long locatorId, String segment){


    Query query = entityManager.createNativeQuery(" SELECT " +
            "     lot_number " +
            " FROM " +
            "     mtl_cycle_count_entries " +
            " WHERE " +
            "     cycle_count_header_id = ?1 " +
            "     AND locator_id = ?2  " +
            "     AND segment1 = ?3 " +
            " ORDER BY " +
            "     segment1 ");

        try {
            return (List<String>) query.setParameter(1, cycleCountHeaderId)
                    .setParameter(2, locatorId)
                    .setParameter(3, segment)
                    .getResultList();
        }
        catch(NoResultException e){

            return null;
        }

    }

    @Transactional(readOnly = true)
    public List<String> getLoteByCountHeaderSubinventoryLocatorSegment(Long cycleCountHeaderId, String subinventory, Long locatorId, String segment){


    Query query = entityManager.createNativeQuery(" SELECT " +
            "     lot_number " +
            " FROM " +
            "     mtl_cycle_count_entries " +
            " WHERE " +
            "     cycle_count_header_id = ?1 " +
            "     AND subinventory = ?2 " +
            "     AND locator_id = ?3  " +
            "     AND segment1 = ?4 " +
            " ORDER BY " +
            "     segment1 ");

        try {
            return (List<String>) query.setParameter(1, cycleCountHeaderId)
                    .setParameter(2, subinventory)
                    .setParameter(3, locatorId)
                    .setParameter(4, segment)
                    .getResultList();
        }
        catch(NoResultException e){

            return null;
        }
    }
    @Transactional(readOnly = true)
    public List<String> getLoteByCountHeaderSubinventorySegment(Long cycleCountHeaderId, String subinventory, String segment){


        Query query = entityManager.createNativeQuery( " SELECT " +
                "     lot_number " +
                " FROM " +
                "     mtl_cycle_count_entries " +
                " WHERE " +
                "     cycle_count_header_id = ?1 " +
                "     AND subinventory = ?2 " +
                "     AND segment1 = ?3 " +
                " ORDER BY " +
                "     segment1 ");

        try {
            return (List<String>) query.setParameter(1, cycleCountHeaderId)
                    .setParameter(2, subinventory)
                    .setParameter(3, segment)
                    .getResultList();
        }
        catch(NoResultException e){

            return null;
        }



    }
    @Transactional(readOnly = true)
    public List<String> getSerialByCountHeaderSubinventoryLocatorSegment(Long cycleCountHeaderId, String subinventory, Long locatorId, String segment){

        Query query = entityManager.createNativeQuery(" SELECT " +
                "     serial_number " +
                " FROM " +
                "     mtl_cycle_count_entries " +
                " WHERE " +
                "     cycle_count_header_id = ?1 " +
                "     AND subinventory = ?2 " +
                "     AND locator_id = ?3  " +
                "     AND segment1 = ?4 " +
                " ORDER BY " +
                "     segment1 ");

        try {
            return (List<String>) query.setParameter(1, cycleCountHeaderId)
                    .setParameter(2, subinventory)
                    .setParameter(3,locatorId)
                    .setParameter(4, segment)
                    .getResultList();
        }
        catch(NoResultException e){

            return null;
        }
    }
    @Transactional(readOnly = true)
    public List<String> getSerialByCountHeaderSubinventorySegment(Long cycleCountHeaderId, String subinventory, String segment){


        Query query = entityManager.createNativeQuery(" SELECT " +
                "     serial_number " +
                " FROM " +
                "     mtl_cycle_count_entries " +
                " WHERE " +
                "     cycle_count_header_id = ?1 " +
                "     AND subinventory = ?2 " +
                "     AND segment1 = ?3 " +
                " ORDER BY " +
                "     segment1 ");

        try {
            return (List<String>) query.setParameter(1, cycleCountHeaderId)
                    .setParameter(2, subinventory)
                    .setParameter(3, segment)
                    .getResultList();
        }
        catch(NoResultException e){

            return null;
        }


    }



}








