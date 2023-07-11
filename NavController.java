package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController
{
@GetMapping("/")
public String index()
{
	return "index";
}
	
@GetMapping("/register")
public String register()
{
	return "register";
}
	
@GetMapping("/login")
public String login()
{
	return "login";
}
	
@GetMapping("/index")
public String index1()
{
	return "index";
}


@GetMapping("/createcourse")
public String createcourse()
{
	return "createcourse";
}

@GetMapping("/addlesson")
public String addlesson()
{
	return "addlesson";
}
@GetMapping("/trainerHome")
public String trainerHome()
{
	return "trainerHome";
}

@GetMapping("/studentHome")
public String studentHome()
{
	return "studentHome";
}
@GetMapping("/buycourse")
public String buyCourse()
{
	return "buycourse";
}

@GetMapping("/mycourse")
public String myCourse()
{
	return "mycourse";
}
@GetMapping("/demolesson")
public String demolesson()
{
	return "demolesson";
}
@GetMapping("/mylesson")
public String mylesson()
{
	return "mylesson";
}


}
