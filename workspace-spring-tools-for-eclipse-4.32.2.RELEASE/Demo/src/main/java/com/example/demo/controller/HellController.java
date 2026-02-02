package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellController {

	
	@GetMapping("/get")
	public String get() {
		return "Hello Priyanka-Vikas";
	}
	
}
