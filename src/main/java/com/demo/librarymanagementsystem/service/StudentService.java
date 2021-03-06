package com.demo.librarymanagementsystem.service;

import java.util.List;





import com.demo.librarymanagementsystem.entity.Author;
import com.demo.librarymanagementsystem.entity.Student;


public interface StudentService {

	public List<Student> findAllStudents();

	public Student findStudentById(Long id);

	public void createStudent(Student student);

	public void updateStudent(Student student);

	public void deleteStudent(Long id);

	

}
