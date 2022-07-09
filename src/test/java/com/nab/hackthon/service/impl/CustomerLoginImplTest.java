package com.nab.hackthon.service.impl;

import com.nab.hackthon.entity.Customer;
import com.nab.hackthon.repository.CustomerRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;

import javax.swing.text.AttributeSet;
import javax.swing.text.html.Option;


import static org.mockito.ArgumentMatchers.any;

public class CustomerLoginImplTest {

    @MockBean
    CustomerRepository customerRepository;

    @BeforeEach
    void init(){
        CustomerLoginImpl login = new CustomerLoginImpl();
    }
    @Test
    void loginTest() {
        Customer customer = Mockito.mock(Customer.class);
        customer.setCustomer_Id("vchawla");
        customer.setCustomer_Name("Vishal Chawla");
        Mockito.when(customerRepository.findById(any())).thenReturn(any());


    }


}
