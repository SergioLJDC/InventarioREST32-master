package com.bave.inventariorest.service;

import com.bave.inventariorest.dao.IMtlSerialNumbersInterfaceDao;
import com.bave.inventariorest.model.MtlSerialNumbersInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class MtlSerialNumbersInterfaceService {



    @Autowired
    IMtlSerialNumbersInterfaceDao iMtlSerialNumbersInterfaceDao;



    @PersistenceContext()
    private EntityManager entityManager;


    @Transactional(readOnly = true)
    public MtlSerialNumbersInterface getAllByInterfaceTransactionId(Long InterfaceTransactionId){

        try {
        Query query = entityManager.createQuery("SELECT mtl FROM MtlSerialNumbersInterface mtl where mtl.productTransactionId=?1",MtlSerialNumbersInterface.class);

            return (MtlSerialNumbersInterface) query.setParameter(1,InterfaceTransactionId).getSingleResult();
        }
        catch(NoResultException e){

            return null;
        }


    }
    @Transactional
    public void insert(MtlSerialNumbersInterface mtlSerialNumbersInterface){
        iMtlSerialNumbersInterfaceDao.save(mtlSerialNumbersInterface);

    }



    @Transactional
    public void delete(Long transactionInterfaceId){

        iMtlSerialNumbersInterfaceDao.deleteById(transactionInterfaceId);
    }


    @Transactional
    public void deleteByInterfaceTransactionId(Long interfaceTransactionId){

        Query query = entityManager.createQuery("DELETE FROM MtlSerialNumbersInterface  m WHERE m.productTransactionId=?1");

        int i = query.setParameter(1,interfaceTransactionId).executeUpdate();


    }

    @Transactional(readOnly = true)
    public List<MtlSerialNumbersInterface> getAll(Long transactionInterfaceId){

        Query query = entityManager.createQuery("SELECT m FROM MtlSerialNumbersInterface m WHERE m.transactionInterfaceId=?1 ",MtlSerialNumbersInterface.class);

        try{

        return (List<MtlSerialNumbersInterface>) query.setParameter(1,transactionInterfaceId).getResultList();

        }
        catch(NoResultException e){

            return null;
        }
    }

    @Transactional(readOnly = true)
    public MtlSerialNumbersInterface get(Long transactionInterfaceId){

        Query query = entityManager.createQuery("SELECT m FROM MtlSerialNumbersInterface m WHERE m.transactionInterfaceId=?1 ",MtlSerialNumbersInterface.class);

        try{

            return (MtlSerialNumbersInterface) query.setParameter(1,transactionInterfaceId).getSingleResult();

        }
        catch(NoResultException e){

            return null;
        }


    }

}
