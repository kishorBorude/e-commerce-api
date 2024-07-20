package org.dnyanyog.controller;

import java.sql.SQLException;

import org.dnyanyog.dto.AddProductRequest;
import org.dnyanyog.dto.AddProductResponce;
import org.dnyanyog.service.AddProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddProductController {

	@PostMapping("/addProduct")
	public AddProductResponce addProduct(@RequestBody AddProductRequest addProduct) throws SQLException
	{
		return new AddProductService().addProduct(addProduct);
	}
}
