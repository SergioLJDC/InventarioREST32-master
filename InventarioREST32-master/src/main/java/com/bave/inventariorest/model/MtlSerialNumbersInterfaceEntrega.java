package com.bave.inventariorest.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "XXPDA_MTL_SERIAL_NUM_IFACE")
public class MtlSerialNumbersInterfaceEntrega {


    @Id
    @Column(name = "PRODUCT_TRANSACTION_ID")
    private Long productTransactionId;
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
    @Column(name = "ESTADO")
    private String estado;

    public MtlSerialNumbersInterfaceEntrega() {
    }


    public MtlSerialNumbersInterfaceEntrega(Long productTransactionId, String lastUpdateDate, Long lastUpdatedBy, String creationDate, Long createdBy, Long lastUpdateLogin, String fmSerialNumber, String toSerialNumber, String productCode, String estado) {
        this.productTransactionId = productTransactionId;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.creationDate = creationDate;
        this.createdBy = createdBy;
        this.lastUpdateLogin = lastUpdateLogin;
        this.fmSerialNumber = fmSerialNumber;
        this.toSerialNumber = toSerialNumber;
        this.productCode = productCode;
        this.estado = estado;
    }

    public Long getProductTransactionId() {
        return productTransactionId;
    }

    public void setProductTransactionId(Long productTransactionId) {
        this.productTransactionId = productTransactionId;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
