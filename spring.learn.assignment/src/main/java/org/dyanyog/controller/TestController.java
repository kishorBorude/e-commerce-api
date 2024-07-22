package org.dyanyog.controller;

import org.dyanyog.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
	
	@Autowired
	Student std;
	
	@GetMapping("/")
	public Student Test()  {
		
		
		std.firstname="kishor";
		std.lastname="borude";
		std.mobile="8806368952";
		
		
		std.address.street="nagar road";
		std.address.city="shrigonda";
		std.address.state="MH";
		std.address.country="india";
		
		
		std.batch.batchname="BE";
		std.batch.branchname="IT";
		std.batch.classteacher="xyz";
		
		
		std.batch.batchlocation.street="nagar road";
		std.batch.batchlocation.city="pune";
		std.batch.batchlocation.state="MH";
		std.batch.batchlocation.country="india";
		
		return std;
		
	}

}
