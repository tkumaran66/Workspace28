package com.in28minutes.springboot.web.SpringBootFirstApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.in28minutes.springboot.web.dummypackage.DummyService;
import com.in28minutes.springboot.web.service.TodoService;

@Controller
@SessionAttributes("MyName")
public class WelcomeController {
	
	@Autowired
	DummyService dummyService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String loginMessage(ModelMap model) {
		model.put("MyName", getLoggedUserName());
		return "welcome";
	}
	
	private String getLoggedUserName() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if(principal instanceof UserDetails) {
			return ((UserDetails)principal).getUsername();
		}
		return principal.toString();
	}
}
