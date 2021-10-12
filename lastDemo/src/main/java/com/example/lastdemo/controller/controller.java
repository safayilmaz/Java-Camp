package com.example.lastdemo.controller;

import com.example.lastdemo.model.Account;
import com.example.lastdemo.model.Customer;
import com.example.lastdemo.repository.AccountRepository;
import com.example.lastdemo.repository.CustomerRepository;
import org.hibernate.annotations.NamedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/control/")
public class controller {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("getallcustomers")
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    @GetMapping("getAllAccounts")
    public List<Account> getAllAccounts(){
        return accountRepository.findAll();
    }

    @PostMapping("/create")
    public Customer createCustomer(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }

    @PostMapping("/createAccount")
    public Account createAccount(@RequestBody Account account){
        return accountRepository.save(account);
    }

    @GetMapping("employees/{id}")
    public ResponseEntity<Customer> getEmployeeById(@PathVariable(value = "id") int id){
        Customer customer = customerRepository.findById(id).orElseThrow(()-> new ExceptionCustomer("Not found +"));
        return ResponseEntity.ok().body(customer);
    }

    @GetMapping("/{accountid}/customer/{customerid}")
    public Customer enrollAccountToCustomer(
            @PathVariable int id){

       return accountRepository.findById(id).get();

    }
}
