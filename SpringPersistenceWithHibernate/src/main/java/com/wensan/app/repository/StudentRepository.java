package com.wensan.app.repository;

import java.util.List;

import com.wensan.app.models.Student;

public interface StudentRepository {
	List<Student> getAllStudent();
	Student getOneById(Long id);
	void save(Student student);
	void delete(Student student);
}
