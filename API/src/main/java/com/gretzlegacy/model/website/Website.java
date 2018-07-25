package com.gretzlegacy.model.website;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "Customers")
public class Website {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idWebsite;
	
	private String WebsiteTitle;
	
	private String WebsiteDescription;

}
