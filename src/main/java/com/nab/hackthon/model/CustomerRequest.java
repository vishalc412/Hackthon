package com.nab.hackthon.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class CustomerRequest {
    String customerId;
    String customerName;
}
