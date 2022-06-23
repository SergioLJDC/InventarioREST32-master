package com.bave.inventariorest.controller;

import com.bave.inventariorest.model.MtlSerialNumbersInterfaceEntrega;
import com.bave.inventariorest.service.MtlSerialNumbersInterfaceEntregaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MtlSerialNumbersInterfaceEntregaController {

    @Autowired
    MtlSerialNumbersInterfaceEntregaService mtlSerialNumbersInterfaceEntregaService;

    @PostMapping("/MtlSerialNumbersInterfaceEntrega/insert")
    void insert(@RequestBody MtlSerialNumbersInterfaceEntrega mtlSerialNumbersInterfaceEntrega){

        mtlSerialNumbersInterfaceEntregaService.insert(mtlSerialNumbersInterfaceEntrega);
    }



}
