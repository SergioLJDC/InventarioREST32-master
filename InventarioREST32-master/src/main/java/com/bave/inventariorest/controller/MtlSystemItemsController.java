package com.bave.inventariorest.controller;
import com.bave.inventariorest.model.MtlSystemItems;
import com.bave.inventariorest.service.MtlSystemItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MtlSystemItemsController {


    @Autowired
    private MtlSystemItemsService mtlSystemItemsService;


    @GetMapping("/MtlSystemItems/getBySegment/{segment}")
    MtlSystemItems getBySegment(@PathVariable String segment){
        return mtlSystemItemsService.getBySegment(segment);

    }

    @GetMapping("/MtlSystemItems/getAllByOcReceipt/{PoHeaderId}/{ReceiptNum}")
    List<MtlSystemItems> getAllByOcReceipt(@PathVariable Long PoHeaderId,@PathVariable Long ReceiptNum){
        return mtlSystemItemsService.getAllByOcReceipt(PoHeaderId,ReceiptNum);

    }
    @GetMapping("/MtlSystemItems/get/{inventoryItemId}")
    MtlSystemItems get(@PathVariable Long inventoryItemId){
        return mtlSystemItemsService.get(inventoryItemId);

    }

    @GetMapping("/MtlSystemItems/getAll")
    List<MtlSystemItems> getAll(){
        return mtlSystemItemsService.getAll();

    }
    @GetMapping("/MtlSystemItems/getAllByDescription/{pattern}")
    List<MtlSystemItems> getAllByDescription(@PathVariable String pattern){
        return mtlSystemItemsService.getAllByDescription(pattern);
    }

    @GetMapping("/MtlSystemItems/getAllByDescriptionPoHeaderId/{pattern}/{poHeaderId}")
    List<MtlSystemItems> getAllByDescriptionPoHeaderId(@PathVariable String  pattern,@PathVariable Long poHeaderId) {
        return mtlSystemItemsService.getAllByDescriptionPoHeaderId(pattern,poHeaderId);

    }
    @GetMapping("/MtlSystemItems/getAllByDescriptionShipment/{pattern}/{shipmentHeaderId}")
    List<MtlSystemItems> getAllByDescriptionShipment(@PathVariable String pattern,@PathVariable Long shipmentHeaderId){
        return mtlSystemItemsService.getAllByDescriptionShipment(pattern,shipmentHeaderId);

    }


    @GetMapping("/MtlSystemItems/getAllByDescriptionSubinvLocator/{pattern}/{subinventario}/{locatorCodigo}")
    List<MtlSystemItems> getAllByDescriptionSubinvLocator(@PathVariable String pattern,@PathVariable String subinventario,@PathVariable String locatorCodigo){

    return mtlSystemItemsService.getAllByDescriptionSubinvLocator(pattern,subinventario,locatorCodigo);

    }



    @GetMapping("/MtlSystemItems/getByCycleHeaders/{CycleHeaders}")
       List<MtlSystemItems> getMtlSystemItemsByCycleHeaders(@PathVariable Long CycleHeaders){
        return mtlSystemItemsService.getMtlSystemItemsByCycleHeaders(CycleHeaders);

    }


}
