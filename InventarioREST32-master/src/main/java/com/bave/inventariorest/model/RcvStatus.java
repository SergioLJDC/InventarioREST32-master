package com.bave.inventariorest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "RCV_STATUS")
public class RcvStatus {


    @Column(name = "PO_HEADER_ID")
    private Long po_header_id;
    @Id
    @Column(name = "RECEIP_NUM")
    private Long receip_num;
    @Column(name = "PROCESS_FLAG")
    private int process_flag;

    public RcvStatus() {
    }

    public Long getPo_header_id() {
        return po_header_id;
    }

    public void setPo_header_id(Long po_header_id) {
        this.po_header_id = po_header_id;
    }

    public Long getReceip_num() {
        return receip_num;
    }

    public void setReceip_num(Long receip_num) {
        this.receip_num = receip_num;
    }

    public int getProcess_flag() {
        return process_flag;
    }

    public void setProcess_flag(int process_flag) {
        this.process_flag = process_flag;
    }
}
