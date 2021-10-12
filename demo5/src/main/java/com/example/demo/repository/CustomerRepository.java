package com.example.demo.repository;

import com.example.demo.model.Account;
import com.example.demo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    Account add(Account account);
}
