package com.bave.inventariorest.controller;

import com.bave.inventariorest.model.AttributoLote2;
import com.bave.inventariorest.service.AttributoLoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class AttributoLoteController {



    @Autowired
    AttributoLoteService attributoLoteService;
    @GetMapping("/AttributoLote/getAll2")
    public List<AttributoLote2> getAll(){
        return attributoLoteService.getAll();
    }



}
