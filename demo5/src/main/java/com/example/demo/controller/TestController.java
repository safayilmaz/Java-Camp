package com.example.demo.controller;

import com.example.demo.model.Account;
import com.example.demo.model.Customer;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/all/")
public class TestController {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private AccountRepository accountRepository;


    @GetMapping("getallcustomer")
    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }

    @PostMapping("createCustomer")
    public Customer createCustomer(Customer customer){
            return customerRepository.save(customer);
    }

    @PutMapping("{customer_id}/customer/{id}")
    Account enrollAccountToCustomer(@PathVariable int customer_id, @PathVariable int id){
        Customer customer = customerRepository.findById(customer_id).get();
        Account account = accountRepository.findById(id).get();
        account.setCustomer(customer);

        return customerRepository.add(account);


    }
}
