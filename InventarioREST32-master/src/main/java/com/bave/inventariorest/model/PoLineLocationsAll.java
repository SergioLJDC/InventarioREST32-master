package com.bave.inventariorest.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PO_LINE_LOCATIONS_ALL")
public class PoLineLocationsAll {

    @Id
    @Column(name = "LINE_LOCATION_ID")
    private Long lineLocationId;
    @Column(name = "PO_LINE_ID")
    private Long poLineId;
    @Column(name = "PO_HEADER_ID")
    private Long poHeaderId;
    @Column(name = "QUANTITY")
    private Long quantity;
    @Column(name = "QUANTITY_RECEIVED")
    private Long quantityRecived;
    @Column(name = "QUANTITY_CANCELLED")
    private Long quantityCancelled;
    @Column(name = "QUANTITY_BILLED")
    private Long quantityBilled;
    @Column(name = "SHIPMENT_NUM")
    private Long shipmentNum;
    @Column(name = "SHIP_TO_LOCATION_ID")
    private Long shipToLocationId;
    @Column(name = "QTY_RCV_TOLERANCE")
    private Long qtyRcvTolerance;
    @Column(name = "ORG_ID")
    private Long orgId;

    public PoLineLocationsAll(){

    }


    public PoLineLocationsAll(Long lineLocationId, Long poLineId, Long poHeaderId, Long quantity, Long quantityRecived, Long quantityCancelled, Long quantityBilled, Long shipmentNum, Long shipToLocationId, Long qtyRcvTolerance, Long orgId) {
        this.lineLocationId = lineLocationId;
        this.poLineId = poLineId;
        this.poHeaderId = poHeaderId;
        this.quantity = quantity;
        this.quantityRecived = quantityRecived;
        this.quantityCancelled = quantityCancelled;
        this.quantityBilled = quantityBilled;
        this.shipmentNum = shipmentNum;
        this.shipToLocationId = shipToLocationId;
        this.qtyRcvTolerance = qtyRcvTolerance;
        this.orgId = orgId;
    }

    public Long getLineLocationId() {
        return lineLocationId;
    }

    public void setLineLocationId(Long lineLocationId) {
        this.lineLocationId = lineLocationId;
    }

    public Long getPoLineId() {
        return poLineId;
    }

    public void setPoLineId(Long poLineId) {
        this.poLineId = poLineId;
    }

    public Long getPoHeaderId() {
        return poHeaderId;
    }

    public void setPoHeaderId(Long poHeaderId) {
        this.poHeaderId = poHeaderId;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getQuantityRecived() {
        return quantityRecived;
    }

    public void setQuantityRecived(Long quantityRecived) {
        this.quantityRecived = quantityRecived;
    }

    public Long getQuantityCancelled() {
        return quantityCancelled;
    }

    public void setQuantityCancelled(Long quantityCancelled) {
        this.quantityCancelled = quantityCancelled;
    }

    public Long getQuantityBilled() {
        return quantityBilled;
    }

    public void setQuantityBilled(Long quantityBilled) {
        this.quantityBilled = quantityBilled;
    }

    public Long getShipmentNum() {
        return shipmentNum;
    }

    public void setShipmentNum(Long shipmentNum) {
        this.shipmentNum = shipmentNum;
    }

    public Long getShipToLocationId() {
        return shipToLocationId;
    }

    public void setShipToLocationId(Long shipToLocationId) {
        this.shipToLocationId = shipToLocationId;
    }

    public Long getQtyRcvTolerance() {
        return qtyRcvTolerance;
    }

    public void setQtyRcvTolerance(Long qtyRcvTolerance) {
        this.qtyRcvTolerance = qtyRcvTolerance;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }
}