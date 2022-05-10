package com.tkcomp.RESTSample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class MyController {
	
	@GetMapping
	public String getName() {
		return "Thiru";
	}
}
