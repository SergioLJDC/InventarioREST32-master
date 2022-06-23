package com.bave.inventariorest.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "LOCALIZADOR")
//@IdClass(Localizador.class)
public class Localizador   {
    @Id
    @Column(name = "ID_LOCALIZADOR")
    private Long idLocalizador;

    @Column(name = "ORGANIZATION_ID")
    private Long organizationId;
    @Column(name = "COD_SUBINVENTARIO")
    private String codSubinventario;
    @Column(name = "COD_LOCALIZADOR")
    private String codLocalizador;
    @Column(name = "COD_SEG1")
    private String codSeg1;
    @Column(name = "COD_SEG2")
    private String codSeg2;
    @Column(name = "COD_SEG3")
    private String codSeg3;
    @Column(name = "COD_SEG4")
    private String codSeg4;
    @Column(name = "COD_SEG5")
    private String codSeg5;
    @Column(name = "COD_SEG6")
    private String codSeg6;

    public Localizador() {}



    public Localizador(Long idLocalizador, Long organizationId, String codSubinventario, String codLocalizador, String codSeg1, String codSeg2, String codSeg3, String codSeg4, String codSeg5, String codSeg6) {
        this.idLocalizador = idLocalizador;
        this.organizationId = organizationId;
        this.codSubinventario = codSubinventario;
        this.codLocalizador = codLocalizador;
        this.codSeg1 = codSeg1;
        this.codSeg2 = codSeg2;
        this.codSeg3 = codSeg3;
        this.codSeg4 = codSeg4;
        this.codSeg5 = codSeg5;
        this.codSeg6 = codSeg6;
    }

    public Long getIdLocalizador() {
        return idLocalizador;
    }

    public void setIdLocalizador(Long idLocalizador) {
        this.idLocalizador = idLocalizador;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public String getCodSubinventario() {
        return codSubinventario;
    }

    public void setCodSubinventario(String codSubinventario) {
        this.codSubinventario = codSubinventario;
    }

    public String getCodLocalizador() {
        return codLocalizador;
    }

    public void setCodLocalizador(String codLocalizador) {
        this.codLocalizador = codLocalizador;
    }

    public String getCodSeg1() {
        return codSeg1;
    }

    public void setCodSeg1(String codSeg1) {
        this.codSeg1 = codSeg1;
    }

    public String getCodSeg2() {
        return codSeg2;
    }

    public void setCodSeg2(String codSeg2) {
        this.codSeg2 = codSeg2;
    }

    public String getCodSeg3() {
        return codSeg3;
    }

    public void setCodSeg3(String codSeg3) {
        this.codSeg3 = codSeg3;
    }

    public String getCodSeg4() {
        return codSeg4;
    }

    public void setCodSeg4(String codSeg4) {
        this.codSeg4 = codSeg4;
    }

    public String getCodSeg5() {
        return codSeg5;
    }

    public void setCodSeg5(String codSeg5) {
        this.codSeg5 = codSeg5;
    }

    public String getCodSeg6() {
        return codSeg6;
    }

    public void setCodSeg6(String codSeg6) {
        this.codSeg6 = codSeg6;
    }

}
