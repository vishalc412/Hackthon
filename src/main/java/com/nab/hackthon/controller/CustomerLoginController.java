package com.nab.hackthon.controller;


import com.nab.hackthon.entity.Customer;
import com.nab.hackthon.service.CustomerLogin;
import com.nab.hackthon.utils.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.QueryParam;

@RestController
public class CustomerLoginController {

    @Autowired
    CustomerLogin customerLogin;


    @PostMapping(value = Constant.LOGIN_PROFILE)
    @ResponseBody
    public ResponseEntity<Customer> login(@QueryParam("customerId") String customerId) throws Throwable {

        return new ResponseEntity<>(customerLogin.login(customerId), HttpStatus.OK);
    }

}
