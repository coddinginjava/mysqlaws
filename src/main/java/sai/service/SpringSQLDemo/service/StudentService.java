package sai.service.SpringSQLDemo.service;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import sai.service.SpringSQLDemo.Entity.Student;
import sai.service.SpringSQLDemo.repository.StudentRepository;

@Service
@AllArgsConstructor
public class StudentService {

	private final StudentRepository repository;
	
	public Student getSudentByRollNo(Integer id) {
		return repository.findByRollNumber(id);
	}

}
