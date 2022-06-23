package com.bave.inventariorest.service;

import com.bave.inventariorest.dao.IMtlPhysicalSubinventoriesDao;
import com.bave.inventariorest.model.MtlPhysicalSubinventories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class MtlPhysicalSubinventoriesService {

@Autowired
    IMtlPhysicalSubinventoriesDao iMtlPhysicalSubinventoriesDao;

    @PersistenceContext()
    private EntityManager entityManager;

@Transactional
public void insert(MtlPhysicalSubinventories mtlPhysicalSubinventories){

    iMtlPhysicalSubinventoriesDao.save(mtlPhysicalSubinventories);

}


@Transactional
public void deleteByPhysicalInventory(Long physicalInventoryId){

Query query = entityManager.createQuery("DELETE FROM MtlPhysicalSubinventories m WHERE m.physhicalInventoryId=?1");


int r = query.setParameter(1,physicalInventoryId).executeUpdate();


}

@Transactional(readOnly = true)
public List<MtlPhysicalSubinventories> getSubinventories(Long physicalInventoryId){

    Query query = entityManager.createNativeQuery(" SELECT " +
            "     a.*, " +
            "     b.description " +
            " FROM " +
            "     mtl_physical_subinventories a LEFT JOIN subinventario b ON a.subinventory = b.cod_subinventario " +
            " WHERE " +
            "     physical_inventory_id = ?1 ",MtlPhysicalSubinventories.class);

    try {
        return (List<MtlPhysicalSubinventories>) query.setParameter(1, physicalInventoryId).getResultList();
    }
    catch(NoResultException e){

        return null;

    }
}


}
