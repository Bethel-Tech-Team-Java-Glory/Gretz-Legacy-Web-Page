package com.gretzlegacy.repository;


import org.springframework.data.repository.CrudRepository;

import com.gretzlegacy.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
