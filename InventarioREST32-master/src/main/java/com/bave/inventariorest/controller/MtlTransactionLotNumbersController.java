package com.bave.inventariorest.controller;


import com.bave.inventariorest.model.MtlTransactionLotNumbers;
import com.bave.inventariorest.service.MtlTransactionLotNumbersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MtlTransactionLotNumbersController {


    @Autowired
    MtlTransactionLotNumbersService mtlTransactionLotNumbersService;


    @GetMapping("/MtlTransactionLotNumbers/get/{transactionId}")
    MtlTransactionLotNumbers get(@PathVariable Long transactionId){
        return mtlTransactionLotNumbersService.get(transactionId);
    }



    @PostMapping("/MtlTransactionLotNumbers/insert")
    public void insert(@RequestBody MtlTransactionLotNumbers mtlTransactionLotNumbers){

        mtlTransactionLotNumbersService.insert(mtlTransactionLotNumbers);
    }

    @PostMapping("/MtlTransactionLotNumbers/deleteByShipmentHeaderId/{shipmentHeaderId}")
    public void deleteByShipmentHeaderId(@PathVariable Long shipmentHeaderId){
        mtlTransactionLotNumbersService.deleteByShipmentHeaderId(shipmentHeaderId);
    }


    @GetMapping("/MtlTransactionLotNumbers/getAllByShipmentHeaderId/{shipmentHeaderId}")
    public List<MtlTransactionLotNumbers> getAllByShipmentHeaderId(@PathVariable Long shipmentHeaderId){

        return mtlTransactionLotNumbersService.getAllByShipmentHeaderId(shipmentHeaderId);


    }
    @GetMapping("/MtlTransactionLotNumbers/getAllByShipmentHeaderIdInventoryItemId/{shipmentHeaderId}/{inventoryItemId}")
    public List<MtlTransactionLotNumbers> getAllByShipmentHeaderIdInventoryItemId(@PathVariable Long shipmentHeaderId,@PathVariable Long inventoryItemId){

        return mtlTransactionLotNumbersService.getAllByShipmentHeaderIdInventoryItemId(shipmentHeaderId,inventoryItemId);

    }



    }
