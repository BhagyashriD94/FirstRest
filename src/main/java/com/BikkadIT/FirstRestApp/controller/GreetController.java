package com.BikkadIT.FirstRestApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetcontroller")
public class GreetController {
	@GetMapping("/wel")
	public String Greet() {
		String msg="Good morning";
		return msg;
		
	}
	@GetMapping("/greet1")
	public String Greet1() {
		String msg="Good night";
		return msg;
		
	}

}
