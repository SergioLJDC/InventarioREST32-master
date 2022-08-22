package com.bave.inventariorest.dao;

import com.bave.inventariorest.model.RcvTransactionsInterface;
import com.bave.inventariorest.model.RcvTransactionsInterfaceV2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRcvTransactionsInterfaceDaoV2 extends JpaRepository<RcvTransactionsInterfaceV2,Long> {

    @Query(value = "SELECT rti.* " +
            "FROM RCV_TRANSACTIONS_INTERFACE rti " +
            "WHERE " +
            "   rti.SHIPMENT_HEADER_ID =?1 ",nativeQuery = true)
    List<RcvTransactionsInterfaceV2> test(int ParenTransactionID);




}
