package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
	
	
	@GetMapping("/Helloworld")
	public String Helloworld() {
		return "HelloWorld!";
	}

}
