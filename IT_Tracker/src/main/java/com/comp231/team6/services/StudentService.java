package com.comp231.team6.services;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.comp231.team6.interfaces.IStudentRepository;
import com.comp231.team6.models.Student;

public class StudentService {

	@Autowired
	private IStudentRepository studentRepository;
	
	
}
