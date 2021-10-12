package com.example.demo;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application {

    private CustomerRepository customerRepository;

    public void AccountApplication(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
    }
    Customer customer = customerRepository.save(new Customer("","Cagri", "Dursun"));
    Customer customer2 = customerRepository.save(new Customer("","Alice", "Bob"));


    public void run() {
        System.out.println(customer);
        System.out.println(customer2);
    }
}


