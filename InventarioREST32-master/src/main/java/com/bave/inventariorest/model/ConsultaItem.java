package com.bave.inventariorest.model;

public class ConsultaItem {

    private String subinventoryCode;
    private String locatorCode;
    private String lotNumber;
    private String serialNumber;
    private Long inventoryItemId;
    private String sigle;
    private String description;
    private Double cantidad;
    private String unidad;

    public ConsultaItem() { }

    public ConsultaItem(String subinventoryCode, String locatorCode, String lotNumber, String serialNumber, Long inventoryItemId, String sigle, String description, Double cantidad, String unidad) {
        this.subinventoryCode = subinventoryCode;
        this.locatorCode = locatorCode;
        this.lotNumber = lotNumber;
        this.serialNumber = serialNumber;
        this.inventoryItemId = inventoryItemId;
        this.sigle = sigle;
        this.description = description;
        this.cantidad = cantidad;
        this.unidad = unidad;
    }

    public String getSubinventoryCode() {
        return subinventoryCode;
    }

    public void setSubinventoryCode(String subinventoryCode) {
        this.subinventoryCode = subinventoryCode;
    }

    public String getLocatorCode() {
        return locatorCode;
    }

    public void setLocatorCode(String locatorCode) {
        this.locatorCode = locatorCode;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
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
