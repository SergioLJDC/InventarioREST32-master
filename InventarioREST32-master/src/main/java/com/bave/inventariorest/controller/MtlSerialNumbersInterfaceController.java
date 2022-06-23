package com.bave.inventariorest.controller;


import com.bave.inventariorest.model.MtlSerialNumbersInterface;
import com.bave.inventariorest.service.MtlSerialNumbersInterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MtlSerialNumbersInterfaceController {


@Autowired
    MtlSerialNumbersInterfaceService mtlSerialNumbersInterfaceService;


@GetMapping("/MtlSerialNumbersInterface/getAllByInterfaceTransactionId/{InterfaceTransactionId}")
 public MtlSerialNumbersInterface getAllByInterfaceTransactionId(@PathVariable Long InterfaceTransactionId){


    return mtlSerialNumbersInterfaceService.getAllByInterfaceTransactionId(InterfaceTransactionId);

}


@PostMapping("/MtlSerialNumbersInterface/insert")

public void insert(@RequestBody MtlSerialNumbersInterface mtlSerialNumbersInterface){

    mtlSerialNumbersInterfaceService.insert(mtlSerialNumbersInterface);

}


@PostMapping("/MtlSerialNumbersInterface/delete/{transactionInterfaceId}")
public void delete(@PathVariable Long transactionInterfaceId){

    mtlSerialNumbersInterfaceService.delete(transactionInterfaceId);

}

    @PostMapping("/MtlSerialNumbersInterface/deleteByInterfaceTransactionId/{interfaceTransactionId}")
    public void deleteByInterfaceTransactionId(@PathVariable Long interfaceTransactionId){

        mtlSerialNumbersInterfaceService.deleteByInterfaceTransactionId(interfaceTransactionId);

    }

    @GetMapping("/MtlSerialNumbersInterface/getAll/{transactionInterfaceId}")
    public List<MtlSerialNumbersInterface> getAll(@PathVariable Long transactionInterfaceId){

        return mtlSerialNumbersInterfaceService.getAll(transactionInterfaceId);

    }
    @GetMapping("/MtlSerialNumbersInterface/get/{transactionInterfaceId}")
    public MtlSerialNumbersInterface get(@PathVariable Long transactionInterfaceId){

        return mtlSerialNumbersInterfaceService.get(transactionInterfaceId);
    }

}
