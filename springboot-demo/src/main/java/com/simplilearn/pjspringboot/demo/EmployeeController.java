package com.simplilearn.pjspringboot.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@RequestMapping("/get")
	public String getName() {
		//return "hello t, I am well...";
		Employee e = new Employee("Abhijit", 30);
		return e.toString();
	}
	
}
