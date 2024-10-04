package org.jsp.employee_crud.controller;

import org.jsp.employee_crud.dto.Employee;
import org.jsp.employee_crud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeRepository repository;

	@GetMapping("/")
	public String loadHome() {
		return "home.html";
	}

	@GetMapping("/add-employee")
	public String addEmployee() {
		return "add-employee.html";
	}
	
	@PostMapping("/add-employee")
	public String addEmployee(Employee employee,ModelMap map) {
		repository.save(employee);
		map.put("success", "Employee Record Added Success");
		return "redirect:/";
	}
}
