package org.dyanyog.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

	
	public String firstname;
	public String lastname;
	public String mobile;
	
	@Autowired
	public Address address;
	
	@Autowired
	public Batch batch;
	
	
	
	
}
