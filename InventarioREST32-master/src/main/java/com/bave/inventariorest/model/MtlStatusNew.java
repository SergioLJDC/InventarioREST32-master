package com.bave.inventariorest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MTL_STATUS_NEW")
public class MtlStatusNew {
    @Id
    @Column(name = "SHIPMENT_NUMBER", length = 100)
    private String shipmentNumber;

    @Column(name = "SOURCE_CODE", length = 100)
    private String sourceCode;

    @Column(name = "PROCESS_FLAG")
    private Long processFlag;

    @Column(name = "ORGANIZATION_ID")
    private Long organizationId;

    @Column(name = "GROUP_ID")
    private Long groupId;

    @Column(name = "CREATION_DATE", length = 100)
    private String creationDate;

    @Column(name = "LAST_UPDATE_DATE", length = 100)
    private String lastUpdateDate;

    public String getShipmentNumber() {
        return shipmentNumber;
    }

    public void setShipmentNumber(String shipmentNumber) {
        this.shipmentNumber = shipmentNumber;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public Long getProcessFlag() {
        return processFlag;
    }

    public void setProcessFlag(Long processFlag) {
        this.processFlag = processFlag;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

}