package com.bave.inventariorest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "PO_HEADERS_ALL")
public class PoHeadersAll  {

    @Id
    @Column(name = "PO_HEADER_ID")
    private Long po_header_id;
    @Column(name = "CREATED_BY")
    private Long createdBy;
    @Column(name = "CREATION_DATE")
    private String creationDate;
    @Column(name = "VENDOR_NAME")
    private String vendorName;
    @Column(name = "VENDOR_ID")
    private Long vendorId;
    @Column(name = "VENDOR_SITE_ID")
    private Long vendorSiteId;
    @Column(name = "VENDOR_SITE_CODE")
    private String vendorSiteCode;


    @Column(name = "SEGMENT1")
    private String Segment1;
    @Column(name = "ORG_ID")
    private Long orgId;
    @Column(name = "APPROVED_DATE")
    private String approvedDate;
    @Column(name = "OPERATING_UNIT")
    private String operatingUnit;
    @Column(name = "TERMS_ID")
    private Long termsId;
    @Column(name = "CURRENCY_CODE")
    private String currencyCode;
    @Column(name = "RATE_TYPE")
    private String rateType;
    @Column(name = "RATE_DATE")
    private String rateDate;
    @Column(name = "RATE")
    private Long rate;
    @Column(name = "USER_ID")
    private Long userId;
    @Column(name = "RECEIPT_NUM")
    private Long receipt_num;
    @Column(name = "COMMENTS")
    private String comments;


    public PoHeadersAll() {
    }

    public PoHeadersAll(Long po_header_id, Long createdBy, String creationDate, String vendorName, Long vendorId, Long vendorSiteId, String vendorSiteCode, String segment1, Long orgId, String approvedDate, String operatingUnit, Long termsId, String currencyCode, String rateType, String rateDate, Long rate, Long userId, Long receipt_num, String comments) {
        this.po_header_id = po_header_id;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.vendorName = vendorName;
        this.vendorId = vendorId;
        this.vendorSiteId = vendorSiteId;
        this.vendorSiteCode = vendorSiteCode;
        Segment1 = segment1;
        this.orgId = orgId;
        this.approvedDate = approvedDate;
        this.operatingUnit = operatingUnit;
        this.termsId = termsId;
        this.currencyCode = currencyCode;
        this.rateType = rateType;
        this.rateDate = rateDate;
        this.rate = rate;
        this.userId = userId;
        this.receipt_num = receipt_num;
        this.comments = comments;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public Long getVendorId() {
        return vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public Long getVendorSiteId() {
        return vendorSiteId;
    }

    public void setVendorSiteId(Long vendorSiteId) {
        this.vendorSiteId = vendorSiteId;
    }

    public String getVendorSiteCode() {
        return vendorSiteCode;
    }

    public void setVendorSiteCode(String vendorSiteCode) {
        this.vendorSiteCode = vendorSiteCode;
    }

    public Long getPoHeaderId() {
        return po_header_id;
    }

    public void setPoHeaderId(Long poHeaderId) {
        this.po_header_id = poHeaderId;
    }

    public String getSegment1() {
        return Segment1;
    }

    public void setSegment1(String segment1) {
        segment1 = segment1;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getApprovedDate() {
        return approvedDate;
    }

    public void setApprovedDate(String approvedDate) {
        this.approvedDate = approvedDate;
    }

    public String getOperatingUnit() {
        return operatingUnit;
    }

    public void setOperatingUnit(String operatingUnit) {
        this.operatingUnit = operatingUnit;
    }

    public Long getTermsId() {
        return termsId;
    }

    public void setTermsId(Long termsId) {
        this.termsId = termsId;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    public String getRateDate() {
        return rateDate;
    }

    public void setRateDate(String rateDate) {
        this.rateDate = rateDate;
    }

    public Long getRate() {
        return rate;
    }

    public void setRate(Long rate) {
        this.rate = rate;
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

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
