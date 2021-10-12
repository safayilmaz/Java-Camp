package com.example.demo.dto.Converter;

import com.example.demo.dto.CustomerAccountDto;
import com.example.demo.dto.CustomerDto;
import com.example.demo.dto.TransactionDto;
import com.example.demo.model.Account;
import com.example.demo.model.Customer;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class CustomerAccountDtoConverter {
    private TransactionConverter transactionConverter;

    public CustomerAccountDtoConverter(TransactionConverter transactionConverter){
        this.transactionConverter = transactionConverter;
    }

    public CustomerAccountDto convert (Account from){
        return new CustomerAccountDto();
    }
}
