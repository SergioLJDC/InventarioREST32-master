package com.bave.inventariorest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "MTL_STATUS")
public class MtlStatus {
    @Id
    @Column(name = "SHIPMENT_NUMBER", nullable = false, length = 100)
    private String shipmentNumber;

    @Column(name = "SOURCE_CODE", length = 100)
    private String sourceCode;

    @Column(name = "PROCESS_FLAG", nullable = false)
    private Long processFlag;

    @Column(name = "ORGANIZATION_ID", nullable = false)
    private Long organizationId;

    @Column(name = "GROUP_ID")
    private Long groupId;

    @Column(name = "PROCESS_CODE", length = 15)
    private String processCode;

    @Column(name = "CREATION_DATE")
    private LocalDate creationDate;

    @Column(name = "LAST_UPDATE_DATE")
    private LocalDate lastUpdateDate;

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

    public String getProcessCode() {
        return processCode;
    }

    public void setProcessCode(String processCode) {
        this.processCode = processCode;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(LocalDate lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

}