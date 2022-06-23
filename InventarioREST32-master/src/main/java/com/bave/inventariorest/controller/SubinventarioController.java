package com.bave.inventariorest.controller;

import com.bave.inventariorest.model.Subinventario;
import com.bave.inventariorest.service.SubinventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubinventarioController {

    @Autowired
    SubinventarioService subinventarioService;


    @GetMapping("/Subinventario/getAll")
    List<Subinventario> getAll(){
        return  subinventarioService.getAll();

    }

    @GetMapping("/Subinventario/getByCodigo/{codigo}")
    Subinventario getByCodigo(@PathVariable String codigo){

        return  subinventarioService.getByCodigo(codigo);
    }

    @GetMapping("/Subinventario/getAllByCiclico/{conteoCiclicoId}")
    List<Subinventario> getAllByCiclico(@PathVariable Long conteoCiclicoId){

        return  subinventarioService.getAllByCiclico(conteoCiclicoId);

    }



}
