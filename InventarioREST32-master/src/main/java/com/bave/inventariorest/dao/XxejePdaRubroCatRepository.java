package com.bave.inventariorest.dao;

import com.bave.inventariorest.model.XxejePdaRubroCat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface XxejePdaRubroCatRepository extends JpaRepository<XxejePdaRubroCat, String> {


    List<XxejePdaRubroCat> findAll();


    @Query(value = "SELECT XPRC.* FROM XXEJE_PDA_RUBRO_CAT XPRC where XPRC.RUBRO =  ?1",nativeQuery = true)
    XxejePdaRubroCat findAllById(String id);


}