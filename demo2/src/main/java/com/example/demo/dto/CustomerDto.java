package com.example.demo.dto;

import com.example.demo.model.Account;

import java.util.List;

public class CustomerDto {

    private String id;
    private String name;
    private String surname;
    List<Account> accounts;

    public CustomerDto(String id, String name, String surname, List<Account> accounts) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.accounts = accounts;
    }

}
