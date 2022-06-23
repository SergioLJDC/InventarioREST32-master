package com.bave.inventariorest.dao;

import com.bave.inventariorest.model.MtlPhysicalInventories;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IMtlPhysicalInventoriesDao extends PagingAndSortingRepository<MtlPhysicalInventories,Long> {


}
