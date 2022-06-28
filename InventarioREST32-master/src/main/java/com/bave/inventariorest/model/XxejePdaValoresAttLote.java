package com.bave.inventariorest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "XXEJE_PDA_VALORES_ATT_LOTE")
public class XxejePdaValoresAttLote {
    @Id
    @Column(name = "ID_VALOR")
    private Long idValor;

    @Column(name = "FLEX_VALUE_ID,",length = 40)
    private String flexValueId;

    @Column(name = "FLEX_VALUE", length = 150)
    private String flexValue;

    @Column(name = "FLEX_VALUE_SET_ID")
    private Integer flexValueSetId;

    public Long getIdValor() {
        return idValor;
    }

    public void setIdValor(Long idValor) {
        this.idValor = idValor;
    }

    public String getFlexValueId() {
        return flexValueId;
    }

    public void setFlexValueId(String flexValueId) {
        this.flexValueId = flexValueId;
    }

    public String getFlexValue() {
        return flexValue;
    }

    public void setFlexValue(String flexValue) {
        this.flexValue = flexValue;
    }

    public Integer getFlexValueSetId() {
        return flexValueSetId;
    }

    public void setFlexValueSetId(Integer flexValueSetId) {
        this.flexValueSetId = flexValueSetId;
    }

}