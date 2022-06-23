package com.bave.inventariorest.dao;

import com.bave.inventariorest.model.MtlTransactionsLotsIface;
import org.springframework.data.repository.PagingAndSortingRepository;



public interface IMtlTransactionsLotsIfaceDao extends PagingAndSortingRepository<MtlTransactionsLotsIface,Long> {
}
