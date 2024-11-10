package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping(value="/")
	public String getIndexPage() {
		
		return "index";
	}
	
	@RequestMapping(value="/log")
	public String getLoginData(@RequestParam String uname,@RequestParam String pass) {
		System.out.println("login Credentials : "+uname+" "+pass);
		
		return "success";
		
	}
	

}
