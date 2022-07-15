package com.bave.inventariorest.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "RCV_TRANSACTIONS_INTERFACE")
public class RcvTransactionsInterface {


    @Id
    @Column(name = "INTERFACE_TRANSACTION_ID")
    private Long interfaceTransactionId;
    @Column(name = "LAST_UPDATE_DATE")
    private String lastUpdatedDate;
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
    @Column(name = "PROCESSING_STATUS_CODE")
    private String processingStatusCode;
    @Column(name = "PROCESSING_MODE_CODE")
    private String processingModeCode;
    @Column(name = "QUANTITY")
    private Double quantity;
    @Column(name = "UNIT_OF_MEASURE")
    private String unitOfMeasure;
    @Column(name = "ITEM_ID")
    private Long itemId;
    @Column(name = "ITEM_DESCRIPTION")
    private String itemDescription;
    @Column(name = "UOM_CODE")
    private String UomCode;
    @Column(name = "EMPLOYEE_ID")
    private Long employeeId;
    @Column(name = "SHIPMENT_HEADER_ID")
    private Long shipmentHeaderId;
    @Column(name = "SHIPMENT_LINE_ID")
    private Long shipmentLineId;
    @Column(name = "SHIP_TO_LOCATION_ID")
    private Long shipToLocationId;
    @Column(name = "VENDOR_ID")
    private Long vendorId;
    @Column(name = "VENDOR_SITE_ID")
    private Long vendorSiteId;
    @Column(name = "TO_ORGANIZATION_ID")
    private Long toOrganizationId;
    @Column(name = "SOURCE_DOCUMENT_CODE")
    private String sourceDocumentCode;
    @Column(name = "PARENT_TRANSACTION_ID")
    private Long parentTransactionId;
    @Column(name = "PO_HEADER_ID")
    private Long poHeaderId;
    @Column(name = "PO_LINE_ID")
    private Long poLineId;
    @Column(name = "PO_LINE_LOCATION_ID")
    private Long poLineLocation;
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
    @Column(name = "PO_DISTRIBUTION_ID")
    private Long poDistributionId;
    @Column(name = "DESTINATION_TYPE_CODE")
    private String destinationTypeCode;
    @Column(name = "LOCATION_ID")
    private Long locationId;
    @Column(name = "DELIVER_TO_LOCATION_ID")
    private Long deliverToLocationId;
    @Column(name = "INSPECTION_STATUS_CODE")
    private String inspectionStatusCode;
    @Column(name = "SUBINVENTORY")
    private String subinventory;
    @Column(name = "LOCATOR_ID")
    private Long locatorId;
    @Column(name = "SHIPMENT_NUM")
    private String shipmentNum;
    @Column(name = "USE_MTL_LOT")
    private Long useMtlLot;
    @Column(name = "USE_MTL_SERIAL")
    private Long useMtlSerial;
    @Column(name = "GROUP_ID")
    private Long groupId;
    @Column(name = "TRANSACTION_STATUS_CODE")
    private String transactionStatusCode;
    @Column(name = "AUTO_TRANSACT_CODE")
    private String autoTransactCode;
    @Column(name = "RECEIPT_SOURCE_CODE")
    private String receiptSourceCode;
    @Column(name = "VALIDATION_FLAG")
    private String validationFlag;
    @Column(name = "ORG_ID")
    private Long orgId;
    @Column(name = "PRIMARY_QUANTITY")
    private Double primaryQuantity;

    @Column(name = "HEADER_INTERFACE_ID")
    private Long headerInterfaceId;
    @Column(name = "VENDOR_SITE_CODE")
    private String vendorSiteCode;
    @Column(name = "COMMENTS")
    private String comments;
    @Column(name = "SEGMENT1")
    private String segment1;


    public RcvTransactionsInterface() { }

    public Long getInterfaceTransactionId() {
        return interfaceTransactionId;
    }

    public void setInterfaceTransactionId(Long interfaceTransactionId) {
        this.interfaceTransactionId = interfaceTransactionId;
    }

