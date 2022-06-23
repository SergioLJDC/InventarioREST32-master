package com.bave.inventariorest.model;

import java.io.Serializable;
import java.util.Objects;

public class MtlMaterialTransactionsDto implements Serializable {
    private final Long transactionId;
    private final Long shipmentLineId;
    private final String entregaCreationDate;
    private final String subinventory;

    public MtlMaterialTransactionsDto(Long transactionId, Long shipmentLineId, String entregaCreationDate, String subinventory) {
        this.transactionId = transactionId;
        this.shipmentLineId = shipmentLineId;
        this.entregaCreationDate = entregaCreationDate;
        this.subinventory = subinventory;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public Long getShipmentLineId() {
        return shipmentLineId;
    }

    public String getEntregaCreationDate() {
        return entregaCreationDate;
    }

    public String getSubinventory() {
        return subinventory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MtlMaterialTransactionsDto entity = (MtlMaterialTransactionsDto) o;
        return Objects.equals(this.transactionId, entity.transactionId) &&
                Objects.equals(this.shipmentLineId, entity.shipmentLineId) &&
                Objects.equals(this.entregaCreationDate, entity.entregaCreationDate) &&
                Objects.equals(this.subinventory, entity.subinventory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionId, shipmentLineId, entregaCreationDate, subinventory);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "transactionId = " + transactionId + ", " +
                "shipmentLineId = " + shipmentLineId + ", " +
                "entregaCreationDate = " + entregaCreationDate + ", " +
                "subinventory = " + subinventory + ")";
    }
}
