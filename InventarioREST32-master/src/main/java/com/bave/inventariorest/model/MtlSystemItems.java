package com.bave.inventariorest.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "MTL_SYSTEM_ITEMS")
public class MtlSystemItems {
    @Id
    @Column(name = "INVENTORY_ITEM_ID")
    private Long inventoryItemId;
    @Column(name = "DESCRIPTION")
    private String description;                 //numero parte
    @Column(name = "LONG_DESCRIPTION")
    private String longDescription;             //numero parte
    @Column(name = "SEGMENT1")
    private String segment1;
    @Column(name = "PRIMARY_UOM_CODE")
    private String primaryUomCode;
    @Column(name = "LOT_CONTROL_CODE")
    private String lotControlCode;
    @Column(name = "SHELF_LIFE_CODE")
    private String shelfLifeCode;
    @Column(name = "SERIAL_NUMBER_CONTROL_CODE")
    private String serialNumberControlCode;

    public MtlSystemItems(){

    }

    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getSegment1() {
        return segment1;
    }

    public void setSegment1(String segment1) {
        this.segment1 = segment1;
    }

    public String getPrimaryUomCode() {
        return primaryUomCode;
    }

    public void setPrimaryUomCode(String primaryUomCode) {
        this.primaryUomCode = primaryUomCode;
    }

    public String getLotControlCode() {
        return lotControlCode;
    }

    public void setLotControlCode(String lotControlCode) {
        this.lotControlCode = lotControlCode;
    }

    public String getShelfLifeCode() {
        return shelfLifeCode;
    }

    public void setShelfLifeCode(String shelfLifeCode) {
        this.shelfLifeCode = shelfLifeCode;
    }

    public String getSerialNumberControlCode() {
        return serialNumberControlCode;
    }

    public void setSerialNumberControlCode(String serialNumberControlCode) {
        this.serialNumberControlCode = serialNumberControlCode;
    }
}