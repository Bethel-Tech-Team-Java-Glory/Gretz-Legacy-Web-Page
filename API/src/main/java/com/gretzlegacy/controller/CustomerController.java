package com.gretzlegacy.controller;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gretzlegacy.dao.CustomerDAO;
import com.gretzlegacy.model.Customer;

@RestController
@RequestMapping("/company")

public class CustomerController {
	
	@Autowired
	CustomerDAO customerDAO;
	
	/* Save a customer to DB*/
	@PostMapping("/customers")
	public Customer createCustomer(@Valid @RequestBody Customer cust) {
		return customerDAO.save(cust);
	}
	
	/*Get all customers*/
	@GetMapping("/customers")
	public List<Customer> getAllCustomers() {
		return customerDAO.findAll();
	}
	
	/*Get customer by custId*/
	@GetMapping("/customers/{id}")
	public ResponseEntity<Long> getCustomerById(@PathVariable(value="id") Long custId){
		
		Optional<Customer> cust=customerDAO.findById(custId);
		
		if(cust==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(custId);
	}
	/*Update a customer*/
	@PutMapping("/put/{custId}")
	public Customer putMethod(@PathVariable Long custId, @RequestBody Customer customer) {
		return customer;
    
	}
	
		
	/*Delete a customer*/
	@DeleteMapping("/delete/{custId}")
	public String deleteMethod(@PathVariable int custId) {
		return null;
		
	}}