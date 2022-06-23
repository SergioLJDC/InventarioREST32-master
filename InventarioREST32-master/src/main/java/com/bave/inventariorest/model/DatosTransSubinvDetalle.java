package com.bave.inventariorest.model;

public class DatosTransSubinvDetalle {
    private String segment1;
    private String subinventoryCode;
    private Long transactionInterfaceId;
    private String localizador;
    private String subinventarioHasta;
    private String localizadorHasta;
    private Double transactionQuantity;


    public DatosTransSubinvDetalle() {
    }

    public DatosTransSubinvDetalle(String segment1, String subinventoryCode, Long transactionInterfaceId, String localizador, String subinventarioHasta, String localizadorHasta, Double transactionQuantity) {
        this.segment1 = segment1;
        this.subinventoryCode = subinventoryCode;
        this.transactionInterfaceId = transactionInterfaceId;
        this.localizador = localizador;
        this.subinventarioHasta = subinventarioHasta;
        this.localizadorHasta = localizadorHasta;
        this.transactionQuantity = transactionQuantity;
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

    public Long getTransactionInterfaceId() {
        return transactionInterfaceId;
    }

    public void setTransactionInterfaceId(Long transactionInterfaceId) {
        this.transactionInterfaceId = transactionInterfaceId;
    }

    public String getLocalizador() {
        return localizador;
    }

    public void setLocalizador(String localizador) {
        this.localizador = localizador;
    }

    public String getSubinventarioHasta() {
        return subinventarioHasta;
    }

    public void setSubinventarioHasta(String subinventarioHasta) {
        this.subinventarioHasta = subinventarioHasta;
    }

    public String getLocalizadorHasta() {
        return localizadorHasta;
    }

    public void setLocalizadorHasta(String localizadorHasta) {
        this.localizadorHasta = localizadorHasta;
    }

    public Double getTransactionQuantity() {
        return transactionQuantity;
    }

    public void setTransactionQuantity(Double transactionQuantity) {
        this.transactionQuantity = transactionQuantity;
    }
}
