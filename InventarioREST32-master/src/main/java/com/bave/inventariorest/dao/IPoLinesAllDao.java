package com.bave.inventariorest.dao;

import com.bave.inventariorest.model.PoLinesAll;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface IPoLinesAllDao  extends PagingAndSortingRepository<PoLinesAll,Long> {


    @Query("SELECT pla FROM PoLinesAll pla, MtlSystemItems msi " +
            "WHERE pla.itemId = msi.inventoryItemId " +
            "AND msi.inventoryItemId = ?1 "+
            "AND pla.poHeaderId = ?2")
    List<PoLinesAll> getLines(Long inventoryItemId,Long poHeaderId);

    @Query("SELECT po FROM PoLinesAll  po where po.poLineId=?1")
    PoLinesAll getById(Long poLineId);



    @Query("SELECT pla from PoLinesAll pla, MtlSystemItems  msi where pla.itemId=msi.inventoryItemId and msi.inventoryItemId=?1 and pla.poHeaderId=?2 and pla.lineNum=?3")
    PoLinesAll getLinea(Long inventoryItemId, Long poHeaderId, Long poLineNum);


    void deleteByPoHeaderId(Long poHeaderId);

}
