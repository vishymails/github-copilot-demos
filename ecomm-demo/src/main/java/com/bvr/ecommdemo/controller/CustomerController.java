package com.bvr.ecommdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.bvr.ecommdemo.model.Customer;
import com.bvr.ecommdemo.services.CustomerService;
import java.util.List;


@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/customers/{id}")
    public Customer getCustomerById(@PathVariable("id") long customerId) {
        return customerService.getCustomerById(customerId);
    }

    @PostMapping("/customers")
    public String addCustomer(Customer customer) {
        customerService.addCustomer(customer);
        return "Customer added successfully";

    }

}
