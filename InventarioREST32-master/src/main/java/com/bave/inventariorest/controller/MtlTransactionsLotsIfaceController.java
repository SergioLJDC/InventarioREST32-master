package com.bave.inventariorest.controller;

import com.bave.inventariorest.model.MtlTransactionsLotsIface;
import com.bave.inventariorest.service.MtlTransactionsLotsIfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MtlTransactionsLotsIfaceController {

    @Autowired
    MtlTransactionsLotsIfaceService mtlTransactionsLotsIfaceService;


    @GetMapping("/MtlTransactionsLotsIface/getByInterfaceTransactionId/{InterfaceTransactionId}")
    public MtlTransactionsLotsIface getByInterfaceTransactionId(@PathVariable Long InterfaceTransactionId){

      return  mtlTransactionsLotsIfaceService.getByInterfaceTransactionId(InterfaceTransactionId);


    }

    @PostMapping("/MtlTransactionsLotsIface/insert")
    public void insert(@RequestBody MtlTransactionsLotsIface mtlTransactionsLotsIface){



        mtlTransactionsLotsIfaceService.insert(mtlTransactionsLotsIface);


    }


    @GetMapping("/MtlTransactionsLotsIface/get/{transactionInterfaceId}")
    public MtlTransactionsLotsIface get(@PathVariable Long transactionInterfaceId) {

    return    mtlTransactionsLotsIfaceService.get(transactionInterfaceId);

    }

    @GetMapping("/MtlTransactionsLotsIface/getAll/{transactionInterfaceId}")
    public MtlTransactionsLotsIface getAll(@PathVariable Long transactionInterfaceId) {

        return    mtlTransactionsLotsIfaceService.get(transactionInterfaceId);

    }


}
