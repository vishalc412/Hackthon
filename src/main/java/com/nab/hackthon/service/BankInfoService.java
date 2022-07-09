package com.nab.hackthon.service;

import com.nab.hackthon.dto.BankInfoDto;
import com.nab.hackthon.model.BankInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface BankInfoService {
    BankInfoDto getBankInfo(String code);
}
