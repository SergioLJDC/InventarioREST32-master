package com.bave.inventariorest.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="XXPDA_HOMOLOGACION_V")
public class XXPDA_HOMOLOGACION_V {
    @Column(name = "ITEM")
    private String ITEM;
    @Column(name = "ITEM_ID")
    private Long ITEM_ID;
    @Column(name = "DESC_ITEM")
    private String DESC_ITEM;
    @Column(name = "TIPO")
    private String TIPO;
    @Id
    @Column(name = "HOMOLOGACION")
    private String HOMOLOGACION;
    @Column(name = "DESC_HOMOLOGACION")
    private String DESC_HOMOLOGACION;
    @Column(name = "UDM")
    private String UDM;


    public XXPDA_HOMOLOGACION_V() {
    }

    public String getITEM() {
        return ITEM;
    }

    public void setITEM(String ITEM) {
        this.ITEM = ITEM;
    }

    public Long getITEM_ID() {
        return ITEM_ID;
    }

    public void setITEM_ID(Long ITEM_ID) {
        this.ITEM_ID = ITEM_ID;
    }

    public String getDESC_ITEM() {
        return DESC_ITEM;
    }

    public void setDESC_ITEM(String DESC_ITEM) {
        this.DESC_ITEM = DESC_ITEM;
    }

    public String getTIPO() {
        return TIPO;
    }

    public void setTIPO(String TIPO) {
        this.TIPO = TIPO;
    }

    public String getHOMOLOGACION() {
        return HOMOLOGACION;
    }

    public void setHOMOLOGACION(String HOMOLOGACION) {
        this.HOMOLOGACION = HOMOLOGACION;
    }

    public String getDESC_HOMOLOGACION() {
        return DESC_HOMOLOGACION;
    }

    public void setDESC_HOMOLOGACION(String DESC_HOMOLOGACION) {
        this.DESC_HOMOLOGACION = DESC_HOMOLOGACION;
    }

    public String getUDM() {
        return UDM;
    }

    public void setUDM(String UDM) {
        this.UDM = UDM;
    }
}
