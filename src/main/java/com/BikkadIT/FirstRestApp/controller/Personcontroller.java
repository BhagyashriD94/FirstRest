package com.BikkadIT.FirstRestApp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Personcontroller {
	
	@GetMapping("/getperson")
	public ResponseEntity<Person> getperson(){
		
		Person p=new Person();
		p.setPid(1);
		p.setPname("shree");
		p.setPaddress("Pune");
		return new ResponseEntity<Person>(p,HttpStatus.OK);
		
	}

}
