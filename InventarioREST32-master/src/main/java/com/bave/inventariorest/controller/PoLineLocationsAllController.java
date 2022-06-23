package com.bave.inventariorest.controller;

import com.bave.inventariorest.model.PoLineLocationsAll;
import com.bave.inventariorest.service.PoLineLocationsAllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PoLineLocationsAllController {

    @Autowired
    PoLineLocationsAllService poLineLocationsAllService;


    @PostMapping("/PoLineLocationsAll/insert")
    void insert(@RequestBody PoLineLocationsAll poLineLocationsAll){

        poLineLocationsAllService.insert(poLineLocationsAll);
    }

    @PostMapping("/PoLineLocationsAll/delete/{poHeaderId}")
    void delete(@PathVariable Long poHeaderId){

        poLineLocationsAllService.delete(poHeaderId);
    }

    @GetMapping("/PoLineLocationsAll/getById/{lineLocationId}")
    PoLineLocationsAll getById(@PathVariable Long lineLocationId){

        return  poLineLocationsAllService.getById(lineLocationId);
    }


}
