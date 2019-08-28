package com.restfull.mobileApp.ws.url.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
	
	//Get user information
	@GetMapping  //used for binding data
	public String getUser(){
		return "get user are called";
	}
	
	@PostMapping
	public String createUser(){
		return "create user are called";
	}
	
	@PutMapping
	public String updateUser(){
		return "update user are called";
	}
	
	@DeleteMapping
	public String deleteUser(){
		return "delete user are called";
	}
}
