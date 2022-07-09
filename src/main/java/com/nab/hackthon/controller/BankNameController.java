package com.nab.hackthon.controller;

import com.nab.hackthon.dto.BankInfoDto;
import com.nab.hackthon.model.BankInfo;
import com.nab.hackthon.service.BankInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankNameController {
    @Autowired
    BankInfoService bankInfoService;

    /***
     * Returns the name of the corresponding bank
     * also verifying the validity of the code (IBAN)
     * Sends 200 OK for correct bank else 404 for wrong or unrelated bank code
     * Sends 400 for malformed code
     * @param code : the code formed from IBAN number
     * @return bank details if found else blank response
     */
    @GetMapping("/bank")
    public ResponseEntity<BankInfoDto> getBankDetails(@RequestParam String code) {
        if (code == null || code.length() == 0 || code.length() != 4) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
        BankInfoDto retValue = bankInfoService.getBankInfo(code);
        if (retValue != null) {
            return new ResponseEntity< >(retValue, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
}
