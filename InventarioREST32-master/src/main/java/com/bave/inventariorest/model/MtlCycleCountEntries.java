package com.bave.inventariorest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MTL_CYCLE_COUNT_ENTRIES")
public class MtlCycleCountEntries {
    @Id
    @Column(name = "CYCLE_COUNT_ENTRY_ID")
    private Long cycleCountEntryId;
    @Column(name = "INVENTORY_ITEM_ID")
    private Long inventoryItemId;
    @Column(name = "SUBINVENTORY")
    private String subinventory;
    @Column(name = "ENTRY_STATUS_CODE")
    private String entryStatusCode;
    @Column(name = "ORGANIZATION_ID")
    private Long organizationId;
    @Column(name = "CYCLE_COUNT_HEADER_ID")
    private Long cycleCountHeaderId;
    @Column(name = "LOCATOR_ID")
    private Long LocatorId;
    @Column(name = "LOT_NUMBER")
    private String lotNumber;
    @Column(name = "SEGMENT1")
    private String segment1;        //sigle
    @Column(name = "PRIMARY_UOM_CODE")
    private String primaryUomCode;
    @Column(name = "SERIAL_NUMBER")
    private String serialNumber;
    @Column(name = "COUNT")
    private Double count;                 //cantidad
    @Column(name = "LAST_UPDATED")
    private String lastUpdated;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "LONG_DESCRIPTION")
    private String longDescription;
    @Column(name = "COD_LOCALIZADOR")
    private String locatorCode;

    public MtlCycleCountEntries() {
    }

    public Long getCycleCountEntryId() {
        return cycleCountEntryId;
    }

    public void setCycleCountEntryId(Long cycleCountEntryId) {
        this.cycleCountEntryId = cycleCountEntryId;
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

    public String getEntryStatusCode() {
        return entryStatusCode;
    }

    public void setEntryStatusCode(String entryStatusCode) {
        this.entryStatusCode = entryStatusCode;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public Long getCycleCountHeaderId() {
        return cycleCountHeaderId;
    }

    public void setCycleCountHeaderId(Long cycleCountHeaderId) {
        this.cycleCountHeaderId = cycleCountHeaderId;
    }

    public Long getLocatorId() {
        return LocatorId;
    }

    public void setLocatorId(Long locatorId) {
        LocatorId = locatorId;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
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

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
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

    public String getLocatorCode() {
        return locatorCode;
    }

    public void setLocatorCode(String locatorCode) {
        this.locatorCode = locatorCode;
    }
}
