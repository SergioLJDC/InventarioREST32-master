package com.bave.inventariorest.controller;

import com.bave.inventariorest.model.PoDistributionsAll;
import com.bave.inventariorest.service.PoDistributionsAllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PoDistributionsAllController {


    @Autowired
    PoDistributionsAllService poDistributionsAllService;


    @PostMapping("/PoDistributionsAll/insert")
    void insert(@RequestBody PoDistributionsAll poDistributionsAll){

        poDistributionsAllService.insert(poDistributionsAll);

    }

    @PostMapping("/PoDistributionsAll/delete/{poHeaderId}")
    void delete(@PathVariable Long poHeaderId){

        poDistributionsAllService.delete(poHeaderId);

    }

    @GetMapping("/PoDistributionsAll/getById/{poDistributionId}")
    PoDistributionsAll getById(@PathVariable Long poDistributionId){

        return poDistributionsAllService.getById(poDistributionId);

    }

}
