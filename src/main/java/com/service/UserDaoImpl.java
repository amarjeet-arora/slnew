package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Users;

@Service
public class UserDaoImpl implements UserDAO{
	ArrayList<Users> al=new ArrayList<Users>();
	@Override
	public boolean loginValidated(Users users) {
		for(Users user : al)  
			if(user.getUname().equals(users.getUname()) && user.getPass().equals(users.getPass())) {
				return true;
			}
			return false;
	}
	@Override
	public void addUser(Users users) {
		al.add(users);
		
	}
	@Override
	public List<Users> loadAll() {
		// TODO Auto-generated method stub
		return al;
	}
	@Override
	public boolean findUser(String uname) {
		for(Users user:al) {
			if(user.getUname().equals(uname)) {
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean updateUser(String name, Users user) {
		// TODO Auto-generated method stub
		return false;
	}

}
