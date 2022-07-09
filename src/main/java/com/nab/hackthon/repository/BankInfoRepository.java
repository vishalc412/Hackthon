package com.nab.hackthon.repository;

import com.nab.hackthon.model.BankInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankInfoRepository extends JpaRepository<BankInfo, String> {
    BankInfo findByBankCode(String code);
}
