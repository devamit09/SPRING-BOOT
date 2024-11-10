package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/")
	public String indexPage() {
		return "index";

	}

	@RequestMapping(value = "/log")
	public String getLoginData(@RequestParam String uname, @RequestParam String pass, Model model) {
		List<Employee> slist = employeeService.getAllEmployee(uname, pass);
		if (slist.size() > 0) {
			model.addAttribute("list", slist);

			return "details";
		} else {
			model.addAttribute("msg", "Invalid username and password");
			return "login";
		}
	}

	@RequestMapping(value = "/reg")
	public String getRegisterData(@ModelAttribute Employee e, Model model) {
		System.out.println("Employee Data : " + e);
		employeeService.saveEmployeeData(e);
		model.addAttribute("emp",e);
		return "success";

	}

	@RequestMapping(value = "/del")
	public String deleteEmployee(@RequestParam int id) {
		System.out.println("Delete method called" + id);
		employeeService.deleteEmployee(id);
		
		return "success";
	}

	@RequestMapping(value = "/edit")
	public String editData(@RequestParam int id, Model model) {

		Employee e = employeeService.editEmployeeData(id);

		System.out.println("Edit employee : " + e);
		model.addAttribute("emp", e);
		return "edit";

	}

	@RequestMapping(value = "/update")
	public String updateEmployee(@ModelAttribute Employee e) {
		System.out.println("Update method : " + e);

		employeeService.updateEmployeeData(e);
		

		return "success";
	}

}
