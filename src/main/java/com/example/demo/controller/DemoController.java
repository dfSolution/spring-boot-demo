package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/home")
public class DemoController {

	@Autowired
	StudentService service;

	@RequestMapping("/home")
	public String getHome() {
		return "home";
	}

	@GetMapping("/authenticateTheUser")
	public String showHome(Model model) {

		service.findAll();

		return "list-students";
	}

	@GetMapping("/save")
	public String showFormStudent(Model model) {

		Student student = new Student();
		
		model.addAttribute("student1", student);

		return "showSaveForm";
	}

	@PostMapping("/save")
	public String addStudent(Model model, Student student) {

		service.save(student);
		
		model.addAttribute("student1", student);
		
		return "redirect:/";

	}

}
