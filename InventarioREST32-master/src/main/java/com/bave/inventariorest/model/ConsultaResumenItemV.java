package com.bave.inventariorest.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CONSULTA_RESUMEN_ITEM")
public class ConsultaResumenItemV {


    @Id
    @Column(name="ID")
    private Long ID;
    @Column(name="INVENTORY_ITEM_ID")
    private Long inventoryItemId;
    @Column(name="SEGMENT1")
    private String sigle;
    @Column(name="DESCRIPTION")
    private String description;
    @Column(name="QUANTITY")
    private Double cantidad;
    @Column(name="UNIDAD")
    private String unidad;

    public ConsultaResumenItemV() {}

    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getSigle() {
        return sigle;
    }

    public void setSigle(String sigle) {
        this.sigle = sigle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
}
