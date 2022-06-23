package com.bave.inventariorest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORGANIZACION")
public class Organizacion {
    @Id
    @Column(name ="ID_ORGANIZACION")
    private Long idOrganizacion;
    @Column(name ="CODE")
    private String code;
    @Column(name ="TRANSFERENCIA")
    private String transferencia;

    public Organizacion() {

    }

    public String getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(String transferencia) {
        this.transferencia = transferencia;
    }

    public Long getIdOrganizacion() {
        return idOrganizacion;
    }

    public void setIdOrganizacion(Long idOrganizacion) {
        this.idOrganizacion = idOrganizacion;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
