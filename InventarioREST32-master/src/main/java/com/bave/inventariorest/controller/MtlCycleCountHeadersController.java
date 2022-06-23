package com.bave.inventariorest.controller;

import com.bave.inventariorest.model.MtlCycleCountHeaders;
import com.bave.inventariorest.service.MtlCycleCountHeadersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MtlCycleCountHeadersController {

    @Autowired
    MtlCycleCountHeadersService mtlCycleCountHeadersService;


    @PostMapping("/MtlCycleCountHeaders/insert")
    void insert(@RequestBody MtlCycleCountHeaders mtlCycleCountHeaders) {

        mtlCycleCountHeadersService.insert(mtlCycleCountHeaders);

    }

    @PostMapping("/MtlCycleCountHeaders/delete/{cycle_count_header_id}")
    void delete(@PathVariable Long cycle_count_header_id) {

        mtlCycleCountHeadersService.delete(cycle_count_header_id);

    }

    @GetMapping("/MtlCycleCountHeaders/get/{cycle_count_header_id}")
    MtlCycleCountHeaders get(@PathVariable Long cycle_count_header_id) {


       return mtlCycleCountHeadersService.get(cycle_count_header_id);

}

    @GetMapping("/MtlCycleCountHeaders/getAll")
    List<MtlCycleCountHeaders> getAll(){

        return mtlCycleCountHeadersService.getAll();

    }






}
