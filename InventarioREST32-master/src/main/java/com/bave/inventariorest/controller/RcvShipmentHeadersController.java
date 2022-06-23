package com.bave.inventariorest.controller;


import com.bave.inventariorest.model.RcvShipmentHeaders;
import com.bave.inventariorest.service.RcvShipmentHeadersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RcvShipmentHeadersController {


    @Autowired
    RcvShipmentHeadersService rcvShipmentHeadersService;



    @PostMapping("/RcvShipmentHeaders/insert")
    public void insert(@RequestBody RcvShipmentHeaders rcvShipmentHeaders){
        rcvShipmentHeadersService.insert(rcvShipmentHeaders);

    }

    @GetMapping("/RcvShipmentHeaders/get/{shipmentHeaderId}")
    public RcvShipmentHeaders get(@PathVariable Long shipmentHeaderId){

        return rcvShipmentHeadersService.get(shipmentHeaderId);

    }
    @GetMapping("/RcvShipmentHeaders/getAll")
    public List<RcvShipmentHeaders> getAll(){

        return rcvShipmentHeadersService.getAll();

    }


}
