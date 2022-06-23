package com.bave.inventariorest.controller;

import com.bave.inventariorest.model.OrganizacionPrincipal;
import com.bave.inventariorest.service.OrganizacionPrincipalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrganizacionPrincipalController {

    @Autowired
    private OrganizacionPrincipalService organizacionPrincipalService;

    @GetMapping("/OrganizacionPrincipal/getId/{id}")
    OrganizacionPrincipal getId(@PathVariable Long id){

        return  organizacionPrincipalService.getId(id);

    }

    @GetMapping("/OrganizacionPrincipal/get")
    OrganizacionPrincipal getAll(){

        return  organizacionPrincipalService.getOneLimited1();

    }



    @PostMapping("/OrganizacionPrincipal/insert")

    void insert(@RequestBody OrganizacionPrincipal organizacionPrincipal){

        organizacionPrincipalService.insert(organizacionPrincipal);


    }


}
