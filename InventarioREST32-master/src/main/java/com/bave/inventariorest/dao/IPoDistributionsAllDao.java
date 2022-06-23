package com.bave.inventariorest.dao;

import com.bave.inventariorest.model.PoDistributionsAll;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IPoDistributionsAllDao extends PagingAndSortingRepository<PoDistributionsAll,Long> {

    void deleteByPoHeaderId(Long poHeaderId);

}
