package com.example.user.authenticate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/credentials")
	public User getUser() {
		return userService.getUser();
	}
	
	@PostMapping("/credentials")
	public String credentials(@RequestBody User user) {
		return userService.checkCredentials(user);
	}
}
