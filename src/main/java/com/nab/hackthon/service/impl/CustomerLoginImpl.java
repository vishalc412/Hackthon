package com.nab.hackthon.service.impl;

import com.nab.hackthon.ResourceNotFoundException;
import com.nab.hackthon.entity.Customer;
import com.nab.hackthon.repository.CustomerRepository;
import com.nab.hackthon.service.CustomerLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerLoginImpl implements CustomerLogin {


    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer login(String customerId) throws Throwable {
       return (Customer) customerRepository.findById(customerId).orElseThrow(
               () ->  new ResourceNotFoundException("No User Id exist",customerId,"Demo"));


    }
}