    public String getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(String lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
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

    public String getProcessingStatusCode() {
        return processingStatusCode;
    }

    public void setProcessingStatusCode(String processingStatusCode) {
        this.processingStatusCode = processingStatusCode;
    }

    public String getProcessingModeCode() {
        return processingModeCode;
    }

    public void setProcessingModeCode(String processingModeCode) {
        this.processingModeCode = processingModeCode;
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

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
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

    public Long getShipToLocationId() {
        return shipToLocationId;
    }

    public void setShipToLocationId(Long shipToLocationId) {
        this.shipToLocationId = shipToLocationId;
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

    public Long getToOrganizationId() {
        return toOrganizationId;
    }

    public void setToOrganizationId(Long toOrganizationId) {
        this.toOrganizationId = toOrganizationId;
    }

    public String getSourceDocumentCode() {
        return sourceDocumentCode;
    }

    public void setSourceDocumentCode(String sourceDocumentCode) {
        this.sourceDocumentCode = sourceDocumentCode;
    }

    public Long getParentTransactionId() {
        return parentTransactionId;
    }

    public void setParentTransactionId(Long parentTransactionId) {
        this.parentTransactionId = parentTransactionId;
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

    public Long getPoLineLocation() {
        return poLineLocation;
    }

    public void setPoLineLocation(Long poLineLocation) {
        this.poLineLocation = poLineLocation;
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

    public Long getPoDistributionId() {
        return poDistributionId;
    }

    public void setPoDistributionId(Long poDistributionId) {
        this.poDistributionId = poDistributionId;
    }

    public String getDestinationTypeCode() {
        return destinationTypeCode;
    }

    public void setDestinationTypeCode(String destinationTypeCode) {
        this.destinationTypeCode = destinationTypeCode;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public Long getDeliverToLocationId() {
        return deliverToLocationId;
    }

    public void setDeliverToLocationId(Long deliverToLocationId) {
        this.deliverToLocationId = deliverToLocationId;
    }

    public String getInspectionStatusCode() {
        return inspectionStatusCode;
    }

    public void setInspectionStatusCode(String inspectionStatusCode) {
        this.inspectionStatusCode = inspectionStatusCode;
    }

    public String getSubinventory() {
        return subinventory;
    }

    public void setSubinventory(String subinventory) {
        this.subinventory = subinventory;
    }

    public Long getLocatorId() {
        return locatorId;
    }

    public void setLocatorId(Long locatorId) {
        this.locatorId = locatorId;
    }

    public String getShipmentNum() {
        return shipmentNum;
    }

    public void setShipmentNum(String shipmentNum) {
        this.shipmentNum = shipmentNum;
    }

    public Long getUseMtlLot() {
        return useMtlLot;
    }

    public void setUseMtlLot(Long useMtlLot) {
        this.useMtlLot = useMtlLot;
    }

    public Long getUseMtlSerial() {
        return useMtlSerial;
    }

    public void setUseMtlSerial(Long useMtlSerial) {
        this.useMtlSerial = useMtlSerial;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getTransactionStatusCode() {
        return transactionStatusCode;
    }

    public void setTransactionStatusCode(String transactionStatusCode) {
        this.transactionStatusCode = transactionStatusCode;
    }

    public String getAutoTransactCode() {
        return autoTransactCode;
    }

    public void setAutoTransactCode(String autoTransactCode) {
        this.autoTransactCode = autoTransactCode;
    }

    public String getReceiptSourceCode() {
        return receiptSourceCode;
    }

    public void setReceiptSourceCode(String receiptSourceCode) {
        this.receiptSourceCode = receiptSourceCode;
    }

    public String getValidationFlag() {
        return validationFlag;
    }

    public void setValidationFlag(String validationFlag) {
        this.validationFlag = validationFlag;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Double getPrimaryQuantity() {
        return primaryQuantity;
    }

    public void setPrimaryQuantity(Double primaryQuantity) {
        this.primaryQuantity = primaryQuantity;
    }

    public Long getHeaderInterfaceId() {
        return headerInterfaceId;
    }

    public void setHeaderInterfaceId(Long headerInterfaceId) {
        this.headerInterfaceId = headerInterfaceId;
    }

    public String getVendorSiteCode() {
        return vendorSiteCode;
    }

    public void setVendorSiteCode(String vendorSiteCode) {
        this.vendorSiteCode = vendorSiteCode;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getSegment1() {
        return segment1;
    }

    public void setSegment1(String segment1) {
        this.segment1 = segment1;
    }
}
