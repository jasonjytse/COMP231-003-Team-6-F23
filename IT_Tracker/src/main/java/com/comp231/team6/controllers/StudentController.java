package com.comp231.team6.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.comp231.team6.models.Student;
import com.comp231.team6.repository.StudentRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author Jason Tse
 */
@Controller("/")
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;


	@RequestMapping()
	public String login() {
		return "login";
	}

	@PostMapping()
	public String login(@RequestParam	int studentNumber,
						@RequestParam	String password) {

		List<Student> students = studentRepository.findByStudentNumber(studentNumber);

		for (Student student : students) {
			if (student.getPassword().equals(password)) {
				return "redirect:/ticket/view";
			}
		}
		return "redirect:/login";
	}

	@RequestMapping("signup")
	public String getSignup() {
		return "signup";
	}

	@PostMapping("signup")
	public String signup (@RequestParam String firstName,
						  @RequestParam String lastName,
						  @RequestParam int studentNumber,
						  @RequestParam String password) {

		Student student = new Student(firstName, lastName, studentNumber, password);
		studentRepository.save(student);
		return "login";
	}



}
