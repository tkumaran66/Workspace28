package com.in28minutes.springboot.web.SpringBootFirstApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.in28minutes.springboot.web.SpringBootFirstApp.service.LoginService;
import com.in28minutes.springboot.web.dummypackage.DummyService;
import com.in28minutes.springboot.web.service.TodoService;

@Controller
@SessionAttributes("MyName")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	@Autowired
	DummyService dummyService;
	
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
