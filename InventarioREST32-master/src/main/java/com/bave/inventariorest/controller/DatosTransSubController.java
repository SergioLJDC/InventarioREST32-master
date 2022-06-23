package com.bave.inventariorest.controller;

import com.bave.inventariorest.model.DatosTransSubinv;
import com.bave.inventariorest.model.DatosTransSubinvDetalle;
import com.bave.inventariorest.service.DatosTransSubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DatosTransSubController {

@Autowired
    private DatosTransSubService datosTransSubService;


    @GetMapping("/DatosTransSub/getTransSubinv")
    public List<DatosTransSubinv> getTransSubinv(){

        return datosTransSubService.getTransSubinv();


    }

    @GetMapping("/DatosTransSub/getTransferencias/{transactionReference}")
    public List<DatosTransSubinvDetalle> getTransferencias(@PathVariable String transactionReference){

        return datosTransSubService.getTransferencias(transactionReference);

    }

}
