package com.bave.inventariorest.dao;

import com.bave.inventariorest.model.AttributoLote;
import org.springframework.data.jpa.mapping.JpaPersistentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IAttriburoLoteDao extends CrudRepository<AttributoLote, Long> {
    List<AttributoLote> findAll();
}
