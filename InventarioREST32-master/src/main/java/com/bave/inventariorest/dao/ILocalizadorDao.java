package com.bave.inventariorest.dao;

import com.bave.inventariorest.model.Localizador;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ILocalizadorDao extends PagingAndSortingRepository<Localizador,Long> {

    @Query("SELECT loc FROM Localizador  loc where loc.codSubinventario=?1 order by loc.codLocalizador")
    List<Localizador>  getLocalizadoresBySubinventario(String subinventarioCodigo);





}
