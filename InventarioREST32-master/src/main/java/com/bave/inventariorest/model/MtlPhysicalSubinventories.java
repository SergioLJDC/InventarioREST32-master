package com.bave.inventariorest.model;

import javax.persistence.*;

@Entity
@IdClass(MtlPhysicalSubinventoriesId.class)
@Table(name = "MTL_PHYSICAL_SUBINVENTORIES")
public class MtlPhysicalSubinventories {

    @Id
    @Column(name = "ORGANIZATION_ID")
    private Long organizationId;
    @Id
    @Column(name = "PHYSICAL_INVENTORY_ID")
    private Long physhicalInventoryId;
    @Column(name = "SUBINVENTORY")
    private String subinventory;
    //SUBINVENTORY_DESCRIPTION
    @Column(name = "SUBINVENTORY_DESCRIPTION")
    private String subinventoryDescription;

    public MtlPhysicalSubinventories() { }

    public MtlPhysicalSubinventories(Long organizationId, Long physhicalInventoryId, String subinventory, String subinventoryDescription) {
        this.organizationId = organizationId;
        this.physhicalInventoryId = physhicalInventoryId;
        this.subinventory = subinventory;
        this.subinventoryDescription = subinventoryDescription;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public Long getPhyshicalInventoryId() {
        return physhicalInventoryId;
    }

    public void setPhyshicalInventoryId(Long physhicalInventoryId) {
        this.physhicalInventoryId = physhicalInventoryId;
    }

    public String getSubinventory() {
        return subinventory;
    }

    public void setSubinventory(String subinventory) {
        this.subinventory = subinventory;
    }

    public String getSubinventoryDescription() {
        return subinventoryDescription;
    }

    public void setSubinventoryDescription(String subinventoryDescription) {
        this.subinventoryDescription = subinventoryDescription;
    }


}
