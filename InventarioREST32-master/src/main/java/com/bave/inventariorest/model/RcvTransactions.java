package com.bave.inventariorest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RCV_TRANSACTIONS")
public class RcvTransactions {
    @Id
    @Column(name = "TRANSACTION_ID")
    private Long transactionId;
    @Column(name = "LAST_UPDATE_DATE")
    private String lastUpdateDate;
    @Column(name = "LAST_UPDATED_BY")
    private Long lastUpdatedBy;
    @Column(name = "CREATION_DATE")
    private String creationDate;
    @Column(name = "CREATED_BY")
    private Long createdBy;
    @Column(name = "TRANSACTION_TYPE")
    private String transactionType;
    @Column(name = "TRANSACTION_DATE")
    private String transactionDate;
    @Column(name = "QUANTITY")
    private Double quantity;
    @Column(name = "UNIT_OF_MEASURE")
    private String unitOfMeasure;
    @Column(name = "SHIPMENT_HEADER_ID")
    private Long shipmentHeaderId;
    @Column(name = "SHIPMENT_LINE_ID")
    private Long  shipmentLineId;
    @Column(name = "SOURCE_DOCUMENT_CODE")
    private String sourceDocumentCode;
    @Column(name = "DESTINATION_TYPE_CODE")
    private String destinationTypeCode;
    @Column(name = "PRIMARY_UNIT_OF_MEASURE")
    private String primaryUnitOfMeasure;
    @Column(name = "UOM_CODE")
    private String UomCode;
    @Column(name = "EMPLOYEE_ID")
    private Long employeeId;
    @Column(name = "PO_HEADER_ID")
    private Long poHeaderId;
    @Column(name = "PO_LINE_ID")
    private Long poLineId;
    @Column(name = "PO_LINE_LOCATION_ID")
    private Long poLineLocationId;
    @Column(name = "PO_DISTRIBUTION_ID")
    private Long poDistributionId;
    @Column(name = "PO_UNIT_PRICE")
    private Double poUnitPrice;
    @Column(name = "CURRENCY_CODE")
    private String currencyCode;
    @Column(name = "CURRENCY_CONVERSION_TYPE")
    private String currencyConversionType;
    @Column(name = "CURRENCY_CONVERSION_RATE")
    private Long currencyConversionRate;
    @Column(name = "CURRENCY_CONVERSION_DATE")
    private String currencyConversionDate;
    @Column(name = "DELIVER_TO_LOCATION_ID")
    private Long deliverToLocationId;
    @Column(name = "VENDOR_ID")
    private Long vendorId;
    @Column(name = "VENDOR_SITE_ID")
    private Long vendorSiteId;
    @Column(name = "ORGANIZATION_ID")
    private Long organizationId;
    @Column(name = "LOCATION_ID")
    private Long locationId;
    @Column(name = "INSPECTION_STATUS_CODE")
    private String inspectionStatusCode;
    @Column(name = "DESTINATION_CONTEXT")
    private String destinationContext;
    @Column(name = "INTERFACE_TRANSACTION_ID")
    private Long interfaceTransactionId;
    @Column(name = "ITEM_ID")
    private Long itemId;
    @Column(name = "LINE_NUM")
    private Long lineNum;

    public RcvTransactions() { }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
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

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public Long getShipmentHeaderId() {
        return shipmentHeaderId;
    }

    public void setShipmentHeaderId(Long shipmentHeaderId) {
        this.shipmentHeaderId = shipmentHeaderId;
    }

    public Long getShipmentLineId() {
        return shipmentLineId;
    }

    public void setShipmentLineId(Long shipmentLineId) {
        this.shipmentLineId = shipmentLineId;
    }

    public String getSourceDocumentCode() {
        return sourceDocumentCode;
    }

    public void setSourceDocumentCode(String sourceDocumentCode) {
        this.sourceDocumentCode = sourceDocumentCode;
    }

    public String getDestinationTypeCode() {
        return destinationTypeCode;
    }

    public void setDestinationTypeCode(String destinationTypeCode) {
        this.destinationTypeCode = destinationTypeCode;
    }

    public String getPrimaryUnitOfMeasure() {
        return primaryUnitOfMeasure;
    }

    public void setPrimaryUnitOfMeasure(String primaryUnitOfMeasure) {
        this.primaryUnitOfMeasure = primaryUnitOfMeasure;
    }

    public String getUomCode() {
        return UomCode;
    }

    public void setUomCode(String uomCode) {
        UomCode = uomCode;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
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

    public Long getPoLineLocationId() {
        return poLineLocationId;
    }

    public void setPoLineLocationId(Long poLineLocationId) {
        this.poLineLocationId = poLineLocationId;
    }

    public Long getPoDistributionId() {
        return poDistributionId;
    }

    public void setPoDistributionId(Long poDistributionId) {
        this.poDistributionId = poDistributionId;
    }

    public Double getPoUnitPrice() {
        return poUnitPrice;
    }

    public void setPoUnitPrice(Double poUnitPrice) {
        this.poUnitPrice = poUnitPrice;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyConversionType() {
        return currencyConversionType;
    }

    public void setCurrencyConversionType(String currencyConversionType) {
        this.currencyConversionType = currencyConversionType;
    }

    public Long getCurrencyConversionRate() {
        return currencyConversionRate;
    }

    public void setCurrencyConversionRate(Long currencyConversionRate) {
        this.currencyConversionRate = currencyConversionRate;
    }

    public String getCurrencyConversionDate() {
        return currencyConversionDate;
    }

    public void setCurrencyConversionDate(String currencyConversionDate) {
        this.currencyConversionDate = currencyConversionDate;
    }

    public Long getDeliverToLocationId() {
        return deliverToLocationId;
    }

    public void setDeliverToLocationId(Long deliverToLocationId) {
        this.deliverToLocationId = deliverToLocationId;
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

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public String getInspectionStatusCode() {
        return inspectionStatusCode;
    }

    public void setInspectionStatusCode(String inspectionStatusCode) {
        this.inspectionStatusCode = inspectionStatusCode;
    }

    public String getDestinationContext() {
        return destinationContext;
    }

    public void setDestinationContext(String destinationContext) {
        this.destinationContext = destinationContext;
    }

    public Long getInterfaceTransactionId() {
        return interfaceTransactionId;
    }

    public void setInterfaceTransactionId(Long interfaceTransactionId) {
        this.interfaceTransactionId = interfaceTransactionId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getLineNum() {
        return lineNum;
    }

    public void setLineNum(Long lineNum) {
        this.lineNum = lineNum;
    }

}
