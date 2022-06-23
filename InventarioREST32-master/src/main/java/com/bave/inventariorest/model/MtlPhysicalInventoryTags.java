package com.bave.inventariorest.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MTL_PHYSICAL_INVENTORY_TAGS")
public class MtlPhysicalInventoryTags {

    @Id
    @Column(name = "TAG_ID")
    private Long tagId;
    @Column(name = "PHYSICAL_INVENTORY_ID")
    private Long physicalInventoryId;
    @Column(name = "ORGANIZATION_ID")
    private Long organizationId;
    @Column(name = "INVENTORY_ITEM_ID")
    private Long inventoryItemId;
    @Column(name = "SUBINVENTORY")
    private String subinventory;
    @Column(name = "LOCATOR_ID")
    private Long locatorId;
    @Column(name = "COD_LOCALIZADOR")
    private String locatorCode;
    @Column(name = "LOT_NUMBER")
    private String lotNumber;
    @Column(name = "LOT_EXPIRATION_DATE")         //numero de lote
    private String lotExpirationDate;
    @Column(name = "SERIAL_NUM")
    private String serialNum;           //numero de serie
    @Column(name = "SEGMENT1")
    private String segment1;            //sigle
    @Column(name = "PRIMARY_UOM_CODE")
    private String primaryUomCode;      //UMD STOCK
    @Column(name = "PRIMARY_COUNT")
    private Double count;                 //cantidad
    @Column(name = "LAST_UPDATED")
    private String lastUpdated;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "LONG_DESCRIPTION")
    private String longDescription;

    public MtlPhysicalInventoryTags(){  }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public Long getPhysicalInventoryId() {
        return physicalInventoryId;
    }

    public void setPhysicalInventoryId(Long physicalInventoryId) {
        this.physicalInventoryId = physicalInventoryId;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getSubinventory() {
        return subinventory;
    }

    public void setSubinventory(String subinventory) {
        this.subinventory = subinventory;
    }

    public Long getLocatorId() {
        return locatorId;
    }

    public void setLocatorId(Long locatorId) {
        this.locatorId = locatorId;
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

    public String getLotExpirationDate() {
        return lotExpirationDate;
    }

    public void setLotExpirationDate(String lotExpirationDate) {
        this.lotExpirationDate = lotExpirationDate;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
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

    public Double getCount() {
        return count;
    }

    public void setCount(Double count) {
        this.count = count;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
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

}
