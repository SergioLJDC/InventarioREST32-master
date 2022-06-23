package com.bave.inventariorest.controller;

import com.bave.inventariorest.service.XXPDA_HOMOLOGACION_VService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XXPDA_HOMOLOGACION_VController {


    @Autowired
    XXPDA_HOMOLOGACION_VService xxpda_homologacion_vService;



    @GetMapping("/XXPDA_HOMOLOGACION_V/getHomologacion/{codBarra}")
    String getHomologacion(@PathVariable String codBarra){

        return  xxpda_homologacion_vService.getHomologacion(codBarra);

    }


}
