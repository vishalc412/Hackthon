package com.nab.hackthon.service;

import com.nab.hackthon.entity.Customer;


public interface CustomerLogin {

    public Customer login(String customerId) throws Throwable;
}
