package org.dyanyog.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Batch {
	
	public String batchname;
	public String branchname;
	public String classteacher;
	
	@Autowired
	public Address batchlocation;

}
