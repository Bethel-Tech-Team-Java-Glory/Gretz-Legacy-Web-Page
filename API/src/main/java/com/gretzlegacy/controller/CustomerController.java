package com.gretzlegacy.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.gretzlegacy.model.Customer;
import com.gretzlegacy.repository.CustomerRepository;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	@Autowired
	private CustomerRepository repo;
	
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	public Iterable<Customer> getAllCustomers(){
		return repo.findAll();
}}