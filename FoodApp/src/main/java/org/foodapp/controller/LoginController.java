package org.foodapp.controller;

import org.foodapp.model.User;
import org.foodapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/")
	public String checkMVC() {
		return "login";
	}
	
	@RequestMapping("/login")
	public String loginHomePage(@RequestParam("email") String email,
			@RequestParam("password") String password, Model model)
	{
		User u = null;
		try {
			u=userRepository.findByEmail(email);
		}
		catch(Exception e) {
			System.out.println("User Not Found !!");
		}
		if(u!=null) {
			model.addAttribute("Email",email);
			return "index";
		}
		model.addAttribute("error","User Not Found, Kindly Register !!");
		return "login";
	}
	
	@RequestMapping("/register")
	public String setUser(){
		return "login";
	}
}
