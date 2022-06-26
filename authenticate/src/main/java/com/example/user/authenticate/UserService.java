package com.example.user.authenticate;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	User user=new User("John","xyz");
	
	public String checkCredentials(User user) {
		if(user.userName=="John" & user.password=="xyz") {
			return "valid credentials";
		}else {
		return "Invalid Credentials!";
		}
	}

	public User getUser() {
		
		return user;
	}

}
