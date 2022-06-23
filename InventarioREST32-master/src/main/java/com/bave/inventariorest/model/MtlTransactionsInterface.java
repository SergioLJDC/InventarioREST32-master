package com.bave.inventariorest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MTL_TRANSACTIONS_INTERFACE")
public class MtlTransactionsInterface {


    @Id
    @Column(name = "TRANSACTION_INTERFACE_ID")
    private Long transactionInterfaceId;
    @Column(name = "PROCESS_FLAG")
    private Long processFlag;
    @Column(name = "TRANSACTION_MODE")
    private Long TransactionMode;
    @Column(name = "LAST_UPDATE_DATE")
    private String lastUpdateDate;
    @Column(name = "LAST_UPDATED_BY")
    private Long lastUpdatedBy;
    @Column(name = "CREATION_DATE")
    private String creationDate;
    @Column(name = "CREATED_BY")
    private Long createdBy;
    @Column(name = "INVENTORY_ITEM_ID")
    private Long inventoryItemId;
    @Column(name = "ORGANIZATION_ID")
    private Long organizationId;
    @Column(name = "TRANSACTION_QUANTITY")
    private Double transactionQuantity;
    @Column(name = "PRIMARY_QUANTITY")
    private Double primaryQuantity;
    @Column(name = "TRANSACTION_UOM")
    private String transactionUom;
    @Column(name = "TRANSACTION_DATE")
    private String transactionDate;
    @Column(name = "SUBINVENTORY_CODE")
    private String subinventoryCode;
    @Column(name = "LOCATOR_ID")
    private Long locatorId;
    @Column(name = "TRANSACTION_SOURCE_NAME")
    private String transactionSourceName;
    @Column(name = "TRANSACTION_SOURCE_TYPE_ID")
    private Long transactionSourceTypeId;
    @Column(name = "TRANSACTION_ACTION_ID")
    private Long transactionActionId;
    @Column(name = "TRANSACTION_TYPE_ID")
    private Long transactionTypeId;
    @Column(name = "TRANSACTION_REFERENCE")
    private String transactionReference;
    @Column(name = "TRANSFER_SUBINVENTORY")
    private String transferSubinventory;
    @Column(name = "TRANSFER_ORGANIZATION")
    private Long transferOrganization;
    @Column(name = "TRANSFER_LOCATOR")
    private Long transferLocator;
    @Column(name = "SOURCE_CODE")
    private String sourceCode;
    @Column(name = "SOURCE_LINE_ID")
    private Long sourceLineId;
    @Column(name = "SOURCE_HEADER_ID")
    private Long sourceHeaderId;
    @Column(name = "SHIPMENT_NUMBER")
    private String shipmentNumber;

    public MtlTransactionsInterface(){}

    public MtlTransactionsInterface(Long transactionInterfaceId, Long processFlag, Long transactionMode, String lastUpdateDate, Long lastUpdatedBy, String creationDate, Long createdBy, Long inventoryItemId, Long organizationId, Double transactionQuantity, Double primaryQuantity, String transactionUom, String transactionDate, String subinventoryCode, Long locatorId, String transactionSourceName, Long transactionSourceTypeId, Long transactionActionId, Long transactionTypeId, String transactionReference, String transferSubinventory, Long transferOrganization, Long transferLocator, String sourceCode, Long sourceLineId, Long sourceHeaderId, String shipmentNumber) {
        this.transactionInterfaceId = transactionInterfaceId;
        this.processFlag = processFlag;
        TransactionMode = transactionMode;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.creationDate = creationDate;
        this.createdBy = createdBy;
        this.inventoryItemId = inventoryItemId;
        this.organizationId = organizationId;
        this.transactionQuantity = transactionQuantity;
        this.primaryQuantity = primaryQuantity;
        this.transactionUom = transactionUom;
        this.transactionDate = transactionDate;
        this.subinventoryCode = subinventoryCode;
        this.locatorId = locatorId;
        this.transactionSourceName = transactionSourceName;
        this.transactionSourceTypeId = transactionSourceTypeId;
        this.transactionActionId = transactionActionId;
        this.transactionTypeId = transactionTypeId;
        this.transactionReference = transactionReference;
        this.transferSubinventory = transferSubinventory;
        this.transferOrganization = transferOrganization;
        this.transferLocator = transferLocator;
        this.sourceCode = sourceCode;
        this.sourceLineId = sourceLineId;
        this.sourceHeaderId = sourceHeaderId;
        this.shipmentNumber = shipmentNumber;
    }

    public String getShipmentNumber() {
        return shipmentNumber;
    }

    public void setShipmentNumber(String shipmentNumber) {
        this.shipmentNumber = shipmentNumber;
    }

    public Long getTransactionInterfaceId() {
        return transactionInterfaceId;
    }

    public void setTransactionInterfaceId(Long transactionInterfaceId) {
        this.transactionInterfaceId = transactionInterfaceId;
    }

    public Long getProcessFlag() {
        return processFlag;
    }

    public void setProcessFlag(Long processFlag) {
        this.processFlag = processFlag;
    }

    public Long getTransactionMode() {
        return TransactionMode;
    }

    public void setTransactionMode(Long transactionMode) {
        TransactionMode = transactionMode;
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

    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
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

    public String getTransactionUom() {
        return transactionUom;
    }

    public void setTransactionUom(String transactionUom) {
        this.transactionUom = transactionUom;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getSubinventoryCode() {
        return subinventoryCode;
    }

    public void setSubinventoryCode(String subinventoryCode) {
        this.subinventoryCode = subinventoryCode;
    }

    public Long getLocatorId() {
        return locatorId;
    }

    public void setLocatorId(Long locatorId) {
        this.locatorId = locatorId;
    }

    public String getTransactionSourceName() {
        return transactionSourceName;
    }

    public void setTransactionSourceName(String transactionSourceName) {
        this.transactionSourceName = transactionSourceName;
    }

    public Long getTransactionSourceTypeId() {
        return transactionSourceTypeId;
    }

    public void setTransactionSourceTypeId(Long transactionSourceTypeId) {
        this.transactionSourceTypeId = transactionSourceTypeId;
    }

    public Long getTransactionActionId() {
        return transactionActionId;
    }

    public void setTransactionActionId(Long transactionActionId) {
        this.transactionActionId = transactionActionId;
    }

    public Long getTransactionTypeId() {
        return transactionTypeId;
    }

    public void setTransactionTypeId(Long transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }

    public String getTransactionReference() {
        return transactionReference;
    }

    public void setTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
    }

    public String getTransferSubinventory() {
        return transferSubinventory;
    }

    public void setTransferSubinventory(String transferSubinventory) {
        this.transferSubinventory = transferSubinventory;
    }

    public Long getTransferOrganization() {
        return transferOrganization;
    }

    public void setTransferOrganization(Long transferOrganization) {
        this.transferOrganization = transferOrganization;
    }

    public Long getTransferLocator() {
        return transferLocator;
    }

    public void setTransferLocator(Long transferLocator) {
        this.transferLocator = transferLocator;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public Long getSourceLineId() {
        return sourceLineId;
    }

    public void setSourceLineId(Long sourceLineId) {
        this.sourceLineId = sourceLineId;
    }

    public Long getSourceHeaderId() {
        return sourceHeaderId;
    }

    public void setSourceHeaderId(Long sourceHeaderId) {
        this.sourceHeaderId = sourceHeaderId;
    }
}
