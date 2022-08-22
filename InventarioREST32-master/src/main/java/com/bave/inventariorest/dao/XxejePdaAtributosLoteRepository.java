package com.bave.inventariorest.dao;

import com.bave.inventariorest.model.XxejePdaAtributosLote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface XxejePdaAtributosLoteRepository extends JpaRepository<XxejePdaAtributosLote, Long> {



    List<XxejePdaAtributosLote> findAll();
    List<XxejePdaAtributosLote> findAllById(long id);

    @Query(value = "SELECT COUNT(ID) FROM XXEJE_PDA_ATRIBUTOS_LOTE WHERE DESCRIPTIVE_FLEX_CONTEXT_CODE = ?1",nativeQuery = true)
    int Contador(String Categoria);

    @Query(value = "SELECT DISTINCT (DESCRIPTIVE_FLEX_CONTEXT_CODE) FROM XXEJE_PDA_ATRIBUTOS_LOTE",nativeQuery = true )
    List<String> Categorias();

    @Query(value = "SELECT XPAL.* FROM INVENTARIO.XXEJE_PDA_ATRIBUTOS_LOTE XPAL " +
            "WHERE XPAL.DESCRIPTIVE_FLEX_CONTEXT_CODE = ?1 ORDER BY  APPLICATION_COLUMN_NAME ASC ",nativeQuery = true)
    List<XxejePdaAtributosLote> objCategorias(String Catergoria);


    @Query(value = "SELECT  XPAL.FLEX_VALUE_SET_ID FROM INVENTARIO.XXEJE_PDA_ATRIBUTOS_LOTE XPAL WHERE XPAL.APPLICATION_COLUMN_NAME = ?1 AND XPAL.DESCRIPTIVE_FLEX_CONTEXT_CODE = ?2",nativeQuery = true)
    int IdAtt(String Att ,String Categoria);




    @Query(value = "SELECT XPAL.FORM_LEFT_PROMPT FROM INVENTARIO.XXEJE_PDA_ATRIBUTOS_LOTE XPAL " +
            "WHERE XPAL.DESCRIPTIVE_FLEX_CONTEXT_CODE = ?1 " +
            "AND XPAL.APPLICATION_COLUMN_NAME = ?2",nativeQuery = true)
    String hintAttributo(String Categoria,String AtributoN);






}