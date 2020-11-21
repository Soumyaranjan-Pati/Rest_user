package com.symentix.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.symentix.user.dto.User;
import com.symentix.user.service.IUserService;



@RestController
public class UserController {

	@Autowired
	IUserService serviceRef;
	
	@RequestMapping("/users")
	public List<User>getAllUser(){
		return serviceRef.getAllUser();
	}
	
	@RequestMapping("/users/{userId}")
	public Optional<User> getUserById(@PathVariable int userId){
		return serviceRef.getUserById(userId);
	}

	@RequestMapping(method=RequestMethod.POST,value="/users")
	public void addUser(@RequestBody User u) {
		 serviceRef.addUser(u);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/uers/{uId}")
	public void updateUser(@RequestBody User u,@PathVariable int uId) {
		serviceRef.updateUser(u,uId);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/users/{userId}")
		public void deleteUser(@PathVariable int uId) {
			serviceRef.deleteUser(uId);
		}
	
}
