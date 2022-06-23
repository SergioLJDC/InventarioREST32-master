package com.bave.inventariorest.controller;


import com.bave.inventariorest.model.MtlCycleCountEntries;
import com.bave.inventariorest.service.MtlCycleCountEntriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MtlCycleCountEntriesController {



@Autowired
MtlCycleCountEntriesService mtlCycleCountEntriesService;



@PostMapping("/MtlCycleCountEntries/insert")
void insert(@RequestBody MtlCycleCountEntries mtlCycleCountEntries) {


    mtlCycleCountEntriesService.insert(mtlCycleCountEntries);


}

@PostMapping("/MtlCycleCountEntries/delete/{cycleCountEntryId}")
void delete(@PathVariable Long cycleCountEntryId){

    mtlCycleCountEntriesService.delete(cycleCountEntryId);

}

@PostMapping("/MtlCycleCountEntries/deleteByHeader/{headerId}")
void deleteByHeader(@PathVariable Long headerId){

    mtlCycleCountEntriesService.deleteByHeader(headerId);

}

@GetMapping("/MtlCycleCountEntries/get/{cycleCountEntryId}")
MtlCycleCountEntries get(@PathVariable Long cycleCountEntryId){

    return mtlCycleCountEntriesService.get(cycleCountEntryId);

}
@GetMapping("/MtlCycleCountEntries/getAll")
List<MtlCycleCountEntries> getAll(){

    return mtlCycleCountEntriesService.getAll();
}
@GetMapping("/MtlCycleCountEntries/getAllBySubinventarioLocatorSegmentLoteSerie/{countHeaderId}/{subinventory}/{locatorId}/{segment}/{serie}/{lote}")
List<MtlCycleCountEntries> getAllBySubinventarioLocatorSegmentLoteSerie(@PathVariable Long countHeaderId,@PathVariable String subinventory,@PathVariable Long locatorId,@PathVariable String segment,@PathVariable String serie,@PathVariable String lote) {

    return mtlCycleCountEntriesService.getAllBySubinventarioLocatorSegmentLoteSerie(countHeaderId, subinventory, locatorId, segment, serie, lote);


}


@GetMapping("/MtlCycleCountEntries/getAllBySubinventarioSegmentLoteSerie/{countHeaderId}/{subinventory}/{segment}/{serie}/{lote}")
List<MtlCycleCountEntries> getAllBySubinventarioSegmentLoteSerie(@PathVariable Long countHeaderId,@PathVariable String subinventory,@PathVariable String segment,@PathVariable String serie,@PathVariable String lote){

    return mtlCycleCountEntriesService.getAllBySubinventarioSegmentLoteSerie(countHeaderId,subinventory,segment,serie,lote);

}

@GetMapping("/MtlCycleCountEntries/getAllInventariadosByHeader/{countHeaderId}")
List<MtlCycleCountEntries> getAllInventariadosByHeader(@PathVariable Long countHeaderId){

    return mtlCycleCountEntriesService.getAllInventariadosByHeader(countHeaderId);


}
@GetMapping("/MtlCycleCountEntries/getAllInventariadosBySubinventario/{countHeaderId}/{subinventory}")
List<MtlCycleCountEntries> getAllInventariadosBySubinventario(@PathVariable Long countHeaderId,@PathVariable String subinventory){

    return mtlCycleCountEntriesService.getAllInventariadosBySubinventario(countHeaderId,subinventory);
}

@GetMapping("/MtlCycleCountEntries/getSegmentsByCountHeaderLocator/{countHeaderId}/{locatorId}")
List<String> getSegmentsByCountHeaderLocator(@PathVariable Long countHeaderId,@PathVariable Long locatorId){

    return mtlCycleCountEntriesService.getSegmentsByCountHeaderLocator(countHeaderId,locatorId);

}

@GetMapping("/MtlCycleCountEntries/getSegmentsByCountHeaderSubinventory/{countHeaderId}/{subinventory}")
List<String> getSegmentsByCountHeaderSubinventory(@PathVariable Long countHeaderId,@PathVariable String subinventory){

    return mtlCycleCountEntriesService.getSegmentsByCountHeaderSubinventory(countHeaderId,subinventory);

}

@GetMapping("/MtlCycleCountEntries/getSegmentsByCountHeaderSubinventoryLocator/{countHeaderId}/{subinventory}/{locatorId}")
 List<String> getSegmentsByCountHeaderSubinventoryLocator(@PathVariable Long countHeaderId,@PathVariable String subinventory,@PathVariable Long locatorId){

    return mtlCycleCountEntriesService.getSegmentsByCountHeaderSubinventoryLocator(countHeaderId,subinventory,locatorId);


}
@GetMapping("/MtlCycleCountEntries/getLoteByCountHeaderLocatorSegment/{cycleCountHeaderId}/{locatorId}/{segment}")
List<String> getLoteByCountHeaderLocatorSegment(@PathVariable Long cycleCountHeaderId,@PathVariable Long locatorId,@PathVariable String segment){

    return mtlCycleCountEntriesService.getLoteByCountHeaderLocatorSegment(cycleCountHeaderId,locatorId,segment);


}
@GetMapping("/MtlCycleCountEntries/getLoteByCountHeaderSubinventoryLocatorSegment/{cycleCountHeaderId}/{subinventory}/{locatorId}/{segment}")
List<String> getLoteByCountHeaderSubinventoryLocatorSegment(@PathVariable Long cycleCountHeaderId,@PathVariable String subinventory,@PathVariable Long locatorId,@PathVariable String segment){


    return mtlCycleCountEntriesService.getLoteByCountHeaderSubinventoryLocatorSegment(cycleCountHeaderId,subinventory,locatorId,segment);

}
@GetMapping("/MtlCycleCountEntries/getLoteByCountHeaderSubinventorySegment/{cycleCountHeaderId}/{subinventory}/{segment}")
List<String> getLoteByCountHeaderSubinventorySegment(@PathVariable Long cycleCountHeaderId,@PathVariable String subinventory,@PathVariable String segment){

    return mtlCycleCountEntriesService.getLoteByCountHeaderSubinventorySegment(cycleCountHeaderId,subinventory,segment);


}

@GetMapping("/MtlCycleCountEntries/getSerialByCountHeaderSubinventoryLocatorSegment/{cycleCountHeaderId}/{subinventory}/{locatorId}/{segment}")
List<String> getSerialByCountHeaderSubinventoryLocatorSegment(@PathVariable Long cycleCountHeaderId,@PathVariable String subinventory,@PathVariable Long locatorId,@PathVariable String segment){

    return mtlCycleCountEntriesService.getSerialByCountHeaderSubinventoryLocatorSegment(cycleCountHeaderId,subinventory,locatorId,segment);

}
@GetMapping("/MtlCycleCountEntries/getSerialByCountHeaderSubinventorySegment/{cycleCountHeaderId}/{subinventory}/{segment}")
List<String> getSerialByCountHeaderSubinventorySegment(@PathVariable Long cycleCountHeaderId,@PathVariable String subinventory,@PathVariable String segment){

    return mtlCycleCountEntriesService.getSerialByCountHeaderSubinventorySegment(cycleCountHeaderId,subinventory,segment);

    }



}
