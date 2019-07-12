/**
 * 
 */
package org.srinadh.controller;


import java.awt.PageAttributes.MediaType;
import java.util.List;
import java.util.Optional;

import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.srinadh.model.Student;
import org.srinadh.repository.StudentRepository;

/**
 * @author cheku
 *
 */

@RestController
public class StudentResource {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/student")
	@Produces("application/JSON")
	public List<Student> getAllStudents(Student stu){
		return studentRepository.findAll();
	}
	
	
	/*
	 * @GetMapping("/student/{id}") public Student getStudent(@PathVariable Long id)
	 * { Student student= studentRepository.findById(id); return null; }
	 */

}
