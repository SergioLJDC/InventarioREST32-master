package com.bave.inventariorest.dao;

import com.bave.inventariorest.MultipleKey.CustomerId;
import com.bave.inventariorest.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomer extends JpaRepository<Customer,CustomerId> {

}
