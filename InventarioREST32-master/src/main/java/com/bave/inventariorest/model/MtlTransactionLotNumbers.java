package com.bave.inventariorest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MTL_TRANSACTION_LOT_NUMBERS")
public class MtlTransactionLotNumbers {
    @Id
    @Column(name = "TRANSACTION_ID")
    private Long transactionId;
    @Column(name = "INVENTORY_ITEM_ID")
    private Long inventoryItemId;
    @Column(name = "ORGANIZATION_ID")
    private Long organizationId;
    @Column(name = "LOT_NUMBER")
    private String lotNumber;
    @Column(name = "SERIAL_TRANSACTION_ID")
    private Long serialTransactionId;
    @Column(name = "LOT_ATTRIBUTE_CATEGORY")
    private String lotAttributeCategory;
    @Column(name = "C_ATTRIBUTE1")
    private String cAttribute1;
    @Column(name = "C_ATTRIBUTE2")
    private String cAttribute2;
    @Column(name = "C_ATTRIBUTE3")
    private String cAttribute3;
    @Column(name = "SHIPMENT_HEADER_ID")
    private Long shipmentHeaderId;
    @Column(name = "TRANSACTION_INTERFACE_ID")
    private Long transactionInterfaceId;
    @Column(name = "ENTREGA_CREATION_DATE")
    private String entregaCreationDate;

    public MtlTransactionLotNumbers() {}

    public MtlTransactionLotNumbers(Long transactionId, Long inventoryItemId, Long organizationId, String lotNumber, Long serialTransactionId, String lotAttributeCategory, String cAttribute1, String cAttribute2, String cAttribute3, Long shipmentHeaderId, Long transactionInterfaceId, String entregaCreationDate) {
        this.transactionId = transactionId;
        this.inventoryItemId = inventoryItemId;
        this.organizationId = organizationId;
        this.lotNumber = lotNumber;
        this.serialTransactionId = serialTransactionId;
        this.lotAttributeCategory = lotAttributeCategory;
        this.cAttribute1 = cAttribute1;
        this.cAttribute2 = cAttribute2;
        this.cAttribute3 = cAttribute3;
        this.shipmentHeaderId = shipmentHeaderId;
        this.transactionInterfaceId = transactionInterfaceId;
        this.entregaCreationDate = entregaCreationDate;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

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

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    public Long getSerialTransactionId() {
        return serialTransactionId;
    }

    public void setSerialTransactionId(Long serialTransactionId) {
        this.serialTransactionId = serialTransactionId;
    }

    public String getLotAttributeCategory() {
        return lotAttributeCategory;
    }

    public void setLotAttributeCategory(String lotAttributeCategory) {
        this.lotAttributeCategory = lotAttributeCategory;
    }

    public String getcAttribute1() {
        return cAttribute1;
    }

    public void setcAttribute1(String cAttribute1) {
        this.cAttribute1 = cAttribute1;
    }

    public String getcAttribute2() {
        return cAttribute2;
    }

    public void setcAttribute2(String cAttribute2) {
        this.cAttribute2 = cAttribute2;
    }

    public String getcAttribute3() {
        return cAttribute3;
    }

    public void setcAttribute3(String cAttribute3) {
        this.cAttribute3 = cAttribute3;
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
