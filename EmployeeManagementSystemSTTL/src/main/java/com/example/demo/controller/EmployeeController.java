package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.PersonalRepository;
import com.example.demo.repository.QualificationRepository;

@RestController
public class EmployeeController {
	@Autowired
    private PersonalRepository personalRepository;

    @Autowired
    private QualificationRepository qualificationRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employeeList")
    public String getEmployeeList(Model model) {
        List<Employee> employees = employeeRepository.findAll();
        model.addAttribute("employees", employees);
        return "employeeList";
    }

}
