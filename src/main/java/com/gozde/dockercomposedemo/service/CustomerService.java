package com.gozde.dockercomposedemo.service;

import com.gozde.dockercomposedemo.model.Customer;
import com.gozde.dockercomposedemo.model.dto.CreateCustomerDto;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();

    void createCustomer(CreateCustomerDto dto);
}
