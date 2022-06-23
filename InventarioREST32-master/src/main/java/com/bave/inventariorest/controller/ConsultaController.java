package com.bave.inventariorest.controller;


import com.bave.inventariorest.model.ConsultaItem;
import com.bave.inventariorest.model.ConsultaResumenItem;
import com.bave.inventariorest.service.ConsultaItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsultaController {

    @Autowired
    ConsultaItemService consultaItemService;


    @GetMapping("/ConsultaItem/getAllByItem/{inventoryItemId}")
    List<ConsultaItem> getAllByItem(@PathVariable Long inventoryItemId){

        return consultaItemService.getAllByItem(inventoryItemId);

    }
    @GetMapping("/ConsultaItem/getAllBySubinventory/{subinventoryCode}")
    List<ConsultaItem> getAllBySubinventory(@PathVariable String subinventoryCode){

        return consultaItemService.getAllBySubinventory(subinventoryCode);

    }

    @GetMapping("/ConsultaItem/getAllBySubinventoryItem/{subinventoryCode}/{inventoryItemId}")
    List<ConsultaItem> getAllBySubinventoryItem(@PathVariable String subinventoryCode, @PathVariable Long inventoryItemId) {

        return consultaItemService.getAllBySubinventoryItem(subinventoryCode,inventoryItemId);


    }

    @GetMapping("/ConsultaResumenItem/getAllBySubinventory/{subinventoryCode}")
    List<ConsultaResumenItem> getAllBySubinventoryResumen(@PathVariable String subinventoryCode){

        return consultaItemService.getAllBySubinventoryResumen(subinventoryCode);

    }

}
