package com.bave.inventariorest.model;

import com.bave.inventariorest.MultipleKey.CustomerId;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "customer")

public class Customer {

   @EmbeddedId
   CustomerId customerId;

    @Column(name = "NUMERO")
    int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Customer() {
    }

    public CustomerId getCustomerId() {
        return customerId;
    }

    public void setCustomerId(CustomerId customerId) {
        this.customerId = customerId;
    }







}