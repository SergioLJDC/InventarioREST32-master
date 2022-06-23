package com.bave.inventariorest.dao;

import com.bave.inventariorest.model.MtlSerialNumbers;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IMtlSerialNumbersDao  extends PagingAndSortingRepository<MtlSerialNumbers,Long> {


}
