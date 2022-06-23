package com.bave.inventariorest.dao;

import com.bave.inventariorest.model.MtlTransactionsInterface;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IMtlTransactionsInterfaceDao extends PagingAndSortingRepository<MtlTransactionsInterface,Long> {


}
