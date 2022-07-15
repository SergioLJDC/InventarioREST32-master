package com.bave.inventariorest.dao;
import com.bave.inventariorest.model.RcvHeadersInterface;
import com.bave.inventariorest.model.XxejePdaAtributosLote;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface IRcvHeadersInterfaceDao extends PagingAndSortingRepository<RcvHeadersInterface,Long> {




    void deleteByHeaderInterfaceId(Long headerInterfaceId);

    @Query( " SELECT rcv " +
            " FROM " +
            "     RcvHeadersInterface rcv" +
            " WHERE " +
            "     rcv.headerInterfaceId = ?1 ")
    RcvHeadersInterface get(Long headerInterfaceId);

    @Query(value = "SELECT XPAL.* FROM INVENTARIO.XXEJE_PDA_ATRIBUTOS_LOTE XPAL " +
            "WHERE XPAL.DESCRIPTIVE_FLEX_CONTEXT_CODE = ?1",nativeQuery = true)
    List<String> objCategorias(String Catergoria);

   /*
    @Query(value = "SELECT  PLA.LINE_NUM " +
            "FROM RCV_TRANSACTIONS_INTERFACE RTI , " +
            "               PO_LINES_ALL PLA " +
            "          WHERE PLA.PO_LINE_ID = RTI.PO_LINE_ID " +
                   "AND RTI.SEGMENT1 = ?1",nativeQuery = true)
    */




    @Query(value = "SELECT  PLA.LINE_NUM FROM PO_LINES_ALL PLA ",nativeQuery = true)
    List<Long> lineasTomadasBySegment();




}
