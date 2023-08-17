package com.BikkadIT.FirstRestApp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcomecontroller")
public class WelcomeController {
	@GetMapping("/wel")
	public ResponseEntity<String> Welcome() {
		String msg="Welcome to BikkadIT";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
		
	}
	@GetMapping("/wel1")
	public ResponseEntity<String> Welcome1() {
		String msg="Welcome to BikkadIt pune";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
		
	}

}
