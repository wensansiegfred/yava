package com.wensan.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wensan.app.models.Student;
import com.wensan.app.services.StudentService;
import com.wensan.app.utils.JSONResponse;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public JSONResponse addStudent(@ModelAttribute("student") Student student, Errors errors) {
		if (errors.hasErrors()) {
			return new JSONResponse(HttpStatus.BAD_REQUEST, errors.getFieldError().getDefaultMessage(), null);
		} else {
			studentService.saveStudent(student);
			return new JSONResponse(HttpStatus.OK, "Add Student Success", null);
		}
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public JSONResponse getAllStudent() {
		List<Student> students = studentService.getAllStudent();
		return new JSONResponse(HttpStatus.OK, "All Students", students);
	}
}
