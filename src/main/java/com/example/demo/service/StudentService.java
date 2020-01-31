package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {
	
	public List<Student> findAll();
	
	public Student findById(int id);
	
	public void save (Student student);
	
	public void deleteById(int id);

}
