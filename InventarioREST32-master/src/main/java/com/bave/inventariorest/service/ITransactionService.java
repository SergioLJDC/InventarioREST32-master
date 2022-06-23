package com.bave.inventariorest.service;

import com.bave.inventariorest.model.DatosTransOrg;
import com.bave.inventariorest.model.MtlMaterialTransactionsDto;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class ITransactionService {

    @PersistenceContext()
    private EntityManager entityManager;

    @Transactional(readOnly = true)
    public List<MtlMaterialTransactionsDto> getAll() {
        Query query = entityManager.createQuery(
             "SELECT" +
                     " new com.bave.inventariorest.model.MtlMaterialTransactionsDto(mt.shipment_line_id," +
                     "    mt.transaction_id," +
                     "    msi.segment1," +
                     "    mt.entrega_creation_date)" +
                     "    FROM" +
                     "    MtlMaterialTransactions mt" +
                     "    LEFT JOIN mtl_system_items msi ON msi.inventory_item_id = mt.inventory_item_id",
                MtlMaterialTransactionsDto.class);
        try {
            return query.getResultList();
        } catch (NoResultException e) {

            return null;

        }

    }


}
