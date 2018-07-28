package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/customers")
public class custController {

	@Autowired
	private custRepository repo;
	
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	public Iterable<cust> getAllCustomers(){
		return repo.findAll();
	}
	
	
}

