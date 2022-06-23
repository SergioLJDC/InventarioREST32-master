package com.bave.inventariorest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "XXEJE_PDA_RUBRO_CAT")
public class XxejePdaRubroCat {
    @Id
    @Column(name = "RUBRO", length = 120)
    private String rubro;

    @Column(name = "DESC_RUBRO", length = 250)
    private String descRubro;

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getDescRubro() {
        return descRubro;
    }

    public void setDescRubro(String descRubro) {
        this.descRubro = descRubro;
    }

}