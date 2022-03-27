package com.onlineSeat.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineSeat.Model.User;
import com.onlineSeat.Service.UserService;

@RestController
@RequestMapping("/Users")
public class UserController {

	@Autowired
	UserService service;
	
	@PostMapping("/add")
	public ResponseEntity<String> addUser( @RequestBody User u) {
		User us = service.addUser(u);
	
		
		return new ResponseEntity<String>("Record inserted successfully", HttpStatus.OK);
}
}