package com.bave.inventariorest.controller;

import com.bave.inventariorest.model.MtlStatus;
import com.bave.inventariorest.service.MtlStatusServicie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MtlStatusController {

    @Autowired
    MtlStatusServicie mtlStatusServicie;


    @PostMapping("/MtlStatusController/insert")
    void insert(@RequestBody MtlStatus mtlStatus){

        mtlStatusServicie.insert(mtlStatus);
    }
}
