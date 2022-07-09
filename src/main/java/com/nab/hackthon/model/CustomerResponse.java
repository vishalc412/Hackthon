package com.nab.hackthon.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class CustomerResponse {
    String customerId;
    String customerName;
    String message;
}
