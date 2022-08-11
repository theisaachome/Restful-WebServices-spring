package com.pbc.student;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentService {

	
	private final StudentRepo studentRepo;
	
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}
}
