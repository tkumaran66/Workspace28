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
public class TodoController {
	
	@Autowired
	TodoService todoService;
	
	@RequestMapping(value="/list-todos", method=RequestMethod.GET)
	public String showTodos(ModelMap model) {
		String sessName = (String) model.get("MyName");
		model.put("todos", todoService.retrieveTodos(sessName));
		return "list-todos";
	}
}
