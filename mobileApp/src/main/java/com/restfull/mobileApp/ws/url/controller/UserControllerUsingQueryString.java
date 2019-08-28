package com.restfull.mobileApp.ws.url.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usersInfos")
public class UserControllerUsingQueryString {

	@GetMapping
	public String getUsers(@RequestParam(value="page") int page, @RequestParam(value="limit") int limit) {
		return "get user are called with page = "+page+ " and limit =" +limit;
	}

	// binding for get method using path
	@GetMapping(path = "/{userId}")
	public String getUser(@PathVariable String userId) {
		return "get user are called with userId :" + userId;
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
