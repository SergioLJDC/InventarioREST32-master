package com.bave.inventariorest.controller;

import com.bave.inventariorest.model.MtlTransactionsLotsIfaceEntrega;
import com.bave.inventariorest.service.MtlTransactionsLotsIfaceEntregaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MtlTransactionsLotsIfaceEntregaController {


    @Autowired
    MtlTransactionsLotsIfaceEntregaService mtlTransactionsLotsIfaceEntregaService;


    @PostMapping("/MtlTransactionsLotsIfaceEntrega/insert")
    void insert(@RequestBody MtlTransactionsLotsIfaceEntrega mtlTransactionsLotsIfaceEntrega){

        mtlTransactionsLotsIfaceEntregaService.insert(mtlTransactionsLotsIfaceEntrega);

    }
}
