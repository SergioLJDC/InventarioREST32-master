package com.bave.inventariorest.service;


import com.bave.inventariorest.dao.XxejePdaAtributosLoteRepository;
import com.bave.inventariorest.model.XxejePdaAtributosLote;
import com.bave.inventariorest.model.XxpdaLogUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class XxejePdaAtributosLoteService {
    @Autowired
    XxejePdaAtributosLoteRepository xxejePdaAtributosLoteRepository;


    @Transactional
    public List<XxejePdaAtributosLote> findAll(){return xxejePdaAtributosLoteRepository.findAll();}

    @Transactional
    public  List<XxejePdaAtributosLote> findAllById(long id){
        return xxejePdaAtributosLoteRepository.findAllById(id);
    }

    @Transactional
    public int Contador(String Categoria) {
        return xxejePdaAtributosLoteRepository.Contador(Categoria);
    };

    @Transactional
    public List<String> Categorias(){
        return xxejePdaAtributosLoteRepository.Categorias();

    }


    @Transactional
    public List<XxejePdaAtributosLote> objCategorias(String Categoria){
        return  xxejePdaAtributosLoteRepository.objCategorias(Categoria);
    }


    @Transactional
    public int IdAtt(String Att ,String Categoria){
        return xxejePdaAtributosLoteRepository.IdAtt(Att,Categoria);
    }





}
