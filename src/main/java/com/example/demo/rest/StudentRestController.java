package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("api")
public class StudentRestController {

	@Autowired
	StudentService service;
	
	@GetMapping("/students")
	public List<Student> getAll() {
		
		return service.findAll();
	}
	
	
}
