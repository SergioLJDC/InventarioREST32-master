package com.bave.inventariorest.dao;

import com.bave.inventariorest.model.Login;
import com.bave.inventariorest.model.XxpdaLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface IXxpdaLoginRepository extends JpaRepository<XxpdaLogin, Long> {

    @Query(value = "SELECT l.* FROM XXPDA_LOGIN l WHERE l.usuario = ?1",nativeQuery = true)
    List<XxpdaLogin> findByUsuario(String filtro);

    @Query(value = "SELECT l.* FROM XXPDA_LOGIN l WHERE l.usuario = ?1",nativeQuery = true)
    List<XxpdaLogin> findByUsuario1(String filtro);

    @Query(value = "SELECT UNIQUE l.* FROM XXPDA_LOGIN l WHERE l.usuario = ?1 AND l.pass = ?2",nativeQuery = true)
    List<XxpdaLogin> Confirmacion(String filtro , String filtro2);

}