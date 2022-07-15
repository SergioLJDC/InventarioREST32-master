package com.bave.inventariorest.controller;

import com.bave.inventariorest.model.DatosCabeceraRecepcion;
import com.bave.inventariorest.model.DatosRecepcion;
import com.bave.inventariorest.service.PoHeadersAllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatosRecepcionController {

    @Autowired
    private PoHeadersAllService poHeadersAllService;



    @GetMapping("/DatosCabeceraRecepcion/get/{poHeaderId}/{receiptNum}")
    DatosCabeceraRecepcion get(@PathVariable Long poHeaderId, @PathVariable Long receiptNum){

        return poHeadersAllService.get(poHeaderId,receiptNum)  ;

    }

    @GetMapping("/DatosRecepcion/getDatosRecepcion/{segment1}/{oc}/{receiptNum}/{poLineNum}")
    DatosRecepcion getDatosRecepcion(@PathVariable  String segment1,@PathVariable String oc,@PathVariable Long receiptNum,@PathVariable Long poLineNum){

        return poHeadersAllService.getDatosRecepcion(segment1,oc,receiptNum,poLineNum);
    }
}
