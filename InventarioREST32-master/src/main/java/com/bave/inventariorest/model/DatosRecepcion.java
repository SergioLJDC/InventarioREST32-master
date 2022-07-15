package com.bave.inventariorest.model;

public class DatosRecepcion {
    private String unitMeasLookupCode;
    private Long itemId;
    private String itemDescription;
    private String primaryUomCode;
    private Long vendorId;
    private Long vendorSiteId;
    private Long poHeaderId;
    private Long poLineId;
    private Long lineLocationId;
    private Long unitPrice;
    private String currencyCode;
    private String rateType;
    private Long rate;
    private String rateDate;
    private Long poDistributionId;
    private String vendorSiteCode;
    private Long quantity;
    private Long quantityReceived;
    private Long quantityCancelled;
    private Long qtyRcvTolerance;
    private Long userId;
    private Long orgId;

    public DatosRecepcion() {}


    public DatosRecepcion(
            String unitMeasLookupCode,
            Long itemId,
            String itemDescription,
            String primaryUomCode,
            Long vendorId,
            Long vendorSiteId,
            Long poHeaderId,
            Long poLineId,
            Long lineLocationId,
            Long unitPrice,
            String currencyCode,
            String rateType,
            Long rate,
            String rateDate,
            Long poDistributionId,
            String vendorSiteCode,
            Long quantity,
            Long quantityReceived,
            Long quantityCancelled,
            Long qtyRcvTolerance,
            Long userId,
            Long orgId) {
        this.unitMeasLookupCode = unitMeasLookupCode;
        this.itemId = itemId;
        this.itemDescription = itemDescription;
        this.primaryUomCode = primaryUomCode;
        this.vendorId = vendorId;
        this.vendorSiteId = vendorSiteId;
        this.poHeaderId = poHeaderId;
        this.poLineId = poLineId;
        this.lineLocationId = lineLocationId;
        this.unitPrice = unitPrice;
        this.currencyCode = currencyCode;
        this.rateType = rateType;
        this.rate = rate;
        this.rateDate = rateDate;
        this.poDistributionId = poDistributionId;
        this.vendorSiteCode = vendorSiteCode;
        this.quantity = quantity;
        this.quantityReceived = quantityReceived;
        this.quantityCancelled = quantityCancelled;
        this.qtyRcvTolerance = qtyRcvTolerance;
        this.userId = userId;
        this.orgId = orgId;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getQuantityReceived() {
        return quantityReceived;
    }

    public void setQuantityReceived(Long quantityReceived) {
        this.quantityReceived = quantityReceived;
    }

    public Long getQuantityCancelled() {
        return quantityCancelled;
    }

    public void setQuantityCancelled(Long quantityCancelled) {
        this.quantityCancelled = quantityCancelled;
    }

    public Long getQtyRcvTolerance() {
        return qtyRcvTolerance;
    }

    public void setQtyRcvTolerance(Long qtyRcvTolerance) {
        this.qtyRcvTolerance = qtyRcvTolerance;
    }

    public String getUnitMeasLookupCode() {
        return unitMeasLookupCode;
    }

    public void setUnitMeasLookupCode(String unitMeasLookupCode) {
        this.unitMeasLookupCode = unitMeasLookupCode;
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

    public String getPrimaryUomCode() {
        return primaryUomCode;
    }

    public void setPrimaryUomCode(String primaryUomCode) {
        this.primaryUomCode = primaryUomCode;
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

    public Long getLineLocationId() {
        return lineLocationId;
    }

    public void setLineLocationId(Long lineLocationId) {
        this.lineLocationId = lineLocationId;
    }

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
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

    public Long getPoDistributionId() {
        return poDistributionId;
    }

    public void setPoDistributionId(Long poDistributionId) {
        this.poDistributionId = poDistributionId;
    }

    public String getVendorSiteCode() {
        return vendorSiteCode;
    }

    public void setVendorSiteCode(String vendorSiteCode) {
        this.vendorSiteCode = vendorSiteCode;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }
}
