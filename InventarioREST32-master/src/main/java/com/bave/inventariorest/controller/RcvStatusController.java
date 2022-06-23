package com.bave.inventariorest.controller;

import com.bave.inventariorest.model.RcvStatus;
import com.bave.inventariorest.service.RcvStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RcvStatusController {


    @Autowired
    RcvStatusService rcvStatusService;

    @PostMapping("/RcvStatus/save")
    public void save(@RequestBody RcvStatus rcvStatus){

        rcvStatusService.save(rcvStatus);

    }

    @PostMapping("/RcvStatus/actualiza_estado/{estado}/{poheaderId}/{receiptnum}")
    public void actualiza_estado(@PathVariable int estado,@PathVariable Long poheaderId,@PathVariable Long receiptnum){

        rcvStatusService.actualiza_estado(estado,poheaderId,receiptnum);


    }




}
