package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.User;
import com.app.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService service;

	//1. Show Register page
	@RequestMapping("/register")
	public String showReg(ModelMap map) {
		map.addAttribute("user", new User());
		return "UserRegister";
	}

	
	//2. on click submit save data
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveUser(@ModelAttribute User user,ModelMap map) {
		Integer id=service.saveUser(user);
		map.addAttribute("message", "user saved:"+id);
		//clean form
		map.addAttribute("user", new User());
		return "UserRegister";
	}
	@RequestMapping("/denied")
	public String showDenied() {
		return "AccessDenied";
	}
	
}


