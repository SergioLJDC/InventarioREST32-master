package com.bave.inventariorest.dao;
import com.bave.inventariorest.model.DatosCabeceraRecepcion;
import com.bave.inventariorest.model.DatosRecepcion;
import com.bave.inventariorest.model.RcvTransactionsInterface;

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


}
