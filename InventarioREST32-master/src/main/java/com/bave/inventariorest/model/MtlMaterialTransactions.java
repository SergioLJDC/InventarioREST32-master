package com.bave.inventariorest.model;


import javax.persistence.*;

@Entity
@Table(name = "MTL_MATERIAL_TRANSACTIONS")
@NamedNativeQuery(name = "EntregaOrgsHeaderSQL"
        ,query = " SELECT "
        + "     distinct mtl.SHIPMENT_NUMBER  as shipmentNumber, "
        + "     max(mtl.RECEIPT_NUM) as receiptNumber, "
        + "     max(mtl.SHIPMENT_HEADER_ID) as shipmentHeaderId, "
        + "     max(mtl.TRANSACTION_DATE) as creationDate "
        + " FROM "
        + "     mtl_material_transactions mtl GROUP BY mtl.SHIPMENT_NUMBER"
        + " ORDER BY "
        + "     mtl.SHIPMENT_NUMBER ",resultSetMapping = "EntregaOrgsHeaderSQLMapp")





@NamedNativeQuery(name = "EntregaOrgsHeaderSELECT"
        ,query =  " SELECT "
        + "     mtl.SHIPMENT_NUMBER  as shipmentNumber, "
        + "     mtl.RECEIPT_NUM  as receiptNumber, "
        + "     mtl.SHIPMENT_HEADER_ID as shipmentHeaderId, "
        + "     mtl.TRANSACTION_DATE as creationDate "
        + " FROM "
        + "     mtl_material_transactions mtl"
        + " WHERE "
        + "     shipment_header_id = ?1 ",resultSetMapping = "EntregaOrgsHeaderSQLMapp")



@SqlResultSetMapping(name = "EntregaOrgsHeaderSQLMapp",
        classes = {
                @ConstructorResult(
                        targetClass = com.bave.inventariorest.model.EntregaOrgsHeader.class,
                        columns = {
                                @ColumnResult( name = "shipmentNumber", type = String.class),
                                @ColumnResult( name = "receiptNumber", type = String.class),
                                @ColumnResult( name = "shipmentHeaderId", type = Long.class),
                                @ColumnResult( name = "creationDate", type = String.class)
                        }
                )
        }  )


//TRANSACTION DTO






@NamedNativeQuery(name = "TransactionsDtoSelect"
        ,query = "SELECT\n" +
        "    mt.shipment_line_id as interfaceTransactionId ,\n" +
        "    msi.SEGMENT1 as lineNum ,\n" +
        "    mt.transaction_id as segment1,\n" +
        "    mt.entrega_creation_date as creationDate \n" +
        "    FROM\n" +
        "    mtl_material_transactions  mt\n" +
        "    LEFT JOIN mtl_system_items msi ON msi.inventory_item_id = mt.inventory_item_id",resultSetMapping = "TransactionsDtoSQLMapp")


@NamedNativeQuery(name = "TransactionsDtoFilter"
        ,    query = "SELECT\n" +
        "    mt.shipment_line_id as interfaceTransactionId ,\n" +
        "    msi.SEGMENT1 as lineNum ,\n" +
        "    mt.transaction_id as segment1,\n" +
        "    mt.entrega_creation_date as creationDate \n" +
        "    FROM\n" +
        "    mtl_material_transactions  mt\n" +
        "    LEFT JOIN mtl_system_items msi ON msi.inventory_item_id = mt.inventory_item_id" +
        "    Where " +
        "    shipment_header_id = ?1" +
        "    AND mt.entrega_quantity   is not null",resultSetMapping = "TransactionsDtoSQLMapp")


@SqlResultSetMapping(name = "TransactionsDtoSQLMapp",
        classes = {
                @ConstructorResult(
                        targetClass = com.bave.inventariorest.model.TransactionsDto.class,
                        columns = {
                                @ColumnResult( name = "interfaceTransactionId", type = Long.class),
                                @ColumnResult( name = "lineNum", type = Long.class),
                                @ColumnResult( name = "segment1", type = String.class),
                                @ColumnResult( name = "creationDate", type = String.class)
                        }
                )
        }  )




