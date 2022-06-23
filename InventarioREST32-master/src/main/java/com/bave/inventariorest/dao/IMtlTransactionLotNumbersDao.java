package com.bave.inventariorest.dao;

import com.bave.inventariorest.model.MtlTransactionLotNumbers;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IMtlTransactionLotNumbersDao extends PagingAndSortingRepository<MtlTransactionLotNumbers,Long> {


}
