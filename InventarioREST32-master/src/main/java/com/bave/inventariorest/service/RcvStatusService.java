package com.bave.inventariorest.service;


import com.bave.inventariorest.dao.IRcvStatusDao;
import com.bave.inventariorest.model.RcvStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Service
public class RcvStatusService {

    @Autowired
    IRcvStatusDao iRcvStatusDao;


    @PersistenceContext()
    private EntityManager entityManager;

    @Transactional
    public void save(RcvStatus rcvStatus){

        iRcvStatusDao.save(rcvStatus);
    }

    @Transactional
    public void actualiza_estado(int estado,Long poheaderId,Long receiptnum){

        Query q = entityManager.createQuery("update RcvStatus r set r.process_flag=?1 where r.po_header_id=?2 and r.receip_num=?3 " +
                "and r.receip_num=?3").setParameter(1,estado).setParameter(2,poheaderId)
                .setParameter(3,receiptnum);

        int retorno = q.executeUpdate();

    }
}
