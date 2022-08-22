package com.bave.inventariorest.dao;

import com.bave.inventariorest.model.MtlTransactionsLotsIfaceDes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface MtlTransactionsLotsIfaceDesDao extends JpaRepository<MtlTransactionsLotsIfaceDes,Long> {



    @Query(value = "SELECT MTI.* FROM MTL_TRANSACTIONS_LOTS_IFACE MTI where MTI.TRANSACTION_ID = ?1 ",nativeQuery = true)
    MtlTransactionsLotsIfaceDes findByTransactionId(Long TransactionId);



}
