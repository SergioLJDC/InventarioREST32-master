package com.bave.inventariorest.controller;


import com.bave.inventariorest.model.RcvHeadersInterface;
import com.bave.inventariorest.service.RcvHeadersInterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RcvHeadersInterfaceController {

    @Autowired
    private RcvHeadersInterfaceService rcvHeadersInterfaceService;


    @PostMapping("/RcvHeadersInterface/insert")
    void insert(@RequestBody RcvHeadersInterface rcvHeadersInterface) {
        rcvHeadersInterfaceService.insert(rcvHeadersInterface);

    }
    @GetMapping("/RcvHeadersInterface/get/{headerInterfaceId}")
    RcvHeadersInterface get(@PathVariable Long headerInterfaceId) {
        return rcvHeadersInterfaceService.get(headerInterfaceId);

    }
    @PostMapping("/RcvHeadersInterface/deleteByHeaderInterfaceId/{headerInterfaceId}")
    void deleteByHeaderInterfaceId(@PathVariable Long headerInterfaceId){

        rcvHeadersInterfaceService.deleteByHeaderInterfaceId(headerInterfaceId);

    }

    @GetMapping("/RcvHeadersInterface/existe/{headerInterfaceId}")
    Long existe(@PathVariable Long headerInterfaceId) {

        return rcvHeadersInterfaceService.existe(headerInterfaceId);

    }


}