public class MtlMaterialTransactions {


    @Id
    @Column(name = "TRANSACTION_ID")
    private Long transactionId;
    @Column(name = "INVENTORY_ITEM_ID")
    private Long inventoryItemId;
    @Column(name = "ORGANIZATION_ID")
    private Long organizationId;
    @Column(name = "TRANSACTION_TYPE_ID")
    private Long transactionTypeId;
    @Column(name = "TRANSACTION_ACTION_ID")
    private Long transactionActionId;
    @Column(name = "TRANSACTION_SOURCE_TYPE_ID")
    private Long transactionSourceTypeId;
    @Column(name = "TRANSACTION_SOURCE_NAME")
    private String transactionSourceName;
    @Column(name = "TRANSACTION_QUANTITY")
    private Double transactionQuantity;
    @Column(name = "TRANSACTION_UOM")
    private String transactionUom;
    @Column(name = "PRIMARY_QUANTITY")
    private Double primaryQuantity;
    @Column(name = "TRANSACTION_DATE")
    private String transactionDate;
    @Column(name = "ACTUAL_COST")
    private Double actualCost;
    @Column(name = "TRANSFER_ORGANIZATION_ID")
    private Long transferOrganizationId;
    @Column(name = "SHIP_TO_LOCATION_ID")
    private Long shipToLocationId;
    @Column(name = "RECEIPT_NUM")
    private String receipNum;
    @Column(name = "USER_ID")
    private Long userId;
    @Column(name = "SHIPMENT_NUMBER")
    private String shipmentNumber;
    @Column(name = "SHIPMENT_HEADER_ID")
    private Long shipmentHeaderId;
    @Column(name = "SHIPMENT_LINE_ID")
    private Long shipmentLineId;
    @Column(name = "ORG_ID")
    private Long orgId;
    @Column(name = "HEADERINTERFACEID")
    private Long headerInterfaceId;
    @Column(name = "GROUPID")
    private Long groupId;
    @Column(name = "INTERFACETRANSACTIONID")
    private Long interfaceTransactionId;
    @Column(name = "ENTREGA_CREATION_DATE")
    private String entregaCreationDate;
    @Column(name = "ENTREGA_QUANTITY")
    private Double entregaQuantity;
    @Column(name = "SUBINVENTORY")
    private String subinventory;
    @Column(name = "LOCATOR_ID")
    private Long locatorId;
    @Column(name = "USE_MTL_LOT")
    private Long useMtlLot;
    @Column(name = "USE_MTL_SERIAL")
    private Long UseMtlSerial;

    public MtlMaterialTransactions() {}


