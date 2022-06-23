package com.bave.inventariorest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORGANIZACION_PRINCIPAL")
public class OrganizacionPrincipal {


    @Id
    @Column(name = "ID_ORGANIZACION")
    private Long idOrganizacion;
    @Column(name = "CODE")
    private String code;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "NOMBRE_CORTO")
    private String nombreCorto;


    public OrganizacionPrincipal(Long idOrganizacion, String code, String nombre, String nombreCorto) {
        this.idOrganizacion = idOrganizacion;
        this.code = code;
        this.nombre = nombre;
        this.nombreCorto = nombreCorto;
    }

    public OrganizacionPrincipal(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreCorto() {
        return nombreCorto;
    }

    public void setNombreCorto(String nombreCorto) {
        this.nombreCorto = nombreCorto;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getIdOrganizacion() {
        return idOrganizacion;
    }

    public void setIdOrganizacion(Long idOrganizacion) {
        this.idOrganizacion = idOrganizacion;
    }




}
