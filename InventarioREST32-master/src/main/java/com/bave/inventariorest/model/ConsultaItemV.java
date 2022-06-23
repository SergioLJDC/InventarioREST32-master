package com.bave.inventariorest.model;



import javax.persistence.*;

@Entity
@Table(name="CONSULTA_ITEM")
public class ConsultaItemV {
    @Id
    @Column(name="ID")
    private Long ID;
    @Column(name="SUBINVENTORY_CODE")
    private String subinventoryCode;
    @Column(name="COD_LOCALIZADOR")
    private String locatorCode;
    @Column(name="LOT_NUMBER")
    private String lotNumber;
    @Column(name="SERIAL_NUMBER")
    private String serialNumber;
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

    public ConsultaItemV() { }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
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
