package com.bave.inventariorest.dao;
import java.util.List;

import com.bave.inventariorest.model.Subinventario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ISubinventarioDao extends PagingAndSortingRepository<Subinventario,Long> {



    @Query("SELECT sub FROM Subinventario sub order by sub.codSubinventario")
    List<Subinventario> getAll();

}
