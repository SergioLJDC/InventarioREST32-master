package com.bave.inventariorest.controller;

import com.bave.inventariorest.model.XxejePdaValoresAttLote;
import com.bave.inventariorest.service.XxejePdaValoresAttLoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@RestController
public class XxejePdaValoresAttLoteController {

    @PersistenceContext()
    private EntityManager entityManager;
    @Autowired
    XxejePdaValoresAttLoteService xxejePdaValoresAttLoteService;

    @GetMapping("/attLote/GetAll")
    List<XxejePdaValoresAttLote> findAll(){
        return  xxejePdaValoresAttLoteService.getAll();
    }


    @GetMapping("/attLote/ListaDeValoresByFlexId/{FlexId}")
    public List<String> ListaDeValoresByFlexId(@PathVariable Long FlexId){return  xxejePdaValoresAttLoteService.ListaDeValoresByFlexId(FlexId);}



    @GetMapping("/attLote/ListaDeValoresById/{Id}")
    public List<String> ValoresAttributoById(Long id){
        return xxejePdaValoresAttLoteService.ValoresAttributoById(id);
    }





}
