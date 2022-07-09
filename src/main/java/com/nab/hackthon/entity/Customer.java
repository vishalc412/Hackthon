package com.nab.hackthon.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER_MASTER")
@Setter
@Getter
public class Customer {

    @Id
    private String customerId;

    private String customerName;
}
