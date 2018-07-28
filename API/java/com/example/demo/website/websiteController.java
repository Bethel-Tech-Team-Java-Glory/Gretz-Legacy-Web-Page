package com.example.demo.website;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/website")
public class websiteController {
	@Autowired
	private websiteRepository repository;
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public Iterable<website> getAllWebsites(){
		return repository.findAll();
}}