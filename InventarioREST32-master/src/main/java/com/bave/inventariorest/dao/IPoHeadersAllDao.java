package com.bave.inventariorest.dao;

import com.bave.inventariorest.model.DatosCabeceraRecepcion;
import com.bave.inventariorest.model.DatosRecepcion;
import com.bave.inventariorest.model.PoHeadersAll;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


public interface IPoHeadersAllDao extends PagingAndSortingRepository<PoHeadersAll,Long> {


    @Query("SELECT new com.bave.inventariorest.model.DatosCabeceraRecepcion( p.userId," +
            " p.receipt_num, " +
            "p.vendorId," +
            " p.vendorSiteCode, " +
            "p.vendorSiteId," +
            " p.currencyCode," +
            " p.rateType," +
            " p.rate," +
            " p.rateDate," +
            " p.termsId," +
            " p.orgId )" +
            "FROM PoHeadersAll p where p.po_header_id = ?1 AND p.receipt_num = ?2")
    DatosCabeceraRecepcion get(Long poHeaderId, Long receiptNum);



    @Query(value = "SELECT new com.bave.inventariorest.model.DatosRecepcion( " +
            "pla.unitMeasLookupCode," +
            "pla.itemId, " +
            "pla.itemDescripcion, " +
            "msi.primaryUomCode," +
            "pha.vendorId, " +
            "pha.vendorSiteId, " +
            "pha.po_header_id, " +
            "pla.poLineId, " +
            "pll.lineLocationId, " +
            "pla.unitPrice, " +
            "pha.currencyCode, " +
            "pha.rateType, " +
            "pha.rate, " +
            "pha.rateDate, " +
            "pda.poDistributionId, " +
            "pha.vendorSiteCode, "+
            "pll.quantity," +
            "pll.quantityRecived, " +
            "pll.quantityCancelled, " +
            "pll.qtyRcvTolerance, " +
            "pha.userId, " +
            "pha.orgId) "+
            "FROM PoHeadersAll pha, PoLinesAll pla, PoLineLocationsAll pll, MtlSystemItems msi, PoDistributionsAll pda "+
            "WHERE pla.itemId = msi.inventoryItemId AND pha.po_header_id = pla.poHeaderId AND pha.po_header_id = pll.poHeaderId "+
            "AND pla.poLineId = pll.poLineId AND pll.lineLocationId = pda.lineLocationId AND pla.poLineId = pda.poLineId "+
            "AND pha.po_header_id = pda.poHeaderId AND msi.segment1 = ?1 AND pha.Segment1 = ?2 AND pha.receipt_num = ?3 AND pla.lineNum = ?4")
    DatosRecepcion getDatosRecepcion(String segment1, String oc, Long receiptNum, Long poLineNum);







}
