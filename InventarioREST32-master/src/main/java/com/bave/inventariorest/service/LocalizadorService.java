package com.bave.inventariorest.service;

import com.bave.inventariorest.dao.ILocalizadorDao;
import com.bave.inventariorest.model.Localizador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class LocalizadorService {


    @Autowired
    private ILocalizadorDao iLocalizadorDao;

    @PersistenceContext()
    private EntityManager entityManager;

    @Transactional(readOnly = true)
    public List<Localizador> getLocalizadoresBySubinventario(String subinventarioCodigo){

        return iLocalizadorDao.getLocalizadoresBySubinventario(subinventarioCodigo);


    }

    @Transactional(readOnly = true)
    public Long get(String localizador){

        Query query = entityManager.createQuery("SELECT loc FROM Localizador  loc where loc.codLocalizador=?1",Localizador.class);
        try{
            Localizador loc =  (Localizador) query.setParameter(1,localizador).getSingleResult();

            return loc.getIdLocalizador();

        } catch(NoResultException e){

            return null;

        }
    }
    @Transactional(readOnly = true)
    public Localizador get(Long id){

        Query query = entityManager.createQuery("SELECT loc FROM Localizador  loc where loc.idLocalizador=?1",Localizador.class);
        try{
            Localizador loc =  (Localizador) query.setParameter(1,id).getSingleResult();

            return loc;

        } catch(NoResultException e){

            return null;

        }
    }

    @Transactional(readOnly = true)
    public Localizador getByCodigo(String codigo){


        Query query = entityManager.createQuery("SELECT loc FROM Localizador  loc where loc.codLocalizador=?1",Localizador.class);
        try{
            Localizador loc =  (Localizador) query.setParameter(1,codigo).getSingleResult();

            return loc;

        } catch(NoResultException e){

            return null;

        }

    }
    @Transactional
    public void insert(Localizador localizador){

        iLocalizadorDao.save(localizador);

    }

    @Transactional(readOnly = true)
    public List<Localizador> getAllBySubinventarioCountheaderId(String subinventarioCodigo, Long cycleCountHeaderId){

      Query query = entityManager.createNativeQuery(" SELECT * " +
              " FROM " +
              "     localizador " +
              " WHERE " +
              "     cod_subinventario = ?1 " +
              "     AND id_localizador IN (SELECT locator_id FROM mtl_cycle_count_entries WHERE cycle_count_header_id = ?2 ) " +
              " ORDER BY " +
              "     cod_localizador",Localizador.class);

      try {
          return (List<Localizador>) query.setParameter(1, subinventarioCodigo)
                  .setParameter(2, cycleCountHeaderId)
                  .getResultList();
      }
      catch(NoResultException e){

          return null;

      }
    }

    @Transactional(readOnly = true)
    public List<Localizador> getAllBySubinventarioInventarioId(String subinventarioCodigo, Long inventarioId){

        Query query = entityManager.createNativeQuery(" SELECT * " +
                " FROM " +
                "     localizador " +
                " WHERE " +
                "     cod_subinventario = ?1 " +
                "     AND id_localizador IN (SELECT locator_id FROM mtl_physical_inventory_tags WHERE physical_inventory_id = ?2 ) " +
                " ORDER BY " +
                "     cod_localizador",Localizador.class);


        try {
            return (List<Localizador>) query.setParameter(1, subinventarioCodigo)
                    .setParameter(2, inventarioId)
                    .getResultList();
        }
        catch(NoResultException e){

            return null;

        }


    }


}