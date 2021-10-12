package com.example.demo.dto.Converter;

import com.example.demo.dto.AccountCustomerDto;
import com.example.demo.dto.CustomerDto;
import com.example.demo.model.Customer;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CustomerDtoConverter {

    public AccountCustomerDto convertToAccountCustomer(Customer from) {
        return new AccountCustomerDto(from.getId(),from.getName(),from.getSurname());
    }

    public CustomerDto customerDtoConverter(Customer from){
        return new CustomerDto(from.getId(),from.getName(),from.getSurname(),from.getAccounts());
    }
}
