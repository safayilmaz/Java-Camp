package com.example.demo.service;

import com.example.demo.exception.CustomerNotFoundException;
import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class CustomerService {

    private CustomerRepository customerRepository;

    public Customer findCustomerById(int id){
        return customerRepository.findById(id).orElseThrow(()-> new CustomerNotFoundException("Customer could not found by id" + id));
    }
}
