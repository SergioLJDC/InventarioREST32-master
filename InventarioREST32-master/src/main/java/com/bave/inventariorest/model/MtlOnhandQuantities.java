package com.bave.inventariorest.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MTL_ONHAND_QUANTITIES")
public class MtlOnhandQuantities {

    @Id
    @Column(name="INVENTORY_ITEM_ID")
    private Long inventoryItemId;
    @Column(name="ORGANIZATION_ID")
    private Long organizationId;
    @Column(name="SUBINVENTORY_CODE")
    private String subinventoryCode;
    @Column(name="LOCATOR_ID")
    private Long locatorId;
    @Column(name="LOT_NUMBER")
    private String lotNumber;
    @Column(name="SERIAL_NUMBER")
    private String serialNumber;
    @Column(name="PRIMARY_TRANSACTION_QUANTITY")
    private Double primaryTransactionQuantity;
    @Column(name="USER_ID")
    private Long userId;
    @Column(name="STATUS_ID")
    private Long statusId;

    public MtlOnhandQuantities() {}

    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public String getSubinventoryCode() {
        return subinventoryCode;
    }

    public void setSubinventoryCode(String subinventoryCode) {
        this.subinventoryCode = subinventoryCode;
    }

    public Long getLocatorId() {
        return locatorId;
    }

    public void setLocatorId(Long locatorId) {
        this.locatorId = locatorId;
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

    public Double getPrimaryTransactionQuantity() {
        return primaryTransactionQuantity;
    }

    public void setPrimaryTransactionQuantity(Double primaryTransactionQuantity) {
        this.primaryTransactionQuantity = primaryTransactionQuantity;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }
}
