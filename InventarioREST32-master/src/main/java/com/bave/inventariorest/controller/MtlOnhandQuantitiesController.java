package com.bave.inventariorest.controller;


import com.bave.inventariorest.model.MtlOnhandQuantities;
import com.bave.inventariorest.service.MtlOnhandQuantitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MtlOnhandQuantitiesController {


    @Autowired
    MtlOnhandQuantitiesService mtlOnhandQuantitiesService;



    @PostMapping("/MtlOnhandQuantities/insert")
    public void insert(@RequestBody MtlOnhandQuantities mtlOnhandQuantities){

        mtlOnhandQuantitiesService.insert(mtlOnhandQuantities);
    }


    @GetMapping("/MtlOnhandQuantities/get/{articulo}/{lote}/{subinventario}/{localizador}")
    public MtlOnhandQuantities get(@PathVariable String articulo,@PathVariable String lote,@PathVariable String subinventario,@PathVariable String localizador) {

        return mtlOnhandQuantitiesService.get(articulo, lote, subinventario, localizador);

    }



    @GetMapping("/MtlOnhandQuantities/getLocatorNull/{articulo}/{lote}/{subinventario}")
    public MtlOnhandQuantities getLocatorNull(@PathVariable String articulo,@PathVariable String lote,@PathVariable String subinventario){

        return mtlOnhandQuantitiesService.getLocatorNull(articulo,lote,subinventario);

    }

    @GetMapping("/MtlOnhandQuantities/getCantidad/{articulo}/{lote}/{subinventario}/{localizador}")
    public Double getCantidad(@PathVariable String articulo,@PathVariable String lote,@PathVariable String subinventario,@PathVariable String localizador){

    return mtlOnhandQuantitiesService.getCantidad(articulo,lote,subinventario,localizador);

    }

    @GetMapping("/MtlOnhandQuantities/getCantidadLocatorNull/{articulo}/{lote}/{subinventario}")
    public Double getCantidadLocatorNull(@PathVariable String articulo,@PathVariable String lote,@PathVariable String subinventario){


        return mtlOnhandQuantitiesService.getCantidadLocatorNull(articulo,lote,subinventario);


    }

    @GetMapping("/MtlOnhandQuantities/validaSerie/{articulo}/{lote}/{subinventario}/{localizador}/{serie}")
    public MtlOnhandQuantities validaSerie(@PathVariable String articulo,@PathVariable String lote,@PathVariable String subinventario,@PathVariable String localizador,@PathVariable String serie){

        return mtlOnhandQuantitiesService.validaSerie(articulo,lote,subinventario,localizador,serie);


    }

    @GetMapping("/MtlOnhandQuantities/getAll/{articulo}/{lote}/{subinventario}/{localizador}")
    public List<MtlOnhandQuantities> getAll(@PathVariable String articulo,@PathVariable String lote,@PathVariable String subinventario,@PathVariable String localizador){

        return mtlOnhandQuantitiesService.getAll(articulo,lote,subinventario,localizador);

    }


    @GetMapping("/MtlOnhandQuantities/getSegment1BySubinventory/{subinventory}")
    public List<String> getSegment1BySubinventory(@PathVariable String subinventory){

        return mtlOnhandQuantitiesService.getSegment1BySubinventory(subinventory);

    }


    @GetMapping("/MtlOnhandQuantities/getSegment1BySubinventoryLocator/{subinventory}/{locatorId}")
    public List<String> getSegment1BySubinventoryLocator(@PathVariable String subinventory,@PathVariable Long locatorId)  {


        return mtlOnhandQuantitiesService.getSegment1BySubinventoryLocator(subinventory,locatorId);

    }


    @GetMapping("/MtlOnhandQuantities/getLoteBySubinventory/{subinventory}/{segment1}")
    public List<String> getLoteBySubinventory(@PathVariable String subinventory,@PathVariable String segment1){

        return mtlOnhandQuantitiesService.getLoteBySubinventory(subinventory,segment1);

    }


    @GetMapping("/MtlOnhandQuantities/getLoteBySubinventoryLocator/{subinventory}/{locatorId}/{segment1}")
    public List<String> getLoteBySubinventoryLocator(@PathVariable String subinventory,@PathVariable Long locatorId,@PathVariable String segment1){
       return   mtlOnhandQuantitiesService.getLoteBySubinventoryLocator(subinventory,locatorId,segment1);

    }

}
