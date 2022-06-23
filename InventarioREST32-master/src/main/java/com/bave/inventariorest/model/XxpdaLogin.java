package com.bave.inventariorest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "XXPDA_LOGIN")
public class XxpdaLogin {
    @Column(name = "USUARIO", length = 250)
    private String usuario;

    @Column(name = "PASS", length = 250)
    private String pass;

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "ORG")
    private Long org;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrg() {
        return org;
    }

    public void setOrg(Long org) {
        this.org = org;
    }

}