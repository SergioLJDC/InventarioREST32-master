package com.bave.inventariorest.MultipleKey;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Access (AccessType.FIELD)
public class RcvTransactionsId implements Serializable {


    @Column(name = "PARENT_TRANSACTION_ID")
    private Long parentTransactionId;

    @Column(name = "TRANSACTION_ID")
    private Long transactionId;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RcvTransactionsId that = (RcvTransactionsId) o;
        return parentTransactionId == that.parentTransactionId && transactionId == that.transactionId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getParentTransactionId(), getTransactionId());
    }

    public RcvTransactionsId() {
    }

    public RcvTransactionsId(Long interfaceTransactionId, Long createdBy) {
        this.parentTransactionId = interfaceTransactionId;
        this.transactionId = createdBy;
    }


    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Long getParentTransactionId() {
        return parentTransactionId;
    }

    public void setParentTransactionId(Long interfaceTransactionId) {
        this.parentTransactionId = interfaceTransactionId;
    }
}
