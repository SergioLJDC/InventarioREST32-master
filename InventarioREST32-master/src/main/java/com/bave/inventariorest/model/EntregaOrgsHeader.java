package com.bave.inventariorest.model;

public class EntregaOrgsHeader {

    private String shipmentNumber;
    private String receiptNumber;
    private Long shipmentHeaderId;
    private String creationDate;

    public EntregaOrgsHeader() {}


    public EntregaOrgsHeader(String shipmentNumber, String receiptNumber, Long shipmentHeaderId, String creationDate) {
        this.shipmentNumber = shipmentNumber;
        this.receiptNumber = receiptNumber;
        this.shipmentHeaderId = shipmentHeaderId;
        this.creationDate = creationDate;
    }

    public String getShipmentNumber() {
        return shipmentNumber;
    }

    public void setShipmentNumber(String shipmentNumber) {
        this.shipmentNumber = shipmentNumber;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public Long getShipmentHeaderId() {
        return shipmentHeaderId;
    }

    public void setShipmentHeaderId(Long shipmentHeaderId) {
        this.shipmentHeaderId = shipmentHeaderId;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }



}
