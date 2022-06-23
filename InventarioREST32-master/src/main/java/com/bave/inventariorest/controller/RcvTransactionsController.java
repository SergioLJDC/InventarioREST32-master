package com.bave.inventariorest.controller;

import com.bave.inventariorest.model.RcvTransactions;
import com.bave.inventariorest.service.RcvTransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RcvTransactionsController {


    @Autowired
    RcvTransactionsService rcvTransactionsService;



    @PostMapping("/RcvTransactions/insert")
    public void insert(@RequestBody RcvTransactions rcvTransactions){

        rcvTransactionsService.insert(rcvTransactions);

    }


    @PostMapping("/RcvTransactions/delete/{transactionId}")
    public void delete(@PathVariable Long transactionId){

        rcvTransactionsService.delete(transactionId);

    }


    @GetMapping("/RcvTransactions/get/{transactionId}")
    public RcvTransactions get(@PathVariable Long transactionId){
        return rcvTransactionsService.get(transactionId);

    }



    @GetMapping("/RcvTransactions/getAllByShipment/{shipmentHeaderId}")
    public List<RcvTransactions> getAllByShipment(@PathVariable Long shipmentHeaderId){
        return rcvTransactionsService.getAllByShipment(shipmentHeaderId);

    }

    @GetMapping("/RcvTransactions/getAllByShipmentInventory/{shipmentHeaderId}/{inventoryItemId}")
    public List<RcvTransactions> getAllByShipmentInventory(@PathVariable Long shipmentHeaderId,@PathVariable Long inventoryItemId){
        return rcvTransactionsService.getAllByShipmentInventory(shipmentHeaderId,inventoryItemId);

    }


    @GetMapping("/RcvTransactions/getSegmentsByShipment/{shipmentHeaderId}")
    public List<String> getSegmentsByShipment(@PathVariable Long shipmentHeaderId){
        return rcvTransactionsService.getSegmentsByShipment(shipmentHeaderId);

    }


}
