package com.bave.inventariorest.controller;


import com.bave.inventariorest.dao.IRcvHeadersInterfaceEntregaDao;
import com.bave.inventariorest.model.RcvHeadersInterfaceEntrega;
import com.bave.inventariorest.service.RcvHeadersInterfaceEntregaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RcvHeadersInterfaceEntregaController {


    @Autowired
    RcvHeadersInterfaceEntregaService interfaceEntregaService;


    @PostMapping("/RcvHeadersInterfaceEntrega/insert")
    public void insert(@RequestBody RcvHeadersInterfaceEntrega rcvHeadersInterfaceEntrega){

        interfaceEntregaService.insert(rcvHeadersInterfaceEntrega);

    }

}
