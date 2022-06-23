package com.bave.inventariorest.service;

import com.bave.inventariorest.dao.IRcvShipmentHeadersDao;
import com.bave.inventariorest.model.RcvShipmentHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;


@Service
public class RcvShipmentHeadersService {

    @Autowired
    private IRcvShipmentHeadersDao iRcvShipmentHeadersDao;



    @PersistenceContext()
    private EntityManager entityManager;

    public void insert(RcvShipmentHeaders rcvShipmentHeaders){
        iRcvShipmentHeadersDao.save(rcvShipmentHeaders);

    }


    public RcvShipmentHeaders get(Long shipmentHeaderId){
        try{
        return entityManager.createQuery("SELECT r FROM RcvShipmentHeaders r WHERE r.shipmentHeaderId = ?1",
                RcvShipmentHeaders.class)
                .setParameter(1,shipmentHeaderId)
                .getSingleResult();
        } catch(NoResultException e){

            return null;

        }


    }
    public List<RcvShipmentHeaders> getAll(){


        Query query = entityManager.createNativeQuery("SELECT DISTINCT  h.* FROM RCV_SHIPMENT_HEADERS h,RCV_TRANSACTIONS t, RCV_STATUS s WHERE h.SHIPMENT_HEADER_ID=t.SHIPMENT_HEADER_ID AND s.PO_HEADER_ID=t.PO_HEADER_ID AND  s.RECEIP_NUM=TO_NUMBER(h.RECEIPT_NUM) AND s.PROCESS_FLAG IN (6,7)",RcvShipmentHeaders.class);



        //return (List<RcvShipmentHeaders>) iRcvShipmentHeadersDao.findAll();

        return (List<RcvShipmentHeaders>) query.getResultList();
    }



}
