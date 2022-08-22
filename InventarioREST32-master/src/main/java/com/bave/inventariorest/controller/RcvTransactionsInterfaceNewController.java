package com.bave.inventariorest.controller;

import com.bave.inventariorest.MultipleKey.RcvTransactionsId;
import com.bave.inventariorest.model.RcvTransactionInterfaceDesModel;
import com.bave.inventariorest.model.RcvTransactionInterfaceId;
import com.bave.inventariorest.model.RcvTransactionsInterface;
import com.bave.inventariorest.model.RcvTransactionsInterfaceNew;
import com.bave.inventariorest.service.RcvTransactionsInterfaceNewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RcvTransactionsInterfaceNewController {


    @Autowired
    RcvTransactionsInterfaceNewService rcvTransactionsInterfaceNewService;

    @PostMapping("/RcvTransactionsInterfaceNewController/insert")
    public void insert(@RequestBody RcvTransactionsInterfaceNew rcvTransactionsInterfaceNew) {
        rcvTransactionsInterfaceNewService.insert(rcvTransactionsInterfaceNew);
    }

    @DeleteMapping("/RcvTransactionsInterfaceNewController/{transaction}/{id}")
    public void deleteTransacion(@PathVariable Long transaction, @PathVariable Long id) {
        rcvTransactionsInterfaceNewService.deleteTransacion(transaction, id);
    }
    @GetMapping("/RcvTransactionsInterfaceNewController/getSumaEntregadosByParentTransactionId/{ParenTransactionID}")
    int getSumaEntregadosByParentTransactionId(@PathVariable int ParenTransactionID){
        return rcvTransactionsInterfaceNewService.getSumaEntregadosByParentTransactionId(ParenTransactionID);
    }

    @GetMapping("/RcvTransactionsInterfaceNewController/getRcvTransactionsInterfaceByParentTransactionId/{ParenTransactionID}")
    List<RcvTransactionsInterface> getRcvTransactionsInterfaceByParentTransactionId(@PathVariable int ParenTransactionID){
        return rcvTransactionsInterfaceNewService.getRcvTransactionsInterfaceByParentTransactionId(ParenTransactionID);
    }

    @GetMapping("/RcvTransactionsInterfaceNewController/test/{ParenTransactionID}")
    List<RcvTransactionInterfaceId> test(@PathVariable int ParenTransactionID){
        return rcvTransactionsInterfaceNewService.test(ParenTransactionID);



    }

    @GetMapping("/RcvTransactionsInterfaceNewController/getToShipment/{ParenTransactionID}")
    public  List<RcvTransactionsInterfaceNew> getToShipment(@PathVariable Long  Shipment){
        return rcvTransactionsInterfaceNewService.getToShipment(Shipment);
    }

    @GetMapping("/RcvTransactionsInterfaceNewController/getByShipmentHeaderId/{Shipment}")
    public List<RcvTransactionsInterfaceNew> getByShipmentHeaderId(@PathVariable Long Shipment){
        return rcvTransactionsInterfaceNewService.getByShipmentHeaderId(Shipment);
    }

}
