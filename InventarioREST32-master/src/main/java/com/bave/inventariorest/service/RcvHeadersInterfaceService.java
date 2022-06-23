package com.bave.inventariorest.service;

import com.bave.inventariorest.dao.IRcvHeadersInterfaceDao;
import com.bave.inventariorest.model.RcvHeadersInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Service
public class RcvHeadersInterfaceService {

    @Autowired
    IRcvHeadersInterfaceDao iRcvHeadersInterfaceDao;


    @PersistenceContext()
    private EntityManager entityManager;

    @Transactional
    public void insert(RcvHeadersInterface rcvHeadersInterface) {
        iRcvHeadersInterfaceDao.save(rcvHeadersInterface);

    }
    @Transactional
    public void deleteByHeaderInterfaceId(Long headerInterfaceId){

        iRcvHeadersInterfaceDao.deleteByHeaderInterfaceId(headerInterfaceId);
    }

    @Transactional(readOnly = true)
    public RcvHeadersInterface get(Long headerInterfaceId){


        Query query = entityManager.createQuery("SELECT rcv FROM RcvHeadersInterface rcv WHERE rcv.headerInterfaceId=?1",RcvHeadersInterface.class);
        try {
            return (RcvHeadersInterface) query.setParameter(1, headerInterfaceId).getSingleResult();
        }
        catch(NoResultException e){

            return null;

        }


    }

    public Long existe(Long headerInterfaceId) {


        Query query = entityManager.createQuery("SELECT COUNT(rcv) FROM RcvHeadersInterface rcv WHERE rcv.headerInterfaceId=?1",Long.class);

        return (Long) query.setParameter(1,headerInterfaceId).getSingleResult();

    }



}
