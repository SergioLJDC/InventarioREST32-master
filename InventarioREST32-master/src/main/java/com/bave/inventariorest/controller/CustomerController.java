package com.bave.inventariorest.controller;

import com.bave.inventariorest.model.Customer;
import com.bave.inventariorest.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;



    @PostMapping("/customer/insert")
   public void insert(@RequestBody Customer customer){
        customerService.insert( customer);
    }
}
