package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class endpoint {
	@GetMapping("")
	public String hello() {
		return " welcome to java";
	}

}
