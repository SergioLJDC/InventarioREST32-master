package com.bave.inventariorest.service;


import com.bave.inventariorest.dao.ISubinventarioDao;
import com.bave.inventariorest.model.Subinventario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class SubinventarioService {

    @Autowired
    ISubinventarioDao iSubinventarioDao;

    @PersistenceContext()
    private EntityManager entityManager;

    @Transactional(readOnly = true)
    public List<Subinventario> getAll(){

        return iSubinventarioDao.getAll();

    }


    @Transactional(readOnly = true)
    public Subinventario getByCodigo(String codigo){

        try {
            Query query = entityManager.createQuery("SELECT s FROM Subinventario s WHERE s.codSubinventario=?1 ", Subinventario.class);

            return (Subinventario) query.setParameter(1, codigo).getSingleResult();
        }
        catch(NoResultException e){

            return null;

        }

    }

    @Transactional(readOnly = true)
    public List<Subinventario> getAllByCiclico(Long conteoCiclicoId){

        Query query = entityManager.createNativeQuery(" SELECT * " +
                " FROM " +
                "     subinventario " +
                " WHERE " +
                "     cod_subinventario in (SELECT DISTINCT(subinventory) FROM mtl_cycle_count_entries WHERE cycle_count_header_id = ?1)",Subinventario.class);
        try {
            return (List<Subinventario>) query.setParameter(1, conteoCiclicoId).getResultList();
        }
        catch(NoResultException e){

            return null;

        }
    }


}
