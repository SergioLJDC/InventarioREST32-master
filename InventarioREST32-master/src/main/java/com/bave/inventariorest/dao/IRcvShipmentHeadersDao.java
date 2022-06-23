package com.bave.inventariorest.dao;
import com.bave.inventariorest.model.RcvShipmentHeaders;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IRcvShipmentHeadersDao extends PagingAndSortingRepository<RcvShipmentHeaders,Long> {




}
