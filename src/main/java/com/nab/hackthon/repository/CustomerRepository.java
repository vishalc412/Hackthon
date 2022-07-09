package com.nab.hackthon.repository;

import com.nab.hackthon.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, String> {

    @Override
    Optional<com.nab.hackthon.entity.Customer> findById(String s);
}
