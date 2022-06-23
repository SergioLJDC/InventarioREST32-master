package com.bave.inventariorest.model;

import javax.persistence.*;

@Entity
@Table(name = "MTL_TRANSACTIONS_LOTS_IFACE")
public class MtlTransactionsLotsIface {

    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mtl_lots_gen")
   // @SequenceGenerator(name="mtl_lots_gen", sequenceName="mtl_lots_seq",allocationSize = 1)
    @Column(name = "TRANSACTION_INTERFACE_ID")
    private Long transactionInterfaceId;
    @Column(name = "LAST_UPDATE_DATE")
    private String lastUpdateDate;
    @Column(name = "LAST_UPDATE_BY")
    private Long lastUpdateBy;
    @Column(name = "CREATION_DATE")
    private String creationDate;
    @Column(name = "CREATED_BY")
    private Long createdBy;
    @Column(name = "PO_HEADER_ID")
    private Long poHeaderId;
    @Column(name = "PO_LINE_ID")
    private Long poLineId;
    @Column(name = "INVENTORY_ITEM_ID")
    private Long inventoryItemId;
    @Column(name = "LAST_UPDATE_LOGIN")
    private Long lastUpdateLogin;
    @Column(name = "LOT_NUMBER")
    private String lotNumber;
    @Column(name = "TRANSACTION_QUANTITY")
    private Double transactionQuantity;
    @Column(name = "PRIMARY_QUANTITY")
    private Double primaryQuantity;
    @Column(name = "SERIAL_TRANSACTION_TEMP_ID")
    private Long serialTransactionTempId;
    @Column(name = "PRODUCT_CODE")
    private String productCode;
    @Column(name = "PRODUCT_TRANSACTION_ID")
    private Long productTransactionId;
    @Column(name = "SUPPLIER_LOT_NUMBER")
    private String supplierLotNumber;
    @Column(name = "LOT_EXPIRATION_DATE")
    private String lotExpirationDate;
    @Column(name = "ATTRIBUTE_CATEGORY")
    private String attributeCategory;
    @Column(name = "ATTRIBUTE1")
    private String attrubute1;
    @Column(name = "ATTRIBUTE2")
    private String attrubute2;
    @Column(name = "ATTRIBUTE3")
    private String attrubute3;

    public MtlTransactionsLotsIface(){

    }

    public MtlTransactionsLotsIface(Long transactionInterfaceId, String lastUpdateDate, Long lastUpdateBy, String creationDate, Long createdBy, Long poHeaderId, Long poLineId, Long inventoryItemId, Long lastUpdateLogin, String lotNumber, Double transactionQuantity, Double primaryQuantity, Long serialTransactionTempId, String productCode, Long productTransactionId, String supplierLotNumber, String lotExpirationDate, String attributeCategory, String attrubute1, String attrubute2, String attrubute3) {
        this.transactionInterfaceId = transactionInterfaceId;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdateBy = lastUpdateBy;
        this.creationDate = creationDate;
        this.createdBy = createdBy;
        this.poHeaderId = poHeaderId;
        this.poLineId = poLineId;
        this.inventoryItemId = inventoryItemId;
        this.lastUpdateLogin = lastUpdateLogin;
        this.lotNumber = lotNumber;
        this.transactionQuantity = transactionQuantity;
        this.primaryQuantity = primaryQuantity;
        this.serialTransactionTempId = serialTransactionTempId;
        this.productCode = productCode;
        this.productTransactionId = productTransactionId;
        this.supplierLotNumber = supplierLotNumber;
        this.lotExpirationDate = lotExpirationDate;
        this.attributeCategory = attributeCategory;
        this.attrubute1 = attrubute1;
        this.attrubute2 = attrubute2;
        this.attrubute3 = attrubute3;
    }

    public Long getTransactionInterfaceId() {
        return transactionInterfaceId;
    }

    public void setTransactionInterfaceId(Long transactionInterfaceId) {
        this.transactionInterfaceId = transactionInterfaceId;
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

    public Long getPoHeaderId() {
        return poHeaderId;
    }

    public void setPoHeaderId(Long poHeaderId) {
        this.poHeaderId = poHeaderId;
    }

    public Long getPoLineId() {
        return poLineId;
    }

    public void setPoLineId(Long poLineId) {
        this.poLineId = poLineId;
    }

    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public Long getLastUpdateLogin() {
        return lastUpdateLogin;
    }

    public void setLastUpdateLogin(Long lastUpdateLogin) {
        this.lastUpdateLogin = lastUpdateLogin;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    public Double getTransactionQuantity() {
        return transactionQuantity;
    }

    public void setTransactionQuantity(Double transactionQuantity) {
        this.transactionQuantity = transactionQuantity;
    }

    public Double getPrimaryQuantity() {
        return primaryQuantity;
    }

    public void setPrimaryQuantity(Double primaryQuantity) {
        this.primaryQuantity = primaryQuantity;
    }

    public Long getSerialTransactionTempId() {
        return serialTransactionTempId;
    }

    public void setSerialTransactionTempId(Long serialTransactionTempId) {
        this.serialTransactionTempId = serialTransactionTempId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Long getProductTransactionId() {
        return productTransactionId;
    }

    public void setProductTransactionId(Long productTrasnactionId) {
        this.productTransactionId = productTrasnactionId;
    }

    public String getSupplierLotNumber() {
        return supplierLotNumber;
    }

    public void setSupplierLotNumber(String supplierLotNumber) {
        this.supplierLotNumber = supplierLotNumber;
    }

    public String getLotExpirationDate() {
        return lotExpirationDate;
    }

    public void setLotExpirationDate(String lotExpirationDate) {
        this.lotExpirationDate = lotExpirationDate;
    }

    public String getAttributeCategory() {
        return attributeCategory;
    }

    public void setAttributeCategory(String attributeCategory) {
        this.attributeCategory = attributeCategory;
    }

    public String getAttrubute1() {
        return attrubute1;
    }

    public void setAttrubute1(String attrubute1) {
        this.attrubute1 = attrubute1;
    }

    public String getAttrubute2() {
        return attrubute2;
    }

    public void setAttrubute2(String attrubute2) {
        this.attrubute2 = attrubute2;
    }

    public String getAttrubute3() {
        return attrubute3;
    }

    public void setAttrubute3(String attrubute3) {
        this.attrubute3 = attrubute3;
    }
}