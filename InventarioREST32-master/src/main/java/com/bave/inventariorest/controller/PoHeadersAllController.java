package com.bave.inventariorest.controller;
import com.bave.inventariorest.model.PoHeadersAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bave.inventariorest.service.PoHeadersAllService;

import java.util.List;

@RestController
public class PoHeadersAllController {

    @Autowired
    private PoHeadersAllService poHeadersAllService;

    @GetMapping("/PoHeadersAll/getAll")
    List<PoHeadersAll> getAll(){
        return poHeadersAllService.findAll();

    }
    @GetMapping("/PoHeadersAll/getbyId/{po_header_id}")
    PoHeadersAll  getbyId(@PathVariable Long po_header_id){
        return poHeadersAllService.findOne(po_header_id);

    }

    @PostMapping("/PoHeadersAll/delete/{po_header_id}")
    void delete (@PathVariable Long po_header_id) {
        poHeadersAllService.delete(po_header_id);
    }
}
