package com.gozde.dockercomposedemo.service.impl;

import com.gozde.dockercomposedemo.model.Customer;
import com.gozde.dockercomposedemo.model.dto.CreateCustomerDto;
import com.gozde.dockercomposedemo.repository.CustomerRepository;
import com.gozde.dockercomposedemo.service.CustomerService;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.util.Collections;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public void createCustomer(CreateCustomerDto dto) {

        if (ObjectUtils.isEmpty(dto)) {
            throw new IllegalArgumentException("customer is empty");
        }
        Customer customer = Customer.builder().firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .build();
        customerRepository.save(customer);
    }
}
