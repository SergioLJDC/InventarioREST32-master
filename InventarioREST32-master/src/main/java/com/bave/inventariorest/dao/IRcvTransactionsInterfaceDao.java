package com.bave.inventariorest.dao;
import com.bave.inventariorest.model.DatosCabeceraRecepcion;
import com.bave.inventariorest.model.DatosRecepcion;
import com.bave.inventariorest.model.RcvTransactionsInterface;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


public interface IRcvTransactionsInterfaceDao extends PagingAndSortingRepository<RcvTransactionsInterface,Long> {


    @Query("SELECT r FROM RcvTransactionsInterface r , MtlSystemItems m where r.itemId = m.inventoryItemId AND r.headerInterfaceId = ?1")
    List<RcvTransactionsInterface> getArticulos(Long id);


    void deleteByHeaderInterfaceId(Long headerInterfaceId);


    void deleteByInterfaceTransactionId(Long interfaceTransactionId);

    @Query(" SELECT rti "
            + " FROM "
            + "     RcvTransactionsInterface rti,"
            + "     MtlSystemItems msi "
            + " WHERE "
            + "     rti.itemId = msi.inventoryItemId "
            + "     AND rti.headerInterfaceId = ?1 ")
    List<RcvTransactionsInterface> getAllByHeader(Long headerInterfaceId);


    @Query(value = "SELECT PLA.LINE_NUM FROM RCV_TRANSACTIONS_INTERFACE RTI," +
            "            MTL_SYSTEM_ITEMS MSI ," +
            "            PO_LINES_ALL PLA " +
            "WHERE MSI.INVENTORY_ITEM_ID = ?1 " +
            "AND PLA.ITEM_ID = MSI.INVENTORY_ITEM_ID " +
            "AND PLA.LINE_NUM = RTI.PO_LINE_ID " +
            "AND RTI.PO_HEADER_ID = ?2; ",nativeQuery = true)
     List<Long> getPolineasBysegmentAndPoHeader(String segment, Long poHeaderId);


    @Query(value = "Select NVL(SUM(RTI.QUANTITY),0) " +
            "from RCV_TRANSACTIONS_INTERFACE RTI " +
            "where RTI.PARENT_TRANSACTION_ID = ?1 " +
            "GROUP BY PARENT_TRANSACTION_ID",nativeQuery = true)
    int getSumaEntregadosByParentTransactionId(int ParenTransactionID);


    @Query(value = "SELECT rti.* " +
            "FROM RCV_TRANSACTIONS_INTERFACE rti , " +
            "     MTL_SYSTEM_ITEMS msi " +
            "WHERE rti.ITEM_ID = msi.INVENTORY_ITEM_ID " +
            "  AND rti.SHIPMENT_HEADER_ID = ?1 ",nativeQuery = true)
    List<RcvTransactionsInterface> getRcvTransactionsInterfaceByParentTransactionId(int ParenTransactionID);

    @Query(value = "SELECT rti.* " +
            "FROM RCV_TRANSACTIONS_INTERFACE rti " +
            "WHERE " +
            "   rti.SHIPMENT_HEADER_ID =?1 ",nativeQuery = true)
    List<RcvTransactionsInterface> test(int ParenTransactionID);




}
