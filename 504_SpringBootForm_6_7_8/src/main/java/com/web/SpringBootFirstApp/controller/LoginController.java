package com.web.SpringBootFirstApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.SpringBootFirstApp.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginMessage(ModelMap model) {
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String welcomeMessage(@RequestParam String name, @RequestParam String pwd, ModelMap model) {
		boolean isValidUser = loginService.validateuser(name, pwd);
		if(!isValidUser) {
			model.put("errMess", "Invalid user name/password");
			return "login";
		}
		model.put("MyName", name);
		model.put("MyPassword", pwd);
		return "welcome";
	}
}
