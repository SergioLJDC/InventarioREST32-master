package com.bave.inventariorest.dao;

import com.bave.inventariorest.model.EntregaOrgsHeader;
import com.bave.inventariorest.model.MtlMaterialTransactions;
import com.bave.inventariorest.model.TransactionsDto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedNativeQuery;
import java.util.List;

@Repository

public interface IMtlMaterialTransactionsDao extends PagingAndSortingRepository<MtlMaterialTransactions,Long> {

    @Query(nativeQuery = true,name = "EntregaOrgsHeaderSQL")
    public List<EntregaOrgsHeader> getAllEntregaOrgs();
    @Query(nativeQuery = true,name = "EntregaOrgsHeaderSELECT")
    public EntregaOrgsHeader getEntregaOrgs(Long shipmentHeaderId);


    @Query(nativeQuery = true,name = "TransactionsDtoSelect")
    public List<TransactionsDto> getTransactionAll();


    @Query(nativeQuery = true,name = "TransactionsDtoFilter")
    public List<TransactionsDto> getTransaction(Long ShipmentHeaderId);


}
