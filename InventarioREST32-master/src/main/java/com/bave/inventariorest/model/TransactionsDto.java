package com.bave.inventariorest.model;





public class TransactionsDto {
    private Long interfaceTransactionId;
    private Long lineNum;
    private String segment1;
    private String creationDate;

    public TransactionsDto(){
        
    }

    public TransactionsDto(Long interfaceTransactionId, Long lineNum, String segment1, String creationDate) {
        this.interfaceTransactionId = interfaceTransactionId;
        this.lineNum = lineNum;
        this.segment1 = segment1;
        this.creationDate = creationDate;
    }

    public Long getInterfaceTransactionId() {
        return interfaceTransactionId;
    }

    public void setInterfaceTransactionId(Long interfaceTransactionId) {
        this.interfaceTransactionId = interfaceTransactionId;
    }

    public Long getLineNum() {
        return lineNum;
    }

    public void setLineNum(Long lineNum) {
        this.lineNum = lineNum;
    }

    public String getSegment1() {
        return segment1;
    }

    public void setSegment1(String segment1) {
        this.segment1 = segment1;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

}
