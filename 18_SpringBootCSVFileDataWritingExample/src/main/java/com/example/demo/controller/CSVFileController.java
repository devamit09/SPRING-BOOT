package com.example.demo.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import com.example.demo.model.Employee;

@RestController
public class CSVFileController {
	
	@GetMapping(value="/export")
	public void exportDatainCSVFile(HttpServletResponse response) throws IOException {
		
		response.setContentType("text/csv");
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd_hh-mm-ss");
		String date=dateFormat.format(new Date());
		
		response.setHeader("Content-Disposition", "attachment; filename=employee_"+date+".csv");
		
		Employee employee=new Employee();
		employee.setId(1);
		employee.setName("Amit");
		employee.setAddress("BBSR");
		employee.setDesignation("Developer");
		employee.setUname("admin");
		employee.setPass("admin");
		employee.setSalary(30000);
		
		
		Employee employee1=new Employee();
		employee1.setId(1);
		employee1.setName("Ankit");
		employee1.setAddress("BGH");
		employee1.setDesignation("Tester");
		employee1.setUname("admin1");
		employee1.setPass("admin2");
		employee1.setSalary(35000);
		
		
		Employee employee2=new Employee();
		employee2.setId(1);
		employee2.setName("Pritam");
		employee2.setAddress("SBP");
		employee2.setDesignation("QA");
		employee2.setUname("admin2");
		employee2.setPass("admin2");
		employee2.setSalary(32000);
		
		Employee employee3=new Employee();
		employee3.setId(1);
		employee3.setName("Sritam");
		employee3.setAddress("CTC");
		employee3.setDesignation("SupportEngg");
		employee3.setUname("admin3");
		employee3.setPass("admin3");
		employee3.setSalary(25000);
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(employee);
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		
		ICsvBeanWriter csvWriter=new CsvBeanWriter(response.getWriter(), CsvPreference.STANDARD_PREFERENCE);
		String[] csvHeader= {"Employee ID","NAME","ADDRESS","UNAME","PASS","DESIGNATION","SALARY"};
		String[] csvnameMapping= {"id","name","address","uname","pass","designation","salary"};
		
		csvWriter.writeHeader(csvHeader);
		
		for(Employee emp : list) {
			
			csvWriter.write(emp, csvnameMapping);
			
		}
		csvWriter.close();
		
	}
	
	

}
