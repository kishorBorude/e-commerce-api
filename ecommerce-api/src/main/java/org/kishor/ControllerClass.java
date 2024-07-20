package org.kishor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
	
	@GetMapping("/kishor")
	public String hello() {
		return "hello kishor";
}
	@GetMapping("/omkar")
	public String hey() {
		return "hey sweety";
	}
}