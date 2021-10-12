package com.example.demo.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransactionDto {


    private String id;
    private BigDecimal amount;
    private LocalDateTime transactionDate;
    private String type ;

    public TransactionDto(){

    }

    public TransactionDto(String id, BigDecimal amount, LocalDateTime transactionDate, String type) {
        this.setId(id);
        this.setAmount(amount);
        this.setTransactionDate(transactionDate);
        this.setType(type);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
