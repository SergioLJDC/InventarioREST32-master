package com.bave.inventariorest.controller;

import com.bave.inventariorest.model.RcvTransactionsInterfaceEntrega;
import com.bave.inventariorest.service.RcvTransactionsInterfaceEntregaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RcvTransactionsInterfaceEntregaController {

@Autowired
    RcvTransactionsInterfaceEntregaService rcvTransactionsInterfaceEntregaService;

    @PostMapping("/RcvTransactionsInterfaceEntrega/insert")
    void insert(@RequestBody RcvTransactionsInterfaceEntrega rcvTransactionsInterfaceEntrega ){

        rcvTransactionsInterfaceEntregaService.insert(rcvTransactionsInterfaceEntrega);


    }


}
