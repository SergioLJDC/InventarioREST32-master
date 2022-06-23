package com.bave.inventariorest.controller;

import com.bave.inventariorest.model.Localizador;
import com.bave.inventariorest.service.LocalizadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LocalizadorController {

    @Autowired
    LocalizadorService localizadorService;


    @GetMapping("/Localizador/getLocalizadoresBySubinventario/{subinventarioCodigo}")
    List<Localizador> getLocalizadoresBySubinventario(@PathVariable  String subinventarioCodigo){

        return localizadorService.getLocalizadoresBySubinventario(subinventarioCodigo);

    }

    @GetMapping("/Localizador/get/{localizador}")
    Long get(@PathVariable String localizador){

        return localizadorService.get(localizador);

    }

    @GetMapping("/Localizador/getId/{id}")
    Localizador get(@PathVariable Long id){

        return localizadorService.get(id);
    }

    @GetMapping("/Localizador/getByCodigo/{codigo}")
    Localizador getByCodigo(@PathVariable String codigo){

        return localizadorService.getByCodigo(codigo);

    }

    @PostMapping("/Localizador/insert")
    void insert(@RequestBody Localizador localizador){
        localizadorService.insert(localizador);

    }
    @GetMapping("/Localizador/getAllBySubinventarioCountheaderId/{subinventarioCodigo}/{cycleCountHeaderId}")
    List<Localizador> getAllBySubinventarioCountheaderId(@PathVariable String subinventarioCodigo,@PathVariable Long cycleCountHeaderId){

        return localizadorService.getAllBySubinventarioCountheaderId(subinventarioCodigo,cycleCountHeaderId);


    }
    @GetMapping("/Localizador/getAllBySubinventarioInventarioId/{subinventarioCodigo}/{inventarioId}")
    List<Localizador> getAllBySubinventarioInventarioId(@PathVariable String subinventarioCodigo,@PathVariable Long inventarioId){

        return localizadorService.getAllBySubinventarioInventarioId(subinventarioCodigo,inventarioId);


    }

}
