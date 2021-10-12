package com.example.demo.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Entity
public class Account {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private
    String id;
    private BigDecimal balance;
    private LocalDateTime creationDate;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @OneToMany(mappedBy="account")
    private
    List<Transaction> transaction;

    public Account (){

    }

    public Account(String id, BigDecimal balance, LocalDateTime creationDate, Customer customer, List<Transaction> transaction) {
        this.setId(id);
        this.setBalance(balance);
        this.setCreationDate(creationDate);
        this.setCustomer(customer);
        this.setTransaction(transaction);
    }

    public Account(String id, BigDecimal balance, LocalDateTime creationDate, List<Transaction> transaction) {
        this.setId(id);
        this.setBalance(balance);
        this.setCreationDate(creationDate);
        this.setTransaction(transaction);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return getId() == account.getId() && Objects.equals(getBalance(), account.getBalance()) && Objects.equals(getCreationDate(), account.getCreationDate()) && getCustomer().equals(account.getCustomer()) && Objects.equals(getTransaction(), account.getTransaction());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getBalance(), getCreationDate(), getCustomer(), getTransaction());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
    }
}
