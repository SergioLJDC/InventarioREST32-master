package com.bave.inventariorest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*CREATE OR REPLACE FORCE VIEW APPS.XXEJE_PDA_ATRIBUTOS_LOTE

        (

        ID,

        DESCRIPTIVE_FLEX_CONTEXT_CODE,

        APPLICATION_COLUMN_NAME,

        END_USER_COLUMN_NAME,

        FORM_LEFT_PROMPT,

        FLEX_VALUE_SET_ID

        )

        AS

        (SELECT ROWNUM,

        a.DESCRIPTIVE_FLEX_CONTEXT_CODE,

        b.APPLICATION_COLUMN_NAME,

        b.END_USER_COLUMN_NAME,

        b.FORM_LEFT_PROMPT,

        b.FLEX_VALUE_SET_ID

        FROM FND_DESCR_FLEX_CONTEXTS_VL a, FND_DESCR_FLEX_COL_USAGE_VL b

        WHERE     a.APPLICATION_ID = '401'

        AND b.APPLICATION_ID = '401'

        AND a.DESCRIPTIVE_FLEXFIELD_NAME = 'Lot Attributes'

        AND b.DESCRIPTIVE_FLEXFIELD_NAME = 'Lot Attributes'

        AND a.ENABLED_FLAG = 'Y'

        AND b.ENABLED_FLAG = 'Y'

        AND a.DESCRIPTIVE_FLEX_CONTEXT_CODE =

        b.DESCRIPTIVE_FLEX_CONTEXT_CODE);*/

public class AttributoLote2 {
    Long id;

    String descriptiveFlexContextCode;

    String applicationColumnName;

    String endUserColumnName;

    String formLeftPrompt;

    Long number;


    public AttributoLote2() {
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

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }
}
