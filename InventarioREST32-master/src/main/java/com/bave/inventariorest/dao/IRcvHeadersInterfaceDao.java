package com.bave.inventariorest.dao;
import com.bave.inventariorest.model.RcvHeadersInterface;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IRcvHeadersInterfaceDao extends PagingAndSortingRepository<RcvHeadersInterface,Long> {




    void deleteByHeaderInterfaceId(Long headerInterfaceId);

    @Query( " SELECT rcv " +
            " FROM " +
            "     RcvHeadersInterface rcv" +
            " WHERE " +
            "     rcv.headerInterfaceId = ?1 ")
    RcvHeadersInterface get(Long headerInterfaceId);


}
