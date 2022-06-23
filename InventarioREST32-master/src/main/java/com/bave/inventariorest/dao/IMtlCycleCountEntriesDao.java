package com.bave.inventariorest.dao;

import com.bave.inventariorest.model.MtlCycleCountEntries;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IMtlCycleCountEntriesDao extends PagingAndSortingRepository<MtlCycleCountEntries,Long> {
}
