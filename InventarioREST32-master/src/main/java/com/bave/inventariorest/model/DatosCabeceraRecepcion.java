package com.bave.inventariorest.model;

public class DatosCabeceraRecepcion {

    private Long userId;
    private Long receipt_num;
    private Long vendorId;
    private String vendorSiteCode;
    private Long vendorSiteId;
    private String currencyCode;
    private String rateType;
    private Long rate;
    private String rateDate;
    private Long termsId;
    private Long orgId;

    public DatosCabeceraRecepcion() {}

    public DatosCabeceraRecepcion(Long userId, Long receiptNum, Long vendorId, String vendorSiteCode, Long vendorSiteId, String currencyCode, String rateType, Long rate, String rateDate, Long termsId, Long orgId) {
        this.userId = userId;
        this.receipt_num = receiptNum;
        this.vendorId = vendorId;
        this.vendorSiteCode = vendorSiteCode;
        this.vendorSiteId = vendorSiteId;
        this.currencyCode = currencyCode;
        this.rateType = rateType;
        this.rate = rate;
        this.rateDate = rateDate;
        this.termsId = termsId;
        this.orgId = orgId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getReceiptNum() {
        return receipt_num;
    }

    public void setReceiptNum(Long receiptNum) {
        this.receipt_num = receiptNum;
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

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currrencyCode) {
        this.currencyCode = currrencyCode;
    }

    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    public Long getRate() {
        return rate;
    }

    public void setRate(Long rate) {
        this.rate = rate;
    }

    public String getRateDate() {
        return rateDate;
    }

    public void setRateDate(String rateDate) {
        this.rateDate = rateDate;
    }

    public Long getTermsId() {
        return termsId;
    }

    public void setTermsId(Long termsId) {
        this.termsId = termsId;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

}
