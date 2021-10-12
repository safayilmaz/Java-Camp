package com.example.demo.dto;

import com.example.demo.model.Customer;
import com.example.demo.model.Transaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class AccountDto {
    private String id;
    private BigDecimal balance;
    private LocalDateTime creationDate;
    private Customer customer;
    private List<Transaction> transaction;

}
