package com.bave.inventariorest.service;

import com.bave.inventariorest.dao.IOrganizacionDao;
import com.bave.inventariorest.model.Organizacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class OrganizacionService {

@PersistenceContext
private EntityManager entityManager;

@Autowired
private IOrganizacionDao iOrganizacionDao;


public void insert(Organizacion organizacion){

    iOrganizacionDao.save(organizacion);
}

public void delete(Long idOrganizacion){

    iOrganizacionDao.deleteById(idOrganizacion);
}

public Organizacion get(Long idOrganizacion, String code, String transferencia){

    Query query = entityManager.createQuery("SELECT o FROM Organizacion o WHERE o.idOrganizacion=?1 AND o.code=?2 AND o.transferencia=?3",Organizacion.class);
    try{
    return (Organizacion) query.setParameter(1,idOrganizacion)
                .setParameter(2,code)
                .setParameter(3,transferencia).getSingleResult();

    } catch (
    NoResultException e) {

        return null;

    }
}


public Organizacion getByCodeDestino(String code){

    Query query = entityManager.createQuery("SELECT o FROM Organizacion o WHERE o.code=?1 and o.transferencia='HACIA'",Organizacion.class);
    try{
    return (Organizacion) query.setParameter(1,code).getSingleResult();
    } catch (
            NoResultException e) {

        return null;

    }

}

public Organizacion getByiDDestino(Long idOrganizacion){

    Query query = entityManager.createQuery("SELECT o FROM Organizacion o WHERE o.idOrganizacion=?1 and o.transferencia='HACIA'",Organizacion.class);
    try{
        return (Organizacion) query.setParameter(1,idOrganizacion).getSingleResult();
    } catch (
            NoResultException e) {

        return null;

    }

}

public List<Organizacion> getAllDestino(){

    Query query = entityManager.createQuery("SELECT o FROM Organizacion o WHERE  o.transferencia='HACIA'",Organizacion.class);
    try{
        return (List<Organizacion>) query.getResultList();
    } catch (
            NoResultException e) {

        return null;

    }

}


}
