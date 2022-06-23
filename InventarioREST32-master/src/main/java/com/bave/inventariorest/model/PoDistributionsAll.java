package com.bave.inventariorest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PO_DISTRIBUTIONS_ALL")
public class PoDistributionsAll {

    @Id
    @Column(name = "PO_DISTRIBUTION_ID")
    private Long poDistributionId;
    @Column(name = "LINE_LOCATION_ID")
    private Long lineLocationId;
    @Column(name = "PO_LINE_ID")
    private Long poLineId;
    @Column(name = "PO_HEADER_ID")
    private Long poHeaderId;
    @Column(name = "DISTRIBUTION_NUM")
    private Long distributionNum;
    @Column(name = "RATE_DATE")
    private String rateDate;
    @Column(name = "RATE")
    private Long rate;
    @Column(name = "DESTINATION_SUBINVENTORY")
    private String destinationSubinventory;
    @Column(name = "DELIVER_TO_LOCATION_ID")
    private Long deliverToLocationId;
    @Column(name = "QUANTITY_ORDERED")
    private Long quantityOrdered;
    @Column(name = "QUANTITY_DELIVERED")
    private Long quantityDelivered;
    @Column(name = "QUANTITY_BILLED")
    private Long quantityBilled;
    @Column(name = "QUANTITY_CANCELLED")
    private Long quantityCancelled;


    public PoDistributionsAll(){

    }

    public Long getPoDistributionId() {
        return poDistributionId;
    }

    public void setPoDistributionId(Long poDistributionId) {
        this.poDistributionId = poDistributionId;
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

    public Long getDistributionNum() {
        return distributionNum;
    }

    public void setDistributionNum(Long distributionNum) {
        this.distributionNum = distributionNum;
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

    public String getDestinationSubinventory() {
        return destinationSubinventory;
    }

    public void setDestinationSubinventory(String destinationSubinventory) {
        this.destinationSubinventory = destinationSubinventory;
    }

    public Long getDeliverToLocationId() {
        return deliverToLocationId;
    }

    public void setDeliverToLocationId(Long deliverToLocationId) {
        this.deliverToLocationId = deliverToLocationId;
    }

    public Long getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setQuantityOrdered(Long quantityOrder) {
        this.quantityOrdered = quantityOrder;
    }

    public Long getQuantityDelivered() {
        return quantityDelivered;
    }

    public void setQuantityDelivered(Long quantityDelivered) {
        this.quantityDelivered = quantityDelivered;
    }

    public Long getQuantityBilled() {
        return quantityBilled;
    }

    public void setQuantityBilled(Long quantityBilled) {
        this.quantityBilled = quantityBilled;
    }

    public Long getQuantityCancelled() {
        return quantityCancelled;
    }

    public void setQuantityCancelled(Long quantityCancelled) {
        this.quantityCancelled = quantityCancelled;
    }
}
