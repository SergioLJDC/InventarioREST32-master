package com.bave.inventariorest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MTL_SERIAL_NUMBERS")
public class MtlSerialNumbers {
    @Id
    @Column(name = "INVENTORY_ITEM_ID")
    private Long inventoryItemId;
    @Column(name = "SERIAL_NUMBER")
    private String serialNumber;
    @Column(name = "LAST_UPDATE_DATE")
    private String lastUpdateDate;
    @Column(name = "LAST_UPDATED_BY")
    private Long lastUpdateBy;
    @Column(name = "CREATION_DATE")
    private String creationDate;
    @Column(name = "CREATED_BY")
    private Long createdBy;
    @Column(name = "LOT_NUMBER")
    private String lotNumber;
    @Column(name = "CURRENT_ORGANIZATION_ID")
    private Long currentOrganizationId;
    @Column(name = "SHIPMENT_HEADER_ID")
    private Long shipmentHeaderId;
    @Column(name = "TRANSACTION_INTERFACE_ID")
    private Long transactionInterfaceId;
    @Column(name = "ENTREGA_CREATION_DATE")
    private String entregaCreationDate;

    public MtlSerialNumbers() {}

    public MtlSerialNumbers(Long inventoryItemId, String serialNumber, String lastUpdateDate, Long lastUpdateBy, String creationDate, Long createdBy, String lotNumber, Long currentOrganizationId, Long shipmentHeaderId, Long transactionInterfaceId, String entregaCreationDate) {
        this.inventoryItemId = inventoryItemId;
        this.serialNumber = serialNumber;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdateBy = lastUpdateBy;
        this.creationDate = creationDate;
        this.createdBy = createdBy;
        this.lotNumber = lotNumber;
        this.currentOrganizationId = currentOrganizationId;
        this.shipmentHeaderId = shipmentHeaderId;
        this.transactionInterfaceId = transactionInterfaceId;
        this.entregaCreationDate = entregaCreationDate;
    }

    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Long getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(Long lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    public Long getCurrentOrganizationId() {
        return currentOrganizationId;
    }

    public void setCurrentOrganizationId(Long currentOrganizationId) {
        this.currentOrganizationId = currentOrganizationId;
    }

    public Long getShipmentHeaderId() {
        return shipmentHeaderId;
    }

    public void setShipmentHeaderId(Long shipmentHeaderId) {
        this.shipmentHeaderId = shipmentHeaderId;
    }

    public Long getTransactionInterfaceId() {
        return transactionInterfaceId;
    }

    public void setTransactionInterfaceId(Long transactionInterfaceId) {
        this.transactionInterfaceId = transactionInterfaceId;
    }

    public String getEntregaCreationDate() {
        return entregaCreationDate;
    }

    public void setEntregaCreationDate(String entregaCreationDate) {
        this.entregaCreationDate = entregaCreationDate;
    }
}
