package com.example.demo.dto.Converter;

import com.example.demo.dto.TransactionDto;
import com.example.demo.model.Transaction;
import org.springframework.stereotype.Component;

@Component
public class TransactionConverter {


    public TransactionDto convert(Transaction from){
        return new TransactionDto(from.getId(), from.getAmount(), from.getTransactionDate(),from.getType());
    }
}
