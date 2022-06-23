package com.bave.inventariorest.model;

import java.io.Serializable;
import java.util.Objects;



public class MtlPhysicalSubinventoriesId implements Serializable {

    private Long organizationId;
    private Long physhicalInventoryId;


    public MtlPhysicalSubinventoriesId() {
    }

    public MtlPhysicalSubinventoriesId(Long organizationId, Long physhicalInventoryId) {
        this.organizationId = organizationId;
        this.physhicalInventoryId = physhicalInventoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MtlPhysicalSubinventoriesId that = (MtlPhysicalSubinventoriesId) o;
        return organizationId.equals(that.organizationId) && physhicalInventoryId.equals(that.physhicalInventoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizationId, physhicalInventoryId);
    }
}
