package com.restfull.mobileApp.ws.url.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restfull.mobileApp.ws.user.ui.model.response.UserRest;

@RestController
@RequestMapping("usersDetails")
public class UserDetailsController {
	
	@GetMapping(path= "/{userId}")
	public UserRest getUserInfo(@PathVariable String userId){
		UserRest returnValue=new UserRest();
		returnValue.setEmail("sahibase208@gmail.com");
		returnValue.setFirstName("Sahiba");
		returnValue.setLastName("Parveen");
		
		return returnValue;
	}
}
