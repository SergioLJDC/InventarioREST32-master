package com.bave.inventariorest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PO_LINES_ALL")
public class PoLinesAll {
    @Id
    @Column(name = "PO_LINE_ID")
    private Long poLineId;
    @Column(name = "PO_HEADER_ID")
    private Long poHeaderId;
    @Column(name = "LINE_NUM")
    private Long lineNum;
    @Column(name = "ITEM_ID")
    private Long itemId;
    @Column(name = "ITEM_DESCRIPTION")
    private String itemDescripcion;
    @Column(name = "UNIT_PRICE")
    private Long unitPrice;
    @Column(name = "QUANTITY_PLA")
    private Long quantity;
    @Column(name = "UNIT_MEAS_LOOKUP_CODE")
    private String unitMeasLookupCode;
    @Column(name = "BASE_UOM")
    private String baseUom;

    public PoLinesAll(){

    }

    public PoLinesAll(Long poLineId, Long poHeaderId, Long lineNum, Long itemId, String itemDescripcion, Long unitPrice, Long quantity, String unitMeasLookupCode, String baseUom) {
        this.poLineId = poLineId;
        this.poHeaderId = poHeaderId;
        this.lineNum = lineNum;
        this.itemId = itemId;
        this.itemDescripcion = itemDescripcion;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.unitMeasLookupCode = unitMeasLookupCode;
        this.baseUom = baseUom;
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

    public Long getLineNum() {
        return lineNum;
    }

    public void setLineNum(Long lineNum) {
        this.lineNum = lineNum;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemDescripcion() {
        return itemDescripcion;
    }

    public void setItemDescripcion(String itemDescripcion) {
        this.itemDescripcion = itemDescripcion;
    }

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantityPla) {
        this.quantity = quantityPla;
    }

    public String getUnitMeasLookupCode() {
        return unitMeasLookupCode;
    }

    public void setUnitMeasLookupCode(String unitMeasLookupCode) {
        this.unitMeasLookupCode = unitMeasLookupCode;
    }

    public String getBaseUom() {
        return baseUom;
    }

    public void setBaseUom(String baseUom) {
        this.baseUom = baseUom;
    }
}
