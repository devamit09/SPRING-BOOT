package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.springboot.entity.Student;
import com.example.springboot.service.HomeServices;

@Controller
public class HomeController {

	@Autowired
	private HomeServices homeServices;

	@RequestMapping(value = "/")
	public String getIndexPage() {

		return "index";

	}

	@RequestMapping(value = "/log")
	public String getLoginData(@RequestParam String uname, @RequestParam String pass,Model model) {
		List<Student>slist=homeServices.getLoginData(uname, pass);
		if (slist.size()> 0) {
			model.addAttribute("list", slist);
				
			
//		System.out.println("login credentials: " + uname + " " + pass);
		return "success";
			}else {
				model.addAttribute("msg", "Invalid username and password");
				return "index";
			}
	}

	@RequestMapping(value = "/reg")
	public String getRegisterData(@ModelAttribute Student student,Model model) {
		System.out.println("Data Check : " + student);
		homeServices.saveStudentData(student);
		model.addAttribute("stud",student);

		return "success";

	}

}
