package com.bave.inventariorest.service;

import com.bave.inventariorest.dao.ICustomer;
import com.bave.inventariorest.dao.IMtlMaterialTransactionsDao;
import com.bave.inventariorest.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Service
public class CustomerService {

    @Autowired
    ICustomer iCustomer;


    @PersistenceContext()
    private EntityManager entityManager;


    public void insert(Customer customer){

        iCustomer.save(customer);
    }

}
