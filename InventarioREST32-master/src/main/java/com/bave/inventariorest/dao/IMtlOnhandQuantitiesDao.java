package com.bave.inventariorest.dao;

import com.bave.inventariorest.model.MtlOnhandQuantities;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;

public  interface IMtlOnhandQuantitiesDao extends PagingAndSortingRepository<MtlOnhandQuantities,Long> {



}
