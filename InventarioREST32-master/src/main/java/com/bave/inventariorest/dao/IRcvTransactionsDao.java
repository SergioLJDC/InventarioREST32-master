package com.bave.inventariorest.dao;
import com.bave.inventariorest.model.RcvTransactions;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IRcvTransactionsDao  extends PagingAndSortingRepository<RcvTransactions,Long> {
}
