package com.restfull.mobileApp.ws.url.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("userSortInfo")
public class UserControllerWithParameterOptional {
	
	/*@GetMapping
	public String getUsers(@RequestParam(value="page", defaultValue="1") int page, 
			@RequestParam(value="limit", defaultValue="50") int limit) {
		return "get user are called with page = "+page+ " and limit =" +limit;
	}*/

	// binding for get method using path
	@GetMapping
	public String getUser(@RequestParam(value="page", defaultValue="1") int page, 
			@RequestParam(value="limit", defaultValue="50") int limit,
			@RequestParam(value="sort", defaultValue="desc", required=false) String sort) {
		return "get user are called with page = "+page+ " and limit =" +limit+" and sort =" +sort;
	}

	@PostMapping
	public String createUser() {
		return "create user are called";
	}

	@PutMapping
	public String updateUser() {
		return "update user are called";
	}

	@DeleteMapping
	public String deleteUser() {
		return "delete user are called";
	}

}
