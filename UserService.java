package com.example.demo.service;

import com.example.demo.entity.Users;

public interface UserService
{
	//adding user in database
	String addUser(Users user);
    //cheking email in database
	boolean checkEmail(String email);
	//validate user credintials
	boolean validate(String email,String password);
	//getting user 
	public Users getUserByEmail(String email);
	
	

	
}

