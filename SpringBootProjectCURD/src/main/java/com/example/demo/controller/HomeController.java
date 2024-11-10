package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Student;
import com.example.demo.service.HomeService;

@Controller
public class HomeController {
	
	@Autowired
	private HomeService homeService;

	@RequestMapping(value = "/")
	public String getIndexPage() {

		return "index";

	}

	@RequestMapping(value = "/log")
	public String getLoginData(@RequestParam String uname, @RequestParam String pass,Model model) {
		List<Student>slist=homeService.getLoginData(uname, pass);
		if (slist.size()> 0) {
			model.addAttribute("list", slist);
				
		return "details";
			}else {
				model.addAttribute("msg", "Invalid username and password");
				return "login";
			}
	}

	@RequestMapping(value = "/reg")
	public String getRegisterData(@ModelAttribute Student student,Model model) {
		System.out.println("Data Check : " + student);
		homeService.saveStudentData(student);
		model.addAttribute("stud",student);

		return "success";

	}
	
	@RequestMapping(value="/del")
	public String deleteStudent(@RequestParam int id) {
		System.out.println("Delete method called"+id);
		homeService.deleteStudent(id);
		return "success";
	}
	
	@RequestMapping(value="/edit")
	public String editData(@RequestParam int id,Model model) {
		
		Student student=homeService.editStudentData(id);
		
		System.out.println("Edit student : "+student);
		model.addAttribute("stud",student);
		return "edit";
		
	}
	@RequestMapping(value="/update")
	public String updateStudent(@ModelAttribute Student student) {
		System.out.println("Update method : "+student);
		
		homeService.updateStudentData(student);
		
		return "success";
		
		
	}
		
	
	

}
