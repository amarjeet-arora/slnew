package com.service;

import java.util.List;

import com.model.Users;

public interface UserDAO {
	
	public boolean loginValidated(Users users);
	public void addUser(Users users);
	public  List<Users>loadAll();
	public boolean findUser(String uname);
	public boolean updateUser(String name ,Users user);

}
