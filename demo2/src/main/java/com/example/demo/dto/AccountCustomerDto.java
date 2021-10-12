package com.example.demo.dto;

import com.example.demo.model.Account;

import java.util.List;

public class AccountCustomerDto {

    private String id;
    private String name;
    private String surname;

    public AccountCustomerDto(){

    }
    public AccountCustomerDto(String id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

}
