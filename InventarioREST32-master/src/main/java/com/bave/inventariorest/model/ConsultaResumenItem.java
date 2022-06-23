package com.bave.inventariorest.model;



public class ConsultaResumenItem {


    private Long inventoryItemId;
    private String sigle;
    private String description;
    private Double cantidad;
    private String unidad;

    public ConsultaResumenItem() {}


    public ConsultaResumenItem(Long inventoryItemId, String sigle, String description, Double cantidad, String unidad) {
        this.inventoryItemId = inventoryItemId;
        this.sigle = sigle;
        this.description = description;
        this.cantidad = cantidad;
        this.unidad = unidad;
    }

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
