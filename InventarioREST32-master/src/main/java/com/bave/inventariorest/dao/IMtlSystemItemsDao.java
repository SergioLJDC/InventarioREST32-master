package com.bave.inventariorest.dao;

import com.bave.inventariorest.model.MtlSystemItems;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IMtlSystemItemsDao extends PagingAndSortingRepository<MtlSystemItems,Long> {

    @Query("SELECT m FROM MtlSystemItems m where m.segment1 = ?1")
    MtlSystemItems getBySegment(String segment);

    @Query("SELECT m FROM MtlSystemItems m,PoLinesAll pl,PoHeadersAll ph where pl.poHeaderId=ph.po_header_id and pl.itemId=m.inventoryItemId and ph.po_header_id = ?1 and ph.receipt_num=?2")
    List<MtlSystemItems> getArticulosByOcReceipt(Long PoHeaderId,Long ReceiptNum);

    @Query("SELECT m FROM MtlSystemItems m where m.inventoryItemId = ?1 ")
    MtlSystemItems get(Long inventoryItemId);

    @Query("select m from MtlSystemItems  m")
    List<MtlSystemItems> getAll();

    @Query(" SELECT m " +
            " FROM " +
            "     MtlSystemItems m " +
            " WHERE " +
            "     concat(m.description,m.longDescription) like %:pattern% ")
    List<MtlSystemItems> getAllByDescription(@Param("pattern") String  pattern);


    @Query("SELECT msi FROM MtlSystemItems msi WHERE CONCAT(msi.description,msi.longDescription) like CONCAT(CONCAT('%', ?1), '%') " +
            "and msi.inventoryItemId in (SELECT distinct(rcv.itemId) FROM RcvTransactions rcv WHERE rcv.shipmentHeaderId=?2)")
    List<MtlSystemItems> getAllByDescriptionShipment(String pattern,Long shipmentHeaderId);



    @Query(value = " SELECT * " +
            " FROM MTL_SYSTEM_ITEMS  m " +
            " WHERE " +
            "     concat(m.DESCRIPTION,m.LONG_DESCRIPTION) like CONCAT(CONCAT('%', ?1), '%') " +
            "     AND m.INVENTORY_ITEM_ID in (SELECT distinct(p.ITEM_ID) FROM PO_LINES_ALL p WHERE p.PO_HEADER_ID = ?2)",nativeQuery = true)
    List<MtlSystemItems> getAllByDescriptionPoHeaderId( String  pattern,Long poHeaderId);




    @Query(value = "SELECT MSI.*  FROM MTL_SYSTEM_ITEMS MSI ,MTL_CYCLE_COUNT_ENTRIES MCCE\n" +
            "where MSI.INVENTORY_ITEM_ID = MCCE.INVENTORY_ITEM_ID\n" +
            "AND MCCE.CYCLE_COUNT_HEADER_ID = ?1\n" +
            "AND MCCE.COUNT IS NOT  NULL ",nativeQuery = true)
    List<MtlSystemItems> getMtlSystemItemsByCycleHeaders(Long CycleHeaders);







    /*


    @Query("")
    List<MtlSystemItems> getAllByDescriptionShipmentOrganizacion(String pattern, Long shipmentHeaderId);


    @Query("")
    List<MtlSystemItems> getAllByDescriptionShipmentOrganizacion(String pattern, Long shipmentHeaderId);

    @Query("")
    List<MtlSystemItems> getAllByDescriptionCountHeaderLocator(String pattern, Long countHeaderId, Long locatorId);

    @Query("")
    List<MtlSystemItems> getAllByDescriptionInventoryLocator(String pattern, Long inventoryId, Long locatorId);

    @Query("")
    List<MtlSystemItems> getAllByDescriptionSubinvLocator(String pattern, String subinventario, String locatorCodigo);
    */

}

