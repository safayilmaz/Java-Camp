package com.example.demo.controller;

import com.example.demo.service.AccountService;
import com.example.demo.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers/")
public class CustomerController {
    private CustomerService customerService;

    private CustomerController (CustomerService customerService){
        this.customerService = customerService;
    }


}
