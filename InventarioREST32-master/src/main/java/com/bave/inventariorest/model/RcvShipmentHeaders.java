package com.bave.inventariorest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RCV_SHIPMENT_HEADERS")
public class RcvShipmentHeaders {
    @Id
    @Column(name = "SHIPMENT_HEADER_ID")
    private Long shipmentHeaderId;
    @Column(name = "LAST_UPDATE_DATE")
    private String lastUpdateDate;
    @Column(name = "LAST_UPDATED_BY")
    private Long lastUpdatedBy;
    @Column(name = "CREATION_DATE")
    private  String creationDate;
    @Column(name = "CREATED_BY")
    private Long createdBy;
    @Column(name = "USER_ID")
    private Long UserId;
    @Column(name = "VENDOR_ID")
    private Long vendorId;
    @Column(name = "VENDOR_SITE_ID")
    private Long vendorSiteId;
    @Column(name = "ORGANIZATION_ID")
    private Long organizationId;
    @Column(name = "SHIPMENT_NUM")
    private String shipmentNum;
    @Column(name = "RECEIPT_NUM")
    private String receiptNum;
    @Column(name = "EMPLOYEE_ID")
    private Long employeeId;
    @Column(name = "SHIP_TO_ORG_ID")
    private Long shipToOrgId;
    @Column(name = "PO_NUMBER")
    private Long poNumber;
    @Column(name = "HEADERINTERFACEID")
    private Long headerInterfaceId;
    @Column(name = "INTERFACETRANSACTIONID")
    private Long interfaceTransactionId;
    @Column(name = "GROUPID")
    private Long groupId;
    @Column(name = "TRANSACTIONINTERFACEID")
    private Long transactionInterfaceId;


    public RcvShipmentHeaders() {
    }

    public Long getShipmentHeaderId() {
        return shipmentHeaderId;
    }

    public void setShipmentHeaderId(Long shipmentHeaderId) {
        this.shipmentHeaderId = shipmentHeaderId;
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

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
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

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public String getShipmentNum() {
        return shipmentNum;
    }

    public void setShipmentNum(String shipmentNum) {
        this.shipmentNum = shipmentNum;
    }

    public String getReceiptNum() {
        return receiptNum;
    }

    public void setReceiptNum(String receiptNum) {
        this.receiptNum = receiptNum;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getShipToOrgId() {
        return shipToOrgId;
    }

    public void setShipToOrgId(Long shipToOrgId) {
        this.shipToOrgId = shipToOrgId;
    }

    public Long getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(Long poNumber) {
        this.poNumber = poNumber;
    }

    public Long getHeaderInterfaceId() {
        return headerInterfaceId;
    }

    public void setHeaderInterfaceId(Long headerInterfaceId) {
        this.headerInterfaceId = headerInterfaceId;
    }

    public Long getInterfaceTransactionId() {
        return interfaceTransactionId;
    }

    public void setInterfaceTransactionId(Long interfaceTransactionId) {
        this.interfaceTransactionId = interfaceTransactionId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getTransactionInterfaceId() {
        return transactionInterfaceId;
    }

    public void setTransactionInterfaceId(Long transactionInterfaceId) {
        this.transactionInterfaceId = transactionInterfaceId;
    }
}
