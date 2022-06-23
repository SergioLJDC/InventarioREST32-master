package com.bave.inventariorest.model;


import javax.persistence.*;

@Entity
public class Login {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer identificador;

    @Column(name = "ORG")
    private  Integer org;

    @Column(name = "USUARIO")
    private String Usuario;

    @Column(name = "PASS")
    private String Pass;

    public Login() {
    }

    public Integer getId() {
        return identificador;
    }

    public void setId(Integer id) {
        identificador = id;
    }

    public Integer getOrg() {
        return org;
    }

    public void setOrg(Integer org) {
        this.org = org;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String pass) {
        Pass = pass;
    }
}
