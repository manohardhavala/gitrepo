package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.GitDemoDao;

@Service
public class GitDemoService {
	
	@Autowired
	GitDemoDao dao;

	public String getRecords() {
		// TODO Auto-generated method stub
		return dao.getRecords();
	}

}
