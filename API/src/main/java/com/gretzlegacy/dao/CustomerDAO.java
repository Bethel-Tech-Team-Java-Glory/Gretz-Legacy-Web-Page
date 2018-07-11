package com.gretzlegacy.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gretzlegacy.model.Customer;
import com.gretzlegacy.repository.CustomerRepository;

@Service
public class CustomerDAO {
	
	@Autowired
	CustomerRepository customerRepository;
	
	/*To save a customer*/
	public Customer save(Customer cust) {
		return customerRepository.save(cust);
	}
	
	/*Search all customers*/
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
	
	/*Get a customer by Id*/
	public Optional<Customer> findById(Long custId) {
		return customerRepository.findById(custId);
	}
	
	/*Delete a customer*/
	public void delete (Customer cust) {
		customerRepository.delete(cust);
	}
	
}
