package com.wensan.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wensan.app.models.Student;
import com.wensan.app.repository.StudentRepository;

@Service("studentService")
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Transactional
	public List<Student> getAllStudent() {
		return studentRepository.getAllStudent();
	}

	@Transactional
	public Student getStudentById(Long id) {
		return studentRepository.getOneById(id);
	}

	@Transactional
	public void saveStudent(Student student) {
		studentRepository.save(student);
	}
}
