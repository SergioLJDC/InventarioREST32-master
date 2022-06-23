package com.bave.inventariorest.controller;

import com.bave.inventariorest.model.MtlPhysicalSubinventories;
import com.bave.inventariorest.service.MtlPhysicalSubinventoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MtlPhysicalSubinventoriesController {

@Autowired
    MtlPhysicalSubinventoriesService mtlPhysicalSubinventoriesService;




@PostMapping("/MtlPhysicalSubinventories/insert")
void insert(@RequestBody MtlPhysicalSubinventories mtlPhysicalSubinventories){

    mtlPhysicalSubinventoriesService.insert(mtlPhysicalSubinventories);

}

@PostMapping("/MtlPhysicalSubinventories/deleteByPhysicalInventory/{physicalInventoryId}")
void deleteByPhysicalInventory(@PathVariable Long physicalInventoryId){


    mtlPhysicalSubinventoriesService.deleteByPhysicalInventory(physicalInventoryId);

}

@GetMapping("/MtlPhysicalSubinventories/getSubinventories/{physicalInventoryId}")
List<MtlPhysicalSubinventories> getSubinventories(@PathVariable Long physicalInventoryId){

    return mtlPhysicalSubinventoriesService.getSubinventories(physicalInventoryId);

    }


}
