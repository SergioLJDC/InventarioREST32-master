package com.bave.inventariorest.controller;

import com.bave.inventariorest.model.MtlPhysicalInventories;
import com.bave.inventariorest.service.MtlPhysicalInventoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MtlPhysicalInventoriesController {


@Autowired
    MtlPhysicalInventoriesService mtlPhysicalInventoriesService;

    @PostMapping("/MtlPhysicalInventories/insert")
    void insert(@RequestBody MtlPhysicalInventories mtlPhysicalInventories){

        mtlPhysicalInventoriesService.insert(mtlPhysicalInventories);

    }

    @PostMapping("/MtlPhysicalInventories/delete/{id}")
    void delete(@PathVariable Long id){

        mtlPhysicalInventoriesService.delete(id);

    }

    @GetMapping("/MtlPhysicalInventories/get/{id}")
     MtlPhysicalInventories get(@PathVariable Long id){

        return mtlPhysicalInventoriesService.get(id);

    }
    @GetMapping("/MtlPhysicalInventories/getAll")
    List<MtlPhysicalInventories> getAll(){

        return mtlPhysicalInventoriesService.getAll();

    }

}
