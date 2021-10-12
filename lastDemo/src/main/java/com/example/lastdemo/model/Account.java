package com.example.lastdemo.model;


import org.hibernate.engine.spi.CascadeStyle;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private BigDecimal balance;
    private LocalDateTime creationDate;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    public Account(BigDecimal balance, LocalDateTime creationDate, Customer customer) {
        this.balance = balance;
        this.creationDate = creationDate;
        this.customer = customer;
    }

    public Account(){

    }

    public Customer getCustomer() {
        return customer;
    }

    public int getId() {
        return id;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void enrollCustomer (Customer customer){

    }
}
