package com.bave.inventariorest.controller;

import com.bave.inventariorest.model.DatosTransOrg;
import com.bave.inventariorest.model.DatosTransOrgDetalle;
import com.bave.inventariorest.model.MtlTransactionsInterface;
import com.bave.inventariorest.model.MtlTransactionsLotsIfaceDes;
import com.bave.inventariorest.service.MtlTransactionsInterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MtlTransactionsInterfaceController {

@Autowired
private MtlTransactionsInterfaceService mtlTransactionsInterfaceService;



@GetMapping("/MtlTransactionsInterface/getTransSubinv")
public List<DatosTransOrg> getTransSubinv() {

  return  mtlTransactionsInterfaceService.getTransSubinv();


}
@GetMapping("/MtlTransactionsInterface/getTransferencias/{transactionReference}")
public List<DatosTransOrgDetalle> getTransferencias(@PathVariable String transactionReference){

  return mtlTransactionsInterfaceService.getTransferencias(transactionReference);

}

@PostMapping("/MtlTransactionsInterface/insert")
public void insert(@RequestBody MtlTransactionsInterface mtlTransactionsInterface) {

    mtlTransactionsInterfaceService.insert(mtlTransactionsInterface);

}
@GetMapping("/MtlTransactionsInterface/getLocOrDesNotNull/{inventoryItemId}/{subinventario}/{localizador}/{transferSubinventory}/{transferLocator}")
public Long getLocOrDesNotNull(@PathVariable Long inventoryItemId,@PathVariable String subinventario,@PathVariable String localizador,@PathVariable String transferSubinventory,@PathVariable String transferLocator) {


    return mtlTransactionsInterfaceService.getLocOrDesNotNull(inventoryItemId,subinventario,localizador,transferSubinventory,transferLocator);

}

@GetMapping("/MtlTransactionsInterface/getLocOrNullDestNotNull/{inventoryItemId}/{subinventario}/{transferSubinventory}/{transferLocator}")
public Long getLocOrNullDestNotNull(@PathVariable Long inventoryItemId,@PathVariable String subinventario,@PathVariable String transferSubinventory,@PathVariable String transferLocator) {

    return mtlTransactionsInterfaceService.getLocOrNullDestNotNull(inventoryItemId,subinventario,transferSubinventory,transferLocator);


}

@GetMapping("/MtlTransactionsInterface/getLocOrNotNullDestNull/{inventoryItemId}/{subinventario}/{localizador}/{transferSubinventory}")
public Long getLocOrNotNullDestNull(@PathVariable Long inventoryItemId,@PathVariable String subinventario,@PathVariable String localizador,@PathVariable String transferSubinventory){


    return mtlTransactionsInterfaceService.getLocOrNotNullDestNull(inventoryItemId,subinventario,localizador,transferSubinventory);
}

@GetMapping("/MtlTransactionsInterface/getLocOrNullDestNull/{inventoryItemId}/{subinventario}/{transferSubinventory}")
public Long getLocOrNullDestNull(@PathVariable Long inventoryItemId,@PathVariable String subinventario,@PathVariable String transferSubinventory){

    return mtlTransactionsInterfaceService.getLocOrNullDestNull(inventoryItemId,subinventario,transferSubinventory);

}
@GetMapping("/MtlTransactionsInterface/getLocOrDesNotNullOrg/{inventoryItemId}/{subinventario}/{localizador}/{organizacionDestino}")
public Long getLocOrDesNotNullOrg(@PathVariable Long inventoryItemId,@PathVariable String subinventario,@PathVariable String localizador,@PathVariable Long organizacionDestino){


    return mtlTransactionsInterfaceService.getLocOrDesNotNullOrg(inventoryItemId,subinventario,localizador,organizacionDestino);

}

@GetMapping("/MtlTransactionsInterface/getLocOrNullDestNotNullOrg/{inventoryItemId}/{subinventario}/{organizacionDestino}")
public Long getLocOrNullDestNotNullOrg(@PathVariable Long inventoryItemId,@PathVariable String subinventario,@PathVariable Long organizacionDestino){

    return mtlTransactionsInterfaceService.getLocOrNullDestNotNullOrg(inventoryItemId,subinventario,organizacionDestino);
}

@GetMapping("/MtlTransactionsInterface/getLocNull/{inventoryItemId}/{subinventario}/{localizador}")
public Long getLocNull(@PathVariable Long inventoryItemId,@PathVariable String subinventario,@PathVariable String localizador){

    return mtlTransactionsInterfaceService.getLocNull(inventoryItemId,subinventario,localizador);

}
@GetMapping("/MtlTransactionsInterface/getTransferencias/numeroTraspaso/glosa")
public List<MtlTransactionsInterface> getTransferencias(@PathVariable String numeroTraspaso,@PathVariable String glosa){

    return mtlTransactionsInterfaceService.getTransferencias(numeroTraspaso,glosa);

}

@GetMapping("/MtlTransactionsInterface/getTransferenciasByTraspaso/{numeroTraspaso}")
public List<MtlTransactionsInterface> getTransferenciasByTraspaso(@PathVariable String numeroTraspaso){


    return mtlTransactionsInterfaceService.getTransferenciasByTraspaso(numeroTraspaso);
}

@GetMapping("/MtlTransactionsInterface/getTransferenciasByShipment/{numeroTraspaso}")
public List<MtlTransactionsInterface> getTransferenciasByShipment(@PathVariable String numeroTraspaso){

    return mtlTransactionsInterfaceService.getTransferenciasByShipment(numeroTraspaso);

}
@GetMapping("/MtlTransactionsInterface/getTransferenciasById/{transactionInterfaceId}")
public MtlTransactionsInterface getTransferenciasById(@PathVariable Long transactionInterfaceId){

    return mtlTransactionsInterfaceService.getTransferenciasById(transactionInterfaceId);

}

@PostMapping("/MtlTransactionsInterface/delete/{transactionInterfaceId}")
public void delete(@PathVariable Long transactionInterfaceId){

    mtlTransactionsInterfaceService.delete(transactionInterfaceId);

}


}
