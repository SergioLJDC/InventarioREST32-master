package com.bave.inventariorest.dao;

import com.bave.inventariorest.model.MtlCycleCountHeaders;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IMtlCycleCountHeadersDao extends PagingAndSortingRepository<MtlCycleCountHeaders,Long> {
}
