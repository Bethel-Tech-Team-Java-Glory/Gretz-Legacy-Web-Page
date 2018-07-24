package com.gretzlegacy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gretzlegacy.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
