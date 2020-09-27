package com.howtodoinjava.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.model.Employee;

import net.minidev.json.JSONArray;

@RestController
public class EmployeeController {
	
	//@RequestMapping("/http://localhost:9096/getRewardPoints?entiyID=1111110")
	@RequestMapping(value = "/getRewardPoints", method = RequestMethod.GET)
    public Employee getRewardPoints1(String entiyID) 
    {
		System.out.println("Calling getRewardPoints");
		
				Employee employee = new Employee();
				
				employee.setId(1);
		
		return employee;
    }

}
