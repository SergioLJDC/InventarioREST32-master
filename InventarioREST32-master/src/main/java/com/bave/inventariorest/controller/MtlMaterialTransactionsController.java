package com.bave.inventariorest.controller;

import com.bave.inventariorest.model.EntregaOrgsHeader;
import com.bave.inventariorest.model.MtlMaterialTransactions;
import com.bave.inventariorest.model.TransactionsDto;
import com.bave.inventariorest.service.MtlMaterialTransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MtlMaterialTransactionsController {

    @Autowired
    MtlMaterialTransactionsService mtlMaterialTransactionsService;


    @GetMapping("/MtlMaterialTransactions/get/{transactionId}")
    MtlMaterialTransactions get(@PathVariable Long transactionId){

        return mtlMaterialTransactionsService.get(transactionId);


    }

    @PostMapping("/MtlMaterialTransactions/insert")
    void insert(@RequestBody MtlMaterialTransactions mtlMaterialTransactions){


        mtlMaterialTransactionsService.insert(mtlMaterialTransactions);

    }

    @PostMapping("/MtlMaterialTransactions/delete/{transactionId}")
    void delete(@PathVariable Long transactionId){

        mtlMaterialTransactionsService.delete(transactionId);


    }

    @PostMapping("/MtlMaterialTransactions/deleteByShipmentHeaderId/{shipmentHeaderId}")
    void deleteByShipmentHeaderId(@PathVariable Long shipmentHeaderId){

        mtlMaterialTransactionsService.deleteByShipmentHeaderId(shipmentHeaderId);

    }

    @GetMapping("/MtlMaterialTransactions/getAllByShipmentHeaderId/{shipmentHeaderId}")
    List<MtlMaterialTransactions> getAllByShipmentHeaderId(@PathVariable Long shipmentHeaderId){

        return  mtlMaterialTransactionsService.getAllByShipmentHeaderId(shipmentHeaderId);

    }

    @GetMapping("/MtlMaterialTransactions/getAllByShipmentInventory/{shipmentHeaderId}/{inventoryItemId}")
    List<MtlMaterialTransactions> getAllByShipmentInventory(@PathVariable Long shipmentHeaderId,@PathVariable Long inventoryItemId){

        return mtlMaterialTransactionsService.getAllByShipmentInventory(shipmentHeaderId,inventoryItemId);


    }
    @GetMapping("/MtlMaterialTransactions/getAllByShipmentEntrega/{shipmentHeaderId}")
    List<MtlMaterialTransactions> getAllByShipmentEntrega(@PathVariable Long shipmentHeaderId){

        return mtlMaterialTransactionsService.getAllByShipmentEntrega(shipmentHeaderId);


    }

    @GetMapping("/MtlMaterialTransactions/getSegmentsByShipment/{shipmentHeaderId}")
    List<String> getSegmentsByShipment(@PathVariable Long shipmentHeaderId){

        return mtlMaterialTransactionsService.getSegmentsByShipment(shipmentHeaderId);

    }

    @GetMapping("/MtlMaterialTransactions/getAllEntregaOrgs")
    public List<EntregaOrgsHeader> getAllEntregaOrgs(){

        return mtlMaterialTransactionsService.getAllEntregaOrgs();
    }

    @GetMapping("/MtlMaterialTransactions/getEntregaOrgs/{shipmentHeaderId}")
    public EntregaOrgsHeader getEntregaOrgs(@PathVariable Long shipmentHeaderId){

        return mtlMaterialTransactionsService.getEntregaOrgs(shipmentHeaderId);
    }

    @GetMapping("/MtlMaterialTransactions/getTransactionsAll")
    public List< TransactionsDto> getTransactionAll(){
        return mtlMaterialTransactionsService.getTransactionAll();
    }

    @GetMapping("/MtlMaterialTransactions/getTransactions/{shipmentHeaderId}")
    public List<TransactionsDto> getTransaction(@PathVariable Long shipmentHeaderId){
        return mtlMaterialTransactionsService.getTransaction(shipmentHeaderId);
    }


}
