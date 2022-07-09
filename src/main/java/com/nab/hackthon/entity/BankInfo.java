package com.nab.hackthon.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "bank_master")
@Data
public class BankInfo{
    @Column(name = "BANKNAME")
    private String bankName;

    @Column(name = "CODE")
    private String bankCode;

    @Id
    @Column(name = "BANKID")
    private String bankId;
}
