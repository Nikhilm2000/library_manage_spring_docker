package com.demo.librarymanagementsystem.service.impl;

import java.util.List;




import org.springframework.stereotype.Service;


import com.demo.librarymanagementsystem.entity.Author;
import com.demo.librarymanagementsystem.entity.Student;
import com.demo.librarymanagementsystem.exception.NotFoundException;

import com.demo.librarymanagementsystem.service.AuthorService;
import com.demo.librarymanagementsystem.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService {

	@Override
	public List<Student> findAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findStudentById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(Long id) {
		// TODO Auto-generated method stub
		
	}

	

}
