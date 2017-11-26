package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.GitDemoService;

@RestController
public class GitDemoController {
	
	@Autowired
	GitDemoService gitService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String sayHello() {
		for(int i=0;i<10;i++) {
			System.out.println("i " + i);
		}
		System.out.println("123");
		String str = "Sun is shining";
		return str; 
	}
	
	@RequestMapping(value="/getRecords", method=RequestMethod.GET)
	public String getEmployees() {
		return gitService.getRecords();
	}
	
	

}
