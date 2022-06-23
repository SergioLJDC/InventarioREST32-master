package com.bave.inventariorest.service;

import com.bave.inventariorest.model.TransactionsDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class DtoService {
    @PersistenceContext()
    private EntityManager entityManager;

    @Transactional (readOnly = true)
    public List<TransactionsDto> getHeider(Long HeiderId){
        try {
            Query query = entityManager.createQuery("SELECT new com.bave.inventariorest.model.TransactionsDto( mt.shipment_line_id," +
                    "mt.transaction_id," +
                    "msi.segment1," +
                    "mt.entrega_creation_date)," +
                    "c.primaryUomCode)" +
                    " FROM " +
                    "mtl_material_transactions mt LEFT JOIN MtlSystemItems msi" +
                    " on msi.inventory_item_id  = mt.inventory_item_id" +
                    " where mt.shipment_header_id =?1");

            return query.setParameter(1, HeiderId).getResultList();
        }
        catch(NoResultException e){

            return null;

        }
    }


    public List<TransactionsDto> getAll() {
        try {

            Query query1 = entityManager.createNativeQuery(
                    "select  " +
                            "mt.shipment_line_id," +
                            "mt.transaction_id,msi.segment1," +
                            "mt.entrega_creation_date " +
                            "from mtl_material_transactions mt LEFT JOIN " +
                            "mtl_system_items msi on msi.inventory_item_id  = mt.inventory_item_id");

            List<TransactionsDto> Lista = query1.getResultList();
            return query1.getResultList();

        } catch (NoResultException e) {

            return null;

        }

    }

}