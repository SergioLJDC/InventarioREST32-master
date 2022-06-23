package com.bave.inventariorest.service;

import com.bave.inventariorest.dao.IPoLinesAllDao;
import com.bave.inventariorest.model.PoLinesAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class PoLinesAllService {

    @Autowired
    IPoLinesAllDao  iPoLinesAllDao;


    @PersistenceContext()
    private EntityManager entityManager;

    @Transactional
    public PoLinesAll getLinea(Long inventoryItemId, Long poHeaderId, Long poLineNum){

        return iPoLinesAllDao.getLinea(inventoryItemId,poHeaderId,poLineNum);
    }
    @Transactional
    public List<PoLinesAll> getLines(Long inventoryItemId, Long poHeaderId){

        return (List<PoLinesAll>) iPoLinesAllDao.getLines(inventoryItemId,poHeaderId);

    }
    @Transactional
    public PoLinesAll getById(Long poLineId){

        return (PoLinesAll) iPoLinesAllDao.getById(poLineId);

    }
    @Transactional
    public  void deleteByPoHeaderId(Long poHeaderId){

        iPoLinesAllDao.deleteByPoHeaderId(poHeaderId);

    }
    @Transactional
    public void insert(PoLinesAll poLinesAll){

        iPoLinesAllDao.save(poLinesAll);
    }



}
