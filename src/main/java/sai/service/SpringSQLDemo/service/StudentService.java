package sai.service.SpringSQLDemo.service;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import sai.service.SpringSQLDemo.Entity.Student;
import sai.service.SpringSQLDemo.repository.StudentRepository;

import java.time.OffsetDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {

	private final StudentRepository repository;
	
	public Student getSudentByRollNo(Integer id) {
		return repository.findByRollNumber(id);
	}

	public List<Student> getAllNoExpiredList() {
		return repository.findAllByExpirationDateTimeGreaterThan(OffsetDateTime.now());
	}
}
