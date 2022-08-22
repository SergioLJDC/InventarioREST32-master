package com.bave.inventariorest.dao;

import com.bave.inventariorest.MultipleKey.RcvTransactionsId;
import com.bave.inventariorest.model.RcvTransactionInterfaceDesModel;
import com.bave.inventariorest.model.RcvTransactionInterfaceId;
import com.bave.inventariorest.model.RcvTransactionsInterface;
import com.bave.inventariorest.model.RcvTransactionsInterfaceNew;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@Repository
public interface IRcvTransactionsInterfaceNew extends CrudRepository<RcvTransactionsInterfaceNew,RcvTransactionsId> {

    @Transactional
    @Modifying
    @Query(value = "DELETE  FROM  RCV_TRANSACTIONS_INTERFACE_DES ITI " +
            "WHERE ITI.INTERFACE_TRANSACTION_ID = ?1 AND ITI.CREATED_BY = ?2 ",nativeQuery = true)
            void deleteTransacion(Long transaction , Long id);


    @Query(value = "SELECT NVL( ( RT.QUANTITY - T1.QUANTITY_HAND),0) AS CANTIDAD_RESERVADA FROM (  " +
            "Select NVL(SUM(RTI.QUANTITY),0) QUANTITY_HAND " +
            "            from RCV_TRANSACTIONS_INTERFACE_DES RTI " +
            "            where RTI.PARENT_TRANSACTION_ID = ?1) T1, " +
            "             RCV_TRANSACTIONS RT " +
            "WHERE RT.TRANSACTION_ID = ?1",nativeQuery = true)
    public int getSumaEntregadosByParentTransactionId(int ParenTransactionID);


    @Query(value = "SELECT rti.* " +
            "FROM RCV_TRANSACTIONS_INTERFACE_DES rti , " +
            "     MTL_SYSTEM_ITEMS msi " +
            "WHERE rti.ITEM_ID = msi.INVENTORY_ITEM_ID " +
            "  AND rti.SHIPMENT_HEADER_ID = ?1 ",nativeQuery = true)
    public List<RcvTransactionsInterface> getRcvTransactionsInterfaceByParentTransactionId(int ParenTransactionID);

    @Query(value = "SELECT rti.* " +
            "            FROM RCV_TRANSACTIONS_INTERFACE_DES rti " +
            "            WHERE " +
            "            rti.SHIPMENT_HEADER_ID =?1",nativeQuery = true)
    public  List<RcvTransactionInterfaceId> test(int ParenTransactionID);

    @Query(value = "SELECT rti.* " +
            "            FROM RCV_TRANSACTIONS_INTERFACE_DES rti " +
            "            WHERE " +
            "            rti.SHIPMENT_HEADER_ID =?1",nativeQuery = true)
    public  List<RcvTransactionsInterfaceNew> getToShipment(Long  Shipment);

    List<RcvTransactionsInterfaceNew> getByShipmentHeaderId(Long Shipment);

    List<RcvTransactionsInterfaceNew> findAll();


}
