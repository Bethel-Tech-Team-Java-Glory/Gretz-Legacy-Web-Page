package com.gretzlegacy.controller.website;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gretzlegacy.model.website.Website;
import com.gretzlegacy.repository.website.WebsiteRepository;

@RestController
@RequestMapping("/website")
public class WebsiteController {
	@Autowired
	private WebsiteRepository repository;
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public Iterable<Website> getAllWebsites(){
		return repository.findAll();
}}