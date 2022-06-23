package com.bave.inventariorest.controller;

import com.bave.inventariorest.model.Organizacion;
import com.bave.inventariorest.service.OrganizacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrganizacionController {


@Autowired
private OrganizacionService organizacionService;


@PostMapping("/Organizacion/insert")
public void insert(@RequestBody Organizacion organizacion){

   organizacionService.insert(organizacion);
}
@PostMapping("/Organizacion/delete/{idOrganizacion}")
public void delete(@PathVariable Long idOrganizacion) {

    organizacionService.delete(idOrganizacion);
}

@GetMapping("/Organizacion/get/{idOrganizacion}/{code}/{transferencia}")
public Organizacion get(@PathVariable Long idOrganizacion,@PathVariable String code,@PathVariable String transferencia){

    return organizacionService.get(idOrganizacion,code,transferencia);

}
@GetMapping("/Organizacion/getByCodeDestino/{code}")
public Organizacion getByCodeDestino(@PathVariable String code){

    return organizacionService.getByCodeDestino(code);

}
@GetMapping("/Organizacion/getByiDDestino/{idOrganizacion}")
public Organizacion getByiDDestino(@PathVariable Long idOrganizacion){

    return organizacionService.getByiDDestino(idOrganizacion);

}
@GetMapping("/Organizacion/getAllDestino")
public List<Organizacion> getAllDestino(){

    return organizacionService.getAllDestino();

}

}
