package com.example.demo.controller;

import java.util.List;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Course;
import com.example.demo.entity.Users;
import com.example.demo.service.TrainerService;
import com.example.demo.service.UserService;

@Controller
public class ServiceController 
{

	@Autowired
	UserService us;
	@Autowired
	TrainerService ts;
	@PostMapping("/addUser")
	public String addUser(@RequestParam("firstName")String fname,
			@RequestParam("lastName")String lname,

			@RequestParam("email")String email,
			@RequestParam("password")String password,
			@RequestParam("role")String role,
			@RequestParam("mobile")String mobile) 
	{

		boolean userExists=us.checkEmail(email);
		if(userExists==false)
		{
			Users u=new Users();
			u.setFirstName(fname);
			u.setLastName(lname);
			u.setEmail(email);
			u.setPassword(password);
			u.setRoll(role);
			u.setMobile(mobile);
			String string=us.addUser(u);

			System.out.println(fname+lname+email+password+role);
			System.out.println(string);
			System.out.println("user registered successfully......!");
			return "redirect:/login";
		}
		else
		{
			System.out.println("user is already exist");
			return  "redirect:/register";
		}
	}

	@PostMapping("/validate")
	public String valiadate(@RequestParam("email") String email,
			@RequestParam("password") String password)
	{


		boolean v=us.validate(email,password);	
		if(v)
		{
			Users user=us.getUserByEmail(email);
			String role=user.getRoll();
			String s1="student";
			String s2="teacher";
			System.out.println(role);
			if(role.equals(s1))
			{
				System.out.println(" student login successfull");
				
				return "studentHome";
			}

			else if(role.equals(s2))
			{

				System.out.println(" trainer login successfull");
				return "trainerHome";
			}
			else
			{
				System.out.println(role);
				return "index";
			}


		}
		else
		{
			System.out.println("wrong credentials please enter valid one");
			return "login";
		}

	}
	
}




