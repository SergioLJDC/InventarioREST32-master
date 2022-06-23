package com.bave.inventariorest.controller;

import com.bave.inventariorest.model.XxejePdaRubroCat;
import com.bave.inventariorest.service.XxejePdaRubroCatServicie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class XxejePdaRubroCatController {
    @Autowired
    XxejePdaRubroCatServicie xxejePdaRubroCatServicie;

    @GetMapping("/rubro/GetAll")
    List<XxejePdaRubroCat> findAll(){
        return xxejePdaRubroCatServicie.findAll();
    }

    @GetMapping("/rubro/findAllById/{id}")
    XxejePdaRubroCat findAllById(@PathVariable String id){
        return xxejePdaRubroCatServicie.findAllById(id);
    }
}
