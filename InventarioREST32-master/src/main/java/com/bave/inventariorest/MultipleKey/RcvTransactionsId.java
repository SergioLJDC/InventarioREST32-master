package com.bave.inventariorest.MultipleKey;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Access (AccessType.FIELD)
public class RcvTransactionsId implements Serializable {


    @Column(name = "PARENT_TRANSACTION_ID")
    private Long parentTransactionId;

    @Column(name = "CREATED_BY")
    private Long createdBy;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RcvTransactionsId that = (RcvTransactionsId) o;
        return parentTransactionId == that.parentTransactionId && createdBy == that.createdBy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getParentTransactionId(), getCreatedBy());
    }

    public RcvTransactionsId() {
    }

    public RcvTransactionsId(Long interfaceTransactionId, Long createdBy) {
        this.parentTransactionId = interfaceTransactionId;
        this.createdBy = createdBy;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getParentTransactionId() {
        return parentTransactionId;
    }

    public void setParentTransactionId(Long interfaceTransactionId) {
        this.parentTransactionId = interfaceTransactionId;
    }
}
