package com.example.demo.service;

import com.example.demo.dto.Converter.CustomerDtoConverter;
import com.example.demo.dto.CustomerDto;
import com.example.demo.exception.CustomerNotFoundException;
import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    private CustomerDtoConverter converter;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer findCustomerByID(String id){
        return customerRepository.findById(id).orElseThrow(()-> new CustomerNotFoundException("Customer could not find by id"));
    }
    public CustomerDto getCustomerById(String customerId) {
        return converter.customerDtoConverter(findCustomerByID(customerId));
    }

}
