package com.bave.inventariorest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "XXPDA_LOG_USERS")
public class XxpdaLogUser {
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "TRANSACTION_DATE", length = 100)
    private String transactionDate;

    @Column(name = "NRO", length = 250)
    private String nro;

    @Column(name = "TRANSACTION", length = 250)
    private String transaction;

    @Id
    @Column(name = "ID_TRANSACTION")
    private Long idTransaction;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public Long getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(Long idTransaction) {
        this.idTransaction = idTransaction;
    }

}