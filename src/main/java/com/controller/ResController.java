package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/mainapp")
public class ResController {
	 
	 @GetMapping("/login")
	public String login() {
		return "login"; 
	}
 
	 @GetMapping("/register")
	 
	public String register() {
		return "register"; 
	}
}
