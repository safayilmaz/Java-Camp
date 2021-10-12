package com.example.demo.dto.Converter;

import com.example.demo.dto.AccountDto;
import com.example.demo.dto.CustomerAccountDto;
import com.example.demo.model.Account;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class AccountDtoConverter {

    private TransactionConverter transactionConverter;

    public CustomerAccountDto accountDto(Account from){
        return new CustomerAccountDto(from.getId(),from.getBalance(),from.getCreationDate(),
                from.getTransaction());
    }
}
