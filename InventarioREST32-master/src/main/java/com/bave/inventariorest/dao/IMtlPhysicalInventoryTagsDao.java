package com.bave.inventariorest.dao;

import com.bave.inventariorest.model.MtlPhysicalInventoryTags;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IMtlPhysicalInventoryTagsDao extends PagingAndSortingRepository<MtlPhysicalInventoryTags,Long> {
}
