package com.bave.inventariorest.model;


import javax.persistence.*;

@Entity
@Table(name = "XXPDA_MTL_TRANS_LOTS_IFACE")
public class MtlTransactionsLotsIfaceEntrega {

    @Id
    @Column(name = "TRANSACTION_INTERFACE_ID")
    private Long transactionInterfaceId;
    @Column(name = "LAST_UPDATE_DATE")
    private String lastUpdateDate;
    @Column(name = "CREATION_DATE")
    private String creationDate;
    @Column(name = "CREATED_BY")
    private Long createdBy;
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
    private String attribute1;
    @Column(name = "ATTRIBUTE2")
    private String attribute2;
    @Column(name = "ATTRIBUTE3")
    private String attribute3;
    @Column(name = "ESTADO")
    private String estado;

    public MtlTransactionsLotsIfaceEntrega(){

    }

    public MtlTransactionsLotsIfaceEntrega(Long transactionInterfaceId, String lastUpdateDate, String creationDate, Long createdBy, Long lastUpdateLogin, String lotNumber, Double transactionQuantity, Double primaryQuantity, Long serialTransactionTempId, String productCode, Long productTransactionId, String supplierLotNumber, String lotExpirationDate, String attributeCategory, String attribute1, String attribute2, String attribute3, String estado) {
        this.transactionInterfaceId = transactionInterfaceId;
        this.lastUpdateDate = lastUpdateDate;
        this.creationDate = creationDate;
        this.createdBy = createdBy;
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
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
        this.attribute3 = attribute3;
        this.estado = estado;
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

    public void setProductTransactionId(Long productTransactionId) {
        this.productTransactionId = productTransactionId;
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

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
