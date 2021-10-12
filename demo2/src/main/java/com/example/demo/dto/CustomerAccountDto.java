package com.example.demo.dto;

import com.example.demo.model.Transaction;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class CustomerAccountDto {


    private String id;
    private BigDecimal balance;
    private LocalDateTime transactionDate;
    private List<Transaction> transactions;

    public CustomerAccountDto(){

    }

    public CustomerAccountDto(String id, BigDecimal balance, LocalDateTime transactionDate, List<Transaction> transactions) {
        this.id = id;
        this.balance = balance;
        this.transactionDate = transactionDate;
        this.transactions = transactions;
    }

}
