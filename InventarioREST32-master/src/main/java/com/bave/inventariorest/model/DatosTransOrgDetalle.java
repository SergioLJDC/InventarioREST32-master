package com.bave.inventariorest.model;

public class DatosTransOrgDetalle {


    private String segment1;
    private String subinventoryCode;
    private Long transactionInterfaceId;
    private String localizador;
    private String OrganizationCode;
    private Double transactionQuantity;


    public DatosTransOrgDetalle() {
    }

    public DatosTransOrgDetalle(String segment1, String subinventoryCode, Long transactionInterfaceId, String localizador, String organizationCode, Double transactionQuantity) {
        this.segment1 = segment1;
        this.subinventoryCode = subinventoryCode;
        this.transactionInterfaceId = transactionInterfaceId;
        this.localizador = localizador;
        OrganizationCode = organizationCode;
        this.transactionQuantity = transactionQuantity;
    }

    public String getOrganizationCode() {
        return OrganizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        OrganizationCode = organizationCode;
    }

    public String getSegment1() {
        return segment1;
    }

    public void setSegment1(String segment1) {
        this.segment1 = segment1;
    }

    public String getSubinventoryCode() {
        return subinventoryCode;
    }

    public void setSubinventoryCode(String subinventoryCode) {
        this.subinventoryCode = subinventoryCode;
    }

    public String getLocalizador() {
        return localizador;
    }

    public void setLocalizador(String localizador) {
        this.localizador = localizador;
    }

    public Double getTransactionQuantity() {
        return transactionQuantity;
    }

    public void setTransactionQuantity(Double transactionQuantity) {
        this.transactionQuantity = transactionQuantity;
    }

    public Long getTransactionInterfaceId() {
        return transactionInterfaceId;
    }

    public void setTransactionInterfaceId(Long transactionInterfaceId) {
        this.transactionInterfaceId = transactionInterfaceId;
    }

}
