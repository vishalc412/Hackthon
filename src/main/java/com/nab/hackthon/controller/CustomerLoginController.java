package com.nab.hackthon.controller;


import com.nab.hackthon.utils.Constant;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.QueryParam;

@RestController
public class CustomerLoginController {

    @PostMapping(value = Constant.LOGIN_PROFILE)
    @ResponseBody
    public ResponseEntity<?> login(@QueryParam("customerId") String customerId){
        return null;
    }

}
