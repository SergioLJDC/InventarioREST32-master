package com.bave.inventariorest.controller;

import com.bave.inventariorest.model.MtlSerialNumbers;
import com.bave.inventariorest.service.MtlSerialNumbersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MtlSerialNumbersController {

    @Autowired
    MtlSerialNumbersService mtlSerialNumbersService;


    @GetMapping("/MtlSerialNumbers/getAllByShipmentHeaderIdInventoryItemId/{shipmentHeaderId}/{inventoryItemId}")
    List<MtlSerialNumbers> getAllByShipmentHeaderIdInventoryItemId(@PathVariable Long shipmentHeaderId,@PathVariable Long inventoryItemId){
        return mtlSerialNumbersService.getAllByShipmentHeaderIdInventoryItemId(shipmentHeaderId,inventoryItemId);
    }

}
