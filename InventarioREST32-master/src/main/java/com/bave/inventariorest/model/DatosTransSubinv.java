package com.bave.inventariorest.model;


public class DatosTransSubinv {

    private String transactionReference;
    private String transactionSourceName;

    public DatosTransSubinv() {}


    public DatosTransSubinv(String transactionReference, String transactionSourceName) {
        this.transactionReference = transactionReference;
        this.transactionSourceName = transactionSourceName;
    }

    public String getTransactionReference() {
        return transactionReference;
    }

    public void setTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
    }

    public String getTransactionSourceName() {
        return transactionSourceName;
    }

    public void setTransactionSourceName(String transactionSourceName) {
        this.transactionSourceName = transactionSourceName;
    }

}
