package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Users;
import com.service.UserDAO;

@RestController
@RequestMapping("/mainapp")
public class AppController {

	@Autowired
	private UserDAO dao;

	@PostMapping("/login")
	public String loginValid(@RequestBody Users users) {
		if (dao.loginValidated(users)) {
			return "Login Success...!";

		}
		return "Login Failure...!";
	}

	@PostMapping("/register")
	public String userRegister(@RequestBody Users users) {

		dao.addUser(users);

		return "user added!";

	}
	@GetMapping("/loadusers")
	public List<Users>loadAll(){
		return dao.loadAll();
	}
	@GetMapping("/finduser/{uname}")
	public String findUser(@PathVariable() String uname) {
		if(dao.findUser(uname)) {
			return uname + " found";
		}
		return "username not found";
	}
	@PutMapping("/updateUser/{uname}")
	public String updateUser(@PathVariable() String uname,@RequestBody Users user) {
		if(dao.updateUser(uname, user)) {
			return uname + " found and updated";
		}
		return uname;
	 
	}
}
