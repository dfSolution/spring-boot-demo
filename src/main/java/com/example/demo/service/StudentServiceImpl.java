package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository repo;
	
	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Student findById(int id) {
		
		Optional<Student> result = repo.findById(id);
		
		Student tempStudent = null;
		
		if(result.isPresent()) {
			tempStudent = result.get();
		} else {
			throw new RuntimeException();
		}
		return tempStudent;
	}

	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}
	public Student findOne(int id) {
		
		return findOne(id);
	}

}
