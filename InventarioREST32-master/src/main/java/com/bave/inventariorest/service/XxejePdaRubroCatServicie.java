package com.bave.inventariorest.service;


import com.bave.inventariorest.dao.XxejePdaRubroCatRepository;
import com.bave.inventariorest.model.XxejePdaRubroCat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XxejePdaRubroCatServicie {

    @Autowired
    XxejePdaRubroCatRepository xxejePdaRubroCatRepository;
    public List<XxejePdaRubroCat> findAll(){
        return  xxejePdaRubroCatRepository.findAll();
    }



    public XxejePdaRubroCat findAllById(String id){
        return xxejePdaRubroCatRepository.findAllById(id);
    }

}
