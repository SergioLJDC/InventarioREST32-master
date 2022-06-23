package com.bave.inventariorest.controller;


import com.bave.inventariorest.model.MtlPhysicalInventoryTags;
import com.bave.inventariorest.service.MtlPhysicalInventoryTagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MtlPhysicalInventoryTagsController {



@Autowired
    MtlPhysicalInventoryTagsService mtlPhysicalInventoryTagsService;




@PostMapping("/MtlPhysicalInventoryTags/insert")
void insert(@RequestBody MtlPhysicalInventoryTags mtlPhysicalInventoryTags){

    mtlPhysicalInventoryTagsService.insert(mtlPhysicalInventoryTags);

}


@PostMapping("/MtlPhysicalInventoryTags/delete/{tagId}")
 void delete(@PathVariable Long tagId){

    mtlPhysicalInventoryTagsService.delete(tagId);

}
@GetMapping("/MtlPhysicalInventoryTags/get/{tagId}")
MtlPhysicalInventoryTags get(@PathVariable Long tagId){


  return  mtlPhysicalInventoryTagsService.get(tagId);

}

@PostMapping("/MtlPhysicalInventoryTags/deleteByPhysicalInventory/{physicalInventoryId}")
void deleteByPhysicalInventory(@PathVariable Long physicalInventoryId){


    mtlPhysicalInventoryTagsService.deleteByPhysicalInventory(physicalInventoryId);

}
@GetMapping("/MtlPhysicalInventoryTags/getAllByInventory/{physicalInventoryId}")
List<MtlPhysicalInventoryTags> getAllByInventory(@PathVariable Long physicalInventoryId){


    return mtlPhysicalInventoryTagsService.getAllByInventory(physicalInventoryId);

}


@GetMapping("/MtlPhysicalInventoryTags/getAllByInventorySubinventory/{physicalInventoryId}/{subinventory}")
List<MtlPhysicalInventoryTags> getAllByInventorySubinventory(@PathVariable Long physicalInventoryId,@PathVariable String subinventory){

    return mtlPhysicalInventoryTagsService.getAllByInventorySubinventory(physicalInventoryId,subinventory);

}


@GetMapping("/MtlPhysicalInventoryTags/getAllInventariadosByInventory/{physicalInventoryId}")
List<MtlPhysicalInventoryTags> getAllInventariadosByInventory(@PathVariable Long physicalInventoryId){


    return mtlPhysicalInventoryTagsService.getAllInventariadosByInventory(physicalInventoryId);

}

@GetMapping("/MtlPhysicalInventoryTags/getAllInventariadosByInventorySubinventory/{physicalInventoryId}/{subinventory}")
List<MtlPhysicalInventoryTags> getAllInventariadosByInventorySubinventory(@PathVariable Long physicalInventoryId,@PathVariable String subinventory){


    return mtlPhysicalInventoryTagsService.getAllInventariadosByInventorySubinventory(physicalInventoryId,subinventory);


}

@GetMapping("/MtlPhysicalInventoryTags/getAllNoInventariadosByInventorySubinventory/{physicalInventoryId}/{subinventory}")
List<MtlPhysicalInventoryTags> getAllNoInventariadosByInventorySubinventory(@PathVariable Long physicalInventoryId,@PathVariable String subinventory){


    return mtlPhysicalInventoryTagsService.getAllNoInventariadosByInventorySubinventory(physicalInventoryId,subinventory);


}
@GetMapping("/MtlPhysicalInventoryTags/getAllByInventorySubinventorySegmentSerieLote/{physicalInventoryId}/{subinventory}/{locatorId}/{segment}/{serie}/{lote}/{vencimiento}")
List<MtlPhysicalInventoryTags> getAllByInventorySubinventorySegmentSerieLote(@PathVariable Long physicalInventoryId,@PathVariable String subinventory,@PathVariable Long locatorId,@PathVariable String segment,@PathVariable String serie,@PathVariable String lote,@PathVariable String vencimiento){

    return mtlPhysicalInventoryTagsService.getAllByInventorySubinventorySegmentSerieLote(physicalInventoryId,subinventory,locatorId,segment,serie,lote,vencimiento);


}



@GetMapping("/MtlPhysicalInventoryTags/getAllByInventorySubinventorySegmentSerieLoteLocatorNull/{physicalInventoryId}/{subinventory}/{segment}/{serie}/{lote}/{vencimiento}")
List<MtlPhysicalInventoryTags> getAllByInventorySubinventorySegmentSerieLoteLocatorNull(@PathVariable Long physicalInventoryId,@PathVariable String subinventory,@PathVariable String segment,@PathVariable String serie,@PathVariable String lote,@PathVariable String vencimiento){

    return mtlPhysicalInventoryTagsService.getAllByInventorySubinventorySegmentSerieLoteLocatorNull(physicalInventoryId,subinventory,segment,serie,lote,vencimiento);


}

@GetMapping("/MtlPhysicalInventoryTags/getLocatorByInventorySubinventory/{physicalInventoryId}/{subinventory}")
List<String> getLocatorByInventorySubinventory(@PathVariable Long physicalInventoryId,@PathVariable String subinventory){


    return mtlPhysicalInventoryTagsService.getLocatorByInventorySubinventory(physicalInventoryId,subinventory);

}



@GetMapping("/MtlPhysicalInventoryTags/getSegment1ByInventorySubinventory/{physicalInventoryId}/{subinventory}")
List<String> getSegment1ByInventorySubinventory(@PathVariable Long physicalInventoryId,@PathVariable String subinventory){

    return mtlPhysicalInventoryTagsService.getSegment1ByInventorySubinventory(physicalInventoryId,subinventory);


}


@GetMapping("/MtlPhysicalInventoryTags/getSegment1ByInventorySubinventoryLocator/{physicalInventoryId}/{subinventory}/{locatorId}")
List<String> getSegment1ByInventorySubinventoryLocator(@PathVariable Long physicalInventoryId,@PathVariable String subinventory,@PathVariable Long locatorId){



    return mtlPhysicalInventoryTagsService.getSegment1ByInventorySubinventoryLocator(physicalInventoryId,subinventory,locatorId);

}

@GetMapping("/MtlPhysicalInventoryTags/getSeriesByInventorySubinventory/{physicalInventoryId}/{subinventory}")
List<String> getSeriesByInventorySubinventory(@PathVariable Long physicalInventoryId,@PathVariable String subinventory){


    return mtlPhysicalInventoryTagsService.getSeriesByInventorySubinventory(physicalInventoryId,subinventory);


}


@GetMapping("/MtlPhysicalInventoryTags/getSeriesByInventorySubinventoryLocator/{physicalInventoryId}/{subinventory}/{locatorId}")
List<String> getSeriesByInventorySubinventoryLocator(@PathVariable Long physicalInventoryId,@PathVariable String subinventory,@PathVariable Long locatorId){


    return mtlPhysicalInventoryTagsService.getSeriesByInventorySubinventoryLocator(physicalInventoryId,subinventory,locatorId);


}

@GetMapping("/MtlPhysicalInventoryTags/getSeriesByInventorySubinventoryLocatorSegment/{physicalInventoryId}/{subinventory}/{locatorId}/{segment}")
List<String> getSeriesByInventorySubinventoryLocatorSegment(@PathVariable Long physicalInventoryId,@PathVariable String subinventory,@PathVariable Long locatorId,@PathVariable String segment){


    return mtlPhysicalInventoryTagsService.getSeriesByInventorySubinventoryLocatorSegment(physicalInventoryId,subinventory,locatorId,segment);


}

@GetMapping("/MtlPhysicalInventoryTags/getLotesByInventorySubinventory/{physicalInventoryId}/{subinventory}")
List<String> getLotesByInventorySubinventory(@PathVariable Long physicalInventoryId,@PathVariable String subinventory){


    return mtlPhysicalInventoryTagsService.getLotesByInventorySubinventory(physicalInventoryId,subinventory);

}


@GetMapping("/MtlPhysicalInventoryTags/getLotesByInventorySubinventoryLocatorSegment/{physicalInventoryId}/{subinventory}/{locatorId}/{segment}")
List<String> getLotesByInventorySubinventoryLocatorSegment(@PathVariable Long physicalInventoryId,@PathVariable String subinventory,@PathVariable Long locatorId,@PathVariable String segment){


    return mtlPhysicalInventoryTagsService.getLotesByInventorySubinventoryLocatorSegment(physicalInventoryId,subinventory,locatorId,segment);


}


@GetMapping("/MtlPhysicalInventoryTags/getVencimientosByInventorySubinventoryLocatorSegment/{physicalInventoryId}/{subinventory}/{locatorId}/{segment}")
List<String> getVencimientosByInventorySubinventoryLocatorSegment(@PathVariable Long physicalInventoryId,@PathVariable String subinventory,@PathVariable Long locatorId,@PathVariable String segment){


    return mtlPhysicalInventoryTagsService.getVencimientosByInventorySubinventoryLocatorSegment(physicalInventoryId,subinventory,locatorId,segment);

}



}
