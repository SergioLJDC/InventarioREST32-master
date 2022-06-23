package com.bave.inventariorest.service;

import com.bave.inventariorest.dao.XxejePdaValoresAttLoteRepository;
import com.bave.inventariorest.model.XxejePdaValoresAttLote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class XxejePdaValoresAttLoteService {

    @Autowired
    XxejePdaValoresAttLoteRepository xxejePdaValoresAttLoteRepository;


    @Transactional
    public List<XxejePdaValoresAttLote> getAll(){
        return  xxejePdaValoresAttLoteRepository.findAll();
    }

    @Transactional
    public List<String> ListaDeValoresByFlexId(Long FlexId){
        return xxejePdaValoresAttLoteRepository.ListaDeValoresByFlexId(FlexId);
    }

    @Transactional
    public List<String> ValoresAttributoById(Long id){
        return xxejePdaValoresAttLoteRepository.ValoresAttributoById(id);
    }


}
