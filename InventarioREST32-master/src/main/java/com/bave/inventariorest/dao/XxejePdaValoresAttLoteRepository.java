package com.bave.inventariorest.dao;

import com.bave.inventariorest.model.XxejePdaValoresAttLote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface XxejePdaValoresAttLoteRepository extends JpaRepository<XxejePdaValoresAttLote, Long> {

    List<XxejePdaValoresAttLote> findAll();


    @Query(value = "SELECT XPVAL.FLEX_VALUE FROM  XXEJE_PDA_VALORES_ATT_LOTE XPVAL " +
            "WHERE XPVAL.FLEX_VALUE_SET_ID = ?1" ,nativeQuery = true)
    List<String> ListaDeValoresByFlexId(Long FlexId);
    @Query(value = "SELECT XPVAL.FLEX_VALUE FROM  XXEJE_PDA_VALORES_ATT_LOTE XPVAL  " +
            "            WHERE XPVAL.FLEX_VALUE_SET_ID = ?1",nativeQuery = true)
    List<String> ValoresAttributoById(Long id);
    @Query(value = "SELECT XPVAL.FLEX_VALUE FROM  XXEJE_PDA_VALORES_ATT_LOTE XPVAL  " +
            "            WHERE XPVAL.FLEX_VALUE_SET_ID = ?1",nativeQuery = true)
    String nombreAtributo(Long id);

}