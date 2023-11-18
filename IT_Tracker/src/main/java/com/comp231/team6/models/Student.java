package com.comp231.team6.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@Column(name = "studentnumber")
	private String studentNumber;

	@Column(name = "password")
	private String password;

	@NotBlank
	@Column(name = "firstname")
	private String firstName;

	@NotBlank
	@Column(name = "lastname")
	private String lastName;

	@NotBlank
	@Column(name = "program")
	private Program program;

	public Student(String firstName, String lastName, String studentNumber, Program program) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentNumber = studentNumber;
		this.program = program;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Program getProgram() {
		return program;
	}

	public void setProgram(Program program) {
		this.program = program;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
