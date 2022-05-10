package com.web.SpringBootFirstApp.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {

	public boolean validateuser(String userid, String password) {
		return userid.equalsIgnoreCase("User123")
				&& password.equalsIgnoreCase("pass123");
	}
}
