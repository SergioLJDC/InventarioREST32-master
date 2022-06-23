package com.bave.inventariorest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "SUBINVENTARIO")
public class Subinventario {

    @Column(name = "ORGANIZATION_ID")
    private Long organizationId;
    @Id
    @Column(name = "COD_SUBINVENTARIO")
    private String codSubinventario;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "COD_LOCALIZADOR")
    private String codLocalizador;

    public Subinventario() {}

    public Subinventario(Long organizationId, String codSubinventario, String description, String codLocalizador) {
        this.organizationId = organizationId;
        this.codSubinventario = codSubinventario;
        this.description = description;
        this.codLocalizador = codLocalizador;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public String getCodSubinventario() {
        return codSubinventario;
    }

    public void setCodSubinventario(String codSubinventario) {
        this.codSubinventario = codSubinventario;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCodLocalizador() {
        return codLocalizador;
    }

    public void setCodLocalizador(String codLocalizador) {
        this.codLocalizador = codLocalizador;
    }

}
