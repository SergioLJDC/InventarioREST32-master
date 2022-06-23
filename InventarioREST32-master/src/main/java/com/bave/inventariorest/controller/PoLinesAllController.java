package com.bave.inventariorest.controller;


import com.bave.inventariorest.model.PoLinesAll;
import com.bave.inventariorest.service.PoLinesAllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PoLinesAllController {


    @Autowired
    PoLinesAllService poLinesAllService;


    @GetMapping("/poLinesAll/getLinea/{inventoryItemId}/{poHeaderId}/{poLineNum}")
    PoLinesAll getLinea(@PathVariable Long inventoryItemId,@PathVariable Long poHeaderId,@PathVariable Long poLineNum){


        return poLinesAllService.getLinea(inventoryItemId,poHeaderId,poLineNum);

    }

    @GetMapping("/poLinesAll/getLines/{inventoryItemId}/{poHeaderId}")
    List<PoLinesAll> getLines(@PathVariable Long inventoryItemId,@PathVariable Long poHeaderId){

        return poLinesAllService.getLines(inventoryItemId,poHeaderId);

    }
    @GetMapping("/poLinesAll/getById/{poLineId}")
    PoLinesAll getById(@PathVariable Long poLineId){

        return poLinesAllService.getById(poLineId);

    }


    @PostMapping("/poLinesAll/deleteByPoHeaderId/{poHeaderId}")
    void deleteByPoHeaderId(@PathVariable Long poHeaderId){

        poLinesAllService.deleteByPoHeaderId(poHeaderId);

    }

    @PostMapping("/poLinesAll/insert")
    void insert(@RequestBody PoLinesAll poLinesAll){

        poLinesAllService.insert(poLinesAll);

    }



}
