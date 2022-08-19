package com.bave.inventariorest.controller;

import java.util.List;

import com.bave.inventariorest.model.RcvTransactionsInterface;
import com.bave.inventariorest.service.RcvTransactionsInterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RcvTransactionsInterfaceController {


    @Autowired
    private RcvTransactionsInterfaceService rcvTransactionsInterfaceService;





    //RCV_TRANSACTIONS_INTERFACE METHODS
    @GetMapping("/RcvTransactionsInterface/getArticulos/{id}")
    List<RcvTransactionsInterface> getArticulos(@PathVariable Long id){
        return rcvTransactionsInterfaceService.getArticulos(id);

    }

    @PostMapping("/RcvTransactionsInterface/insert")
    void insert(@RequestBody RcvTransactionsInterface rcvTransactionsInterface){
        rcvTransactionsInterfaceService.insert(rcvTransactionsInterface);

    }
    @PostMapping("/RcvTransactionsInterface/delete/{interfaceTransactionId}")
    void delete(@PathVariable Long interfaceTransactionId){
        rcvTransactionsInterfaceService.delete(interfaceTransactionId);

    }
    @PostMapping("/RcvTransactionsInterface/deleteByHeaderInterfaceId/{headerInterfaceId}")
    void deleteByHeaderInterfaceId(@PathVariable Long headerInterfaceId){
        rcvTransactionsInterfaceService.deleteByHeaderInterfaceId(headerInterfaceId);

    }

    @GetMapping("/RcvTransactionsInterface/get/{headerInterfaceId}/{codigoSigle}/{poLineId}")
    RcvTransactionsInterface get(@PathVariable Long headerInterfaceId,@PathVariable String codigoSigle,@PathVariable Long poLineId){

        return rcvTransactionsInterfaceService.get(headerInterfaceId,codigoSigle,poLineId);
    }


    @GetMapping("/RcvTransactionsInterface/getByTransactionId/{transactionId}")
    RcvTransactionsInterface getByTransactionId(@PathVariable Long transactionId){

        return rcvTransactionsInterfaceService.getByTransactionId(transactionId);

    }


    @GetMapping("/RcvTransactionsInterface/getByInterfaceTransactionId/{interfaceTransactionId}")
    RcvTransactionsInterface getByInterfaceTransactionId(@PathVariable  Long interfaceTransactionId){

        return rcvTransactionsInterfaceService.getByInterfaceTransactionId(interfaceTransactionId);

    }

    @GetMapping("/RcvTransactionsInterface/getAllByHeader/{headerInterfaceId}")
    List<RcvTransactionsInterface> getAllByHeader(@PathVariable Long headerInterfaceId){

        return rcvTransactionsInterfaceService.getAllByHeader((headerInterfaceId));

    }
    @GetMapping("/RcvTransactionsInterface/getAllByHeaderV2/{headerInterfaceId}")
    List<RcvTransactionsInterface> getAllByHeaderV2(@PathVariable Long headerInterfaceId){

        return rcvTransactionsInterfaceService.getAllByHeaderV2((headerInterfaceId));

    }

    @GetMapping("/RcvTransactionsInterface/getAll")
    List<RcvTransactionsInterface> getAll(){

        return rcvTransactionsInterfaceService.getAll();

    }

    @GetMapping("/RcvTransactionsInterface/getbyShipmentHeaderId/{shipment_header_id}")
    List<RcvTransactionsInterface> getbyShipmentHeaderId(@PathVariable Long shipment_header_id){

        return rcvTransactionsInterfaceService.getbyShipmentHeaderId(shipment_header_id);

    }


    @GetMapping("/RcvTransactionsInterface/getPolineasBysegment/{segment}/{poHeaderId}")
    List<Long> getPolineasBysegment( @PathVariable String segment , @PathVariable Long poHeaderId){
        return rcvTransactionsInterfaceService.getPolineasBysegmentAndPoHeader(segment,poHeaderId);



    }

    @GetMapping("/RcvTransactionsInterface/getSumaEntregados/{ParenTransactionID}")
    int getSumaEntregadosByParentTransactionId(@PathVariable int ParenTransactionID){
        return  rcvTransactionsInterfaceService.getSumaEntregadosByParentTransactionId(ParenTransactionID);
    }


    @GetMapping("/RcvTransactionsInterface/List/{ParenTransactionID}")
    List<RcvTransactionsInterface>  getRcvTransactionsInterfaceByParentTransactionId(@PathVariable int ParenTransactionID){
        return rcvTransactionsInterfaceService.getRcvTransactionsInterfaceByParentTransactionId(ParenTransactionID);
    }


}
