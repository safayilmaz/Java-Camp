package com.example.demo.model;

import javax.persistence.Table;

@Table(name = "transaction_type")
public enum TransactionType {
    Withdrawal, Deposit
}
