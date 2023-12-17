package com.comp231.team6.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comp231.team6.models.Student;
import com.comp231.team6.models.Ticket;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findByStudentNumber(int studentNumber);

}
