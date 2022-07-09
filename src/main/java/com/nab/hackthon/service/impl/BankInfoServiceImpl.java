package com.nab.hackthon.service.impl;

import com.nab.hackthon.dto.BankInfoDto;
import com.nab.hackthon.model.BankInfo;
import com.nab.hackthon.repository.BankInfoRepository;
import com.nab.hackthon.service.BankInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BankInfoServiceImpl implements BankInfoService {

    @Autowired
    BankInfoRepository bankInfoRepository;

    @Override
    public BankInfoDto getBankInfo(String code) {
        BankInfo dbObject = bankInfoRepository.findByBankCode(code);
        BankInfoDto retValue = null;
        if (dbObject != null) {
            retValue = new BankInfoDto();
            retValue.setBankId(dbObject.getBankId());
            retValue.setBankCode(dbObject.getBankCode());
            retValue.setBankName(dbObject.getBankName());
        }
        return retValue;
    }
}
