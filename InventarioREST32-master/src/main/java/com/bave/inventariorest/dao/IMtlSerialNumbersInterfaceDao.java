package com.bave.inventariorest.dao;

import com.bave.inventariorest.model.MtlSerialNumbersInterface;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IMtlSerialNumbersInterfaceDao extends PagingAndSortingRepository<MtlSerialNumbersInterface,Long> {
}
