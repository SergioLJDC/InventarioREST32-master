package com.bave.inventariorest.controller;

import com.bave.inventariorest.MultipleKey.RcvTransactionsId;
import com.bave.inventariorest.model.RcvTransactionsInterfaceNew;
import com.bave.inventariorest.service.RcvTransactionsInterfaceNewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RcvTransactionsInterfaceNewController {


    @Autowired
    RcvTransactionsInterfaceNewService rcvTransactionsInterfaceNewService;

    @PostMapping("/RcvTransactionsInterfaceNewController/insert")
    public void insert(@RequestBody RcvTransactionsInterfaceNew rcvTransactionsInterfaceNew){
        rcvTransactionsInterfaceNewService.insert(rcvTransactionsInterfaceNew);
    }

    @DeleteMapping("/RcvTransactionsInterfaceNewController/{transaction}/{id}")
    public void deleteTransacion(@PathVariable Long transaction ,@PathVariable Long id){
        rcvTransactionsInterfaceNewService.deleteTransacion(transaction,id);
    }



}
