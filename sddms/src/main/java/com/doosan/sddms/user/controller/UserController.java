package com.doosan.sddms.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.doosan.sddms.user.domain.User;
import com.doosan.sddms.user.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping(method=RequestMethod.GET, value="/{username}")
	public User readOneUser(@PathVariable String username) {
		return userService.readOneUser(username);
	}
	
	@RequestMapping("/create")
	public String createUser(User user) {
		User user1 = new User();
		user1.setUser_name("bbb");
		user1.setUser_password("bbbpass");
		user1.setEmp_nm("BBB");
		user1.setOrg_id("0900");
		userService.createUser(user1);
		return "success";
	}
	
	
}
