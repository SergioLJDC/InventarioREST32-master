package com.bave.inventariorest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RCV_HEADERS_INTERFACE")
public class RcvHeadersInterface {

    @Id
    @Column(name = "HEADER_INTERFACE_ID")
    private Long headerInterfaceId;
    @Column(name = "RECEIPT_SOURCE_CODE")
    private String reciptSourceCode;
    @Column(name = "TRANSACTION_TYPE")
    private String transactionType;
    @Column(name = "AUTOTRANSACTCODE")
    private String autoTransactCode;
    @Column(name = "LAST_UPDATE_DATE")
    private String lastUpdateDate;
    @Column(name = "LAST_UPDATED_BY")
    private Long lastUpdateBy;
    @Column(name = "CREATED_BY")
    private Long createdBy;
    @Column(name = "RECEIPT_NUM")
    private Long reciptNum;
    @Column(name = "VENDOR_ID")
    private Long vendorId;
    @Column(name = "VENDOR_SITE_CODE")
    private String vendorSiteCode;
    @Column(name = "VENDOR_SITE_ID")
    private Long vendorSiteId;
    @Column(name = "SHIP_TO_ORGANIZATION_CODE")
    private String shipToOrganizationCode;
    @Column(name = "LOCATION_ID")
    private Long locationId;
    @Column(name = "RECEIVER_ID")
    private Long receiverId;
    @Column(name = "CURRENCY_CODE")
    private String currencyCode;
    @Column(name = "CONVERSION_RATE_TYPE")
    private String conversionRateType;
    @Column(name = "CONVERSION_RATE")
    private Long conversionRate;
    @Column(name = "CONVERSION_RATE_DATE")
    private String conversionRateDate;
    @Column(name = "PAYMENT_TERMS_ID")
    private Long paymentTermsId;
    @Column(name = "TRANSACTION_DATE")
    private String transactionDate;
    @Column(name = "COMMENTS")
    private String comments;
    @Column(name = "ORG_ID")
    private Long orgId;
    @Column(name = "PROCESSING_STATUS_CODE")
    private String processingStatusCode;
    @Column(name = "VALIDATION_FLAG")
    private String validationFlag;
    @Column(name = "GROUP_ID")
    private Long groupId;

    public RcvHeadersInterface() { }

    public RcvHeadersInterface(Long headerInterfaceId, String reciptSourceCode, String transactionType, String autoTransactCode, String lastUpdateDate, Long lastUpdateBy, Long createdBy, Long reciptNum, Long vendorId, String vendorSiteCode, Long vendorSiteId, String shipToOrganizationCode, Long locationId, Long receiverId, String currencyCode, String conversionRateType, Long conversionRate, String conversionRateDate, Long paymentTermsId, String transactionDate, String comments, Long orgId, String processingStatusCode, String validationFlag, Long groupId) {
        this.headerInterfaceId = headerInterfaceId;
        this.reciptSourceCode = reciptSourceCode;
        this.transactionType = transactionType;
        this.autoTransactCode = autoTransactCode;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdateBy = lastUpdateBy;
        this.createdBy = createdBy;
        this.reciptNum = reciptNum;
        this.vendorId = vendorId;
        this.vendorSiteCode = vendorSiteCode;
        this.vendorSiteId = vendorSiteId;
        this.shipToOrganizationCode = shipToOrganizationCode;
        this.locationId = locationId;
        this.receiverId = receiverId;
        this.currencyCode = currencyCode;
        this.conversionRateType = conversionRateType;
        this.conversionRate = conversionRate;
        this.conversionRateDate = conversionRateDate;
        this.paymentTermsId = paymentTermsId;
        this.transactionDate = transactionDate;
        this.comments = comments;
        this.orgId = orgId;
        this.processingStatusCode = processingStatusCode;
        this.validationFlag = validationFlag;
        this.groupId = groupId;
    }

    public Long getHeaderInterfaceId() {
        return headerInterfaceId;
    }

    public void setHeaderInterfaceId(Long headerInterfaceId) {
        this.headerInterfaceId = headerInterfaceId;
    }

    public String getReciptSourceCode() {
        return reciptSourceCode;
    }

    public void setReciptSourceCode(String reciptSourceCode) {
        this.reciptSourceCode = reciptSourceCode;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getAutoTransactCode() {
        return autoTransactCode;
    }

    public void setAutoTransactCode(String autoTransactCode) {
        this.autoTransactCode = autoTransactCode;
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

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getReciptNum() {
        return reciptNum;
    }

    public void setReciptNum(Long reciptNum) {
        this.reciptNum = reciptNum;
    }

    public Long getVendorId() {
        return vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorSiteCode() {
        return vendorSiteCode;
    }

    public void setVendorSiteCode(String vendorSiteCode) {
        this.vendorSiteCode = vendorSiteCode;
    }

    public Long getVendorSiteId() {
        return vendorSiteId;
    }

    public void setVendorSiteId(Long vendorSiteId) {
        this.vendorSiteId = vendorSiteId;
    }

    public String getShipToOrganizationCode() {
        return shipToOrganizationCode;
    }

    public void setShipToOrganizationCode(String shipToOrganizationCode) {
        this.shipToOrganizationCode = shipToOrganizationCode;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public Long getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getConversionRateType() {
        return conversionRateType;
    }

    public void setConversionRateType(String conversionRateType) {
        this.conversionRateType = conversionRateType;
    }

    public Long getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(Long conversionRate) {
        this.conversionRate = conversionRate;
    }

    public String getConversionRateDate() {
        return conversionRateDate;
    }

    public void setConversionRateDate(String conversionRateDate) {
        this.conversionRateDate = conversionRateDate;
    }

    public Long getPaymentTermsId() {
        return paymentTermsId;
    }

    public void setPaymentTermsId(Long paymentTermsId) {
        this.paymentTermsId = paymentTermsId;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getProcessingStatusCode() {
        return processingStatusCode;
    }

    public void setProcessingStatusCode(String processingStatusCode) {
        this.processingStatusCode = processingStatusCode;
    }

    public String getValidationFlag() {
        return validationFlag;
    }

    public void setValidationFlag(String validationFlag) {
        this.validationFlag = validationFlag;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }
}
