package com.bave.inventariorest.controller;

import com.bave.inventariorest.model.XxejePdaAtributosLote;
import com.bave.inventariorest.service.XxejePdaAtributosLoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@RestController
public class XxejePdaAtributosLoteController {

    @Autowired
    XxejePdaAtributosLoteService xxejePdaAtributosLoteService;

    @PersistenceContext()
    private EntityManager entityManager;


   @GetMapping("/lote/All")
    public List<XxejePdaAtributosLote> findAll() {
      return xxejePdaAtributosLoteService.findAll();
    }


    @GetMapping("/lote/{id}")
    public List<XxejePdaAtributosLote> findAllById(@PathVariable long id){
        return xxejePdaAtributosLoteService.findAllById(id);

    }

    @GetMapping("/lote/Cantidad/{Categoria}")
    public int Contador(@PathVariable String Categoria){
       return xxejePdaAtributosLoteService.Contador(Categoria);
    }

    @GetMapping("/lote/Categorias")
    public List<String> Categorias(){
       return  xxejePdaAtributosLoteService.Categorias();
    }

    @GetMapping("/lote/ListCategorias/{Categoria}")
    public List<XxejePdaAtributosLote> ListCategorias(@PathVariable String Categoria){
       return  xxejePdaAtributosLoteService.objCategorias(Categoria);
    }

    @GetMapping("/lote/id/{Att}/{Categoria}")
    public int IdAtt(@PathVariable String Att ,@PathVariable String Categoria){
       return xxejePdaAtributosLoteService.IdAtt(Att,Categoria);
    }

}





