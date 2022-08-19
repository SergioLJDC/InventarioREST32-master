package com.bave.inventariorest.dao;

import com.bave.inventariorest.MultipleKey.RcvTransactionsId;
import com.bave.inventariorest.model.RcvTransactionsInterfaceNew;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface IRcvTransactionsInterfaceNew extends CrudRepository<RcvTransactionsInterfaceNew,RcvTransactionsId> {

    @Transactional
    @Modifying
    @Query(value = "DELETE  FROM  RCV_TRANSACTIONS_INTERFACE ITI " +
            "WHERE ITI.PARENT_TRANSACTION_ID = ?1 AND ITI.CREATED_BY = ?2   ",nativeQuery = true)
    void deleteTransacion(Long transaction , Long id);

}
