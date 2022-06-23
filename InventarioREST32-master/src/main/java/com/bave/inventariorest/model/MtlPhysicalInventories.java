package com.bave.inventariorest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MTL_PHYSICAL_INVENTORIES")
public class MtlPhysicalInventories {
    @Id
    @Column(name = "PHYSICAL_INVENTORY_ID")
    private Long physicalInventoryId;
    @Column(name = "ORGANIZATION_ID")
    private Long organizationId;
    @Column(name = "LAST_UPDATE_DATE")
    private String lastUpdateDate;
    @Column(name = "LAST_UPDATED_BY")
    private Long lastUpdatedBy;
    @Column(name = "CREATION_DATE")
    private String creationDate;
    @Column(name = "CREATED_BY")
    private Long createdBy;
    @Column(name = "PHYSICAL_INVENTORY_DATE")
    private String physicalInventoryDate;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "FREEZE_DATE")
    private String freezeDate;
    @Column(name = "PHYSICAL_INVENTORY_NAME")
    private String physicalInventoryName;
    @Column(name = "USER_ID")
    private Long userId;
    @Column(name = "EMPLOYEE_ID")
    private Long employeeId;
    @Column(name = "APPROVAL_REQUIRED")
    private Long approvalRequired;
    @Column(name = "ALL_SUBINVENTORIES_FLAG")
    private Long allSubinventoriesFlag;

    public MtlPhysicalInventories(){

    }

    public Long getPhysicalInventoryId() {
        return physicalInventoryId;
    }

    public void setPhysicalInventoryId(Long physicalInventoryId) {
        this.physicalInventoryId = physicalInventoryId;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Long getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(Long lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public String getPhysicalInventoryDate() {
        return physicalInventoryDate;
    }

    public void setPhysicalInventoryDate(String physicalInventoryDate) {
        this.physicalInventoryDate = physicalInventoryDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFreezeDate() {
        return freezeDate;
    }

    public void setFreezeDate(String freezeDate) {
        this.freezeDate = freezeDate;
    }

    public String getPhysicalInventoryName() {
        return physicalInventoryName;
    }

    public void setPhysicalInventoryName(String physicalInventoryName) {
        this.physicalInventoryName = physicalInventoryName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getApprovalRequired() {
        return approvalRequired;
    }

    public void setApprovalRequired(Long approvalRequired) {
        this.approvalRequired = approvalRequired;
    }

    public Long getAllSubinventoriesFlag() {
        return allSubinventoriesFlag;
    }

    public void setAllSubinventoriesFlag(Long allSubinventoriesFlag) {
        this.allSubinventoriesFlag = allSubinventoriesFlag;
    }


}
