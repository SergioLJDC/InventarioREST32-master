package com.bave.inventariorest.dao;

import com.bave.inventariorest.model.PoLineLocationsAll;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IPoLineLocationsAllDao  extends PagingAndSortingRepository<PoLineLocationsAll,Long> {



    void deleteByPoHeaderId(Long poHeaderId);


}
