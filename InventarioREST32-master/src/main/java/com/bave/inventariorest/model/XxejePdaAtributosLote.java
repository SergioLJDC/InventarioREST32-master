package com.bave.inventariorest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "XXEJE_PDA_ATRIBUTOS_LOTE")
public class XxejePdaAtributosLote {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "DESCRIPTIVE_FLEX_CONTEXT_CODE", length = 30)
    private String descriptiveFlexContextCode;

    @Column(name = "APPLICATION_COLUMN_NAME", length = 30)
    private String applicationColumnName;

    @Column(name = "END_USER_COLUMN_NAME", length = 30)
    private String endUserColumnName;

    @Column(name = "FORM_LEFT_PROMPT", length = 80)
    private String formLeftPrompt;

    @Column(name = "FLEX_VALUE_SET_ID")
    private Integer flexValueSetId;

    public XxejePdaAtributosLote() {
    }

    public XxejePdaAtributosLote(Long id, String descriptiveFlexContextCode, String applicationColumnName, String endUserColumnName, String formLeftPrompt, Integer flexValueSetId) {
        this.id = id;
        this.descriptiveFlexContextCode = descriptiveFlexContextCode;
        this.applicationColumnName = applicationColumnName;
        this.endUserColumnName = endUserColumnName;
        this.formLeftPrompt = formLeftPrompt;
        this.flexValueSetId = flexValueSetId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescriptiveFlexContextCode() {
        return descriptiveFlexContextCode;
    }

    public void setDescriptiveFlexContextCode(String descriptiveFlexContextCode) {
        this.descriptiveFlexContextCode = descriptiveFlexContextCode;
    }

    public String getApplicationColumnName() {
        return applicationColumnName;
    }

    public void setApplicationColumnName(String applicationColumnName) {
        this.applicationColumnName = applicationColumnName;
    }

    public String getEndUserColumnName() {
        return endUserColumnName;
    }

    public void setEndUserColumnName(String endUserColumnName) {
        this.endUserColumnName = endUserColumnName;
    }

    public String getFormLeftPrompt() {
        return formLeftPrompt;
    }

    public void setFormLeftPrompt(String formLeftPrompt) {
        this.formLeftPrompt = formLeftPrompt;
    }

    public Integer getFlexValueSetId() {
        return flexValueSetId;
    }

    public void setFlexValueSetId(Integer flexValueSetId) {
        this.flexValueSetId = flexValueSetId;
    }

}