    public MtlMaterialTransactions(Long transactionId, Long inventoryItemId, Long organizationId, Long transactionTypeId, Long transactionActionId, Long transactionSourceTypeId, String transactionSourceName, Double transactionQuantity, String transactionUom, Double primaryQuantity, String transactionDate, Double actualCost, Long transferOrganizationId, Long shipToLocationId, String receipNum, Long userId, String shipmentNumber, Long shipmentHeaderId, Long shipmentLineId, Long orgId, Long headerInterfaceId, Long groupId, Long interfaceTransactionId, String entregaCreationDate, Double entregaQuantity, String subinventory, Long locatorId, Long useMtlLot, Long useMtlSerial) {
        this.transactionId = transactionId;
        this.inventoryItemId = inventoryItemId;
        this.organizationId = organizationId;
        this.transactionTypeId = transactionTypeId;
        this.transactionActionId = transactionActionId;
        this.transactionSourceTypeId = transactionSourceTypeId;
        this.transactionSourceName = transactionSourceName;
        this.transactionQuantity = transactionQuantity;
        this.transactionUom = transactionUom;
        this.primaryQuantity = primaryQuantity;
        this.transactionDate = transactionDate;
        this.actualCost = actualCost;
        this.transferOrganizationId = transferOrganizationId;
        this.shipToLocationId = shipToLocationId;
        this.receipNum = receipNum;
        this.userId = userId;
        this.shipmentNumber = shipmentNumber;
        this.shipmentHeaderId = shipmentHeaderId;
        this.shipmentLineId = shipmentLineId;
        this.orgId = orgId;
        this.headerInterfaceId = headerInterfaceId;
        this.groupId = groupId;
        this.interfaceTransactionId = interfaceTransactionId;
        this.entregaCreationDate = entregaCreationDate;
        this.entregaQuantity = entregaQuantity;
        this.subinventory = subinventory;
        this.locatorId = locatorId;
        this.useMtlLot = useMtlLot;
        UseMtlSerial = useMtlSerial;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
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

    public Long getTransactionTypeId() {
        return transactionTypeId;
    }

    public void setTransactionTypeId(Long transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }

    public Long getTransactionActionId() {
        return transactionActionId;
    }

    public void setTransactionActionId(Long transactionActionId) {
        this.transactionActionId = transactionActionId;
    }

    public Long getTransactionSourceTypeId() {
        return transactionSourceTypeId;
    }

    public void setTransactionSourceTypeId(Long transactionSourceTypeId) {
        this.transactionSourceTypeId = transactionSourceTypeId;
    }

    public String getTransactionSourceName() {
        return transactionSourceName;
    }

    public void setTransactionSourceName(String transactionSourceName) {
        this.transactionSourceName = transactionSourceName;
    }

    public Double getTransactionQuantity() {
        return transactionQuantity;
    }

    public void setTransactionQuantity(Double transactionQuantity) {
        this.transactionQuantity = transactionQuantity;
    }

    public String getTransactionUom() {
        return transactionUom;
    }

    public void setTransactionUom(String transactionUom) {
        this.transactionUom = transactionUom;
    }

    public Double getPrimaryQuantity() {
        return primaryQuantity;
    }

    public void setPrimaryQuantity(Double primaryQuantity) {
        this.primaryQuantity = primaryQuantity;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Double getActualCost() {
        return actualCost;
    }

    public void setActualCost(Double actualCost) {
        this.actualCost = actualCost;
    }

    public Long getTransferOrganizationId() {
        return transferOrganizationId;
    }

    public void setTransferOrganizationId(Long transferOrganizationId) {
        this.transferOrganizationId = transferOrganizationId;
    }

    public Long getShipToLocationId() {
        return shipToLocationId;
    }

    public void setShipToLocationId(Long shipToLocationId) {
        this.shipToLocationId = shipToLocationId;
    }

    public String getReceipNum() {
        return receipNum;
    }

    public void setReceipNum(String receipNum) {
        this.receipNum = receipNum;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getShipmentNumber() {
        return shipmentNumber;
    }

    public void setShipmentNumber(String shipmentNumber) {
        this.shipmentNumber = shipmentNumber;
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

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Long getHeaderInterfaceId() {
        return headerInterfaceId;
    }

    public void setHeaderInterfaceId(Long headerInterfaceId) {
        this.headerInterfaceId = headerInterfaceId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getInterfaceTransactionId() {
        return interfaceTransactionId;
    }

    public void setInterfaceTransactionId(Long interfaceTransactionId) {
        this.interfaceTransactionId = interfaceTransactionId;
    }

    public String getEntregaCreationDate() {
        return entregaCreationDate;
    }

    public void setEntregaCreationDate(String entregaCreationDate) {
        this.entregaCreationDate = entregaCreationDate;
    }

    public Double getEntregaQuantity() {
        return entregaQuantity;
    }

    public void setEntregaQuantity(Double entregaQuantity) {
        this.entregaQuantity = entregaQuantity;
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

    public Long getUseMtlLot() {
        return useMtlLot;
    }

    public void setUseMtlLot(Long useMtlLot) {
        this.useMtlLot = useMtlLot;
    }

    public Long getUseMtlSerial() {
        return UseMtlSerial;
    }

    public void setUseMtlSerial(Long useMtlSerial) {
        UseMtlSerial = useMtlSerial;
    }



}
