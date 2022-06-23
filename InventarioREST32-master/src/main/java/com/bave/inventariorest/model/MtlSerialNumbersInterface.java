package com.bave.inventariorest.model;

import javax.persistence.*;

@Entity
@Table(name = "MTL_NUMBERS_INTERFACE")
public class MtlSerialNumbersInterface {

    @Id
   // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mtl_numbers_gen")
   // @SequenceGenerator(name="mtl_numbers_gen", sequenceName="numbers_seq",allocationSize = 1)
    @Column(name = "TRANSACTION_INTERFACE_ID")
    private Long transactionInterfaceId;
    @Column(name = "LAST_UPDATE_DATE")
    private String lastUpdateDate;
    @Column(name = "LAST_UPDATED_BY")
    private Long lastUpdatedBy;
    @Column(name = "CREATION_DATE")
    private String creationDate;
    @Column(name = "CREATED_BY")
    private Long createdBy;
    @Column(name = "LAST_UPDATE_LOGIN")
    private Long lastUpdateLogin;
    @Column(name = "FM_SERIAL_NUMBER")
    private String fmSerialNumber;
    @Column(name = "TO_SERIAL_NUMBER")
    private String toSerialNumber;
    @Column(name = "PRODUCT_CODE")
    private String productCode;
    @Column(name = "PRODUCT_TRANSACTION_ID")
    private Long productTransactionId;

    public MtlSerialNumbersInterface() {
    }

    public MtlSerialNumbersInterface(Long transactionInterfaceId, String lastUpdateDate, Long lastUpdatedBy, String creationDate, Long createdBy, Long lastUpdateLogin, String fmSerialNumber, String toSerialNumber, String productCode, Long productTransactionId) {
        this.transactionInterfaceId = transactionInterfaceId;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.creationDate = creationDate;
        this.createdBy = createdBy;
        this.lastUpdateLogin = lastUpdateLogin;
        this.fmSerialNumber = fmSerialNumber;
        this.toSerialNumber = toSerialNumber;
        this.productCode = productCode;
        this.productTransactionId = productTransactionId;
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

    public Long getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(Long lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
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

    public String getFmSerialNumber() {
        return fmSerialNumber;
    }

    public void setFmSerialNumber(String fmSerialNumber) {
        this.fmSerialNumber = fmSerialNumber;
    }

    public String getToSerialNumber() {
        return toSerialNumber;
    }

    public void setToSerialNumber(String toSerialNumber) {
        this.toSerialNumber = toSerialNumber;
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
}
