package com.nab.hackthon.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankInfoDto {
    private String bankName;
    private String bankCode;
    private String bankId;
}
