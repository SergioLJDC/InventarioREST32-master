package com.bave.inventariorest.service;

import com.bave.inventariorest.dao.IPoHeadersAllDao;
import com.bave.inventariorest.model.DatosCabeceraRecepcion;
import com.bave.inventariorest.model.DatosRecepcion;
import com.bave.inventariorest.model.PoHeadersAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class PoHeadersAllService {

    @Autowired
    private IPoHeadersAllDao iPoHeadersAllDao;

    @PersistenceContext()
    private EntityManager entityManager;

    @Transactional(readOnly = true)
    public List<PoHeadersAll> findAll(){

        return (List<PoHeadersAll>) entityManager.createQuery("SELECT p from PoHeadersAll p, RcvStatus r " +
                "where p.po_header_id=r.po_header_id and p.receipt_num=r.receip_num and r.process_flag in (1,2)",PoHeadersAll.class).getResultList();

    }


    @Transactional
    public void save(PoHeadersAll poHeadersAll) {
        iPoHeadersAllDao.save(poHeadersAll);

    }


    @Transactional(readOnly = true)
    public PoHeadersAll findOne(Long id) {
        // TODO Auto-generated method stub
        return iPoHeadersAllDao.findById(id).orElse(null);
    }

    @Transactional
    public void delete(Long id) {
        iPoHeadersAllDao.deleteById(id);

    }



    @Transactional(readOnly = true)
    public DatosCabeceraRecepcion get(Long poHeaderId, Long receiptNum){

        return (DatosCabeceraRecepcion)  iPoHeadersAllDao.get(poHeaderId,receiptNum);

    }

    @Transactional(readOnly = true)
    public DatosRecepcion getDatosRecepcion(String segment1, String oc, Long receiptNum, Long poLineNum){
        return (DatosRecepcion) iPoHeadersAllDao.getDatosRecepcion(segment1, oc, receiptNum, poLineNum);
    }

}
