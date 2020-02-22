package sai.service.SpringSQLDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import sai.service.SpringSQLDemo.Entity.Student;
import sai.service.SpringSQLDemo.service.StudentService;

@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class StudentController {
	
	private final StudentService studentService; 
	
	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable Integer id) {
		return studentService.getSudentByRollNo(id);
	}

}
