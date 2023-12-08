package com.comp231.team6.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comp231.team6.models.Student;

public interface IStudentRepository extends JpaRepository<Integer, Student>{
	List<Student> findByStudentNumber(int studentnumber);
}
