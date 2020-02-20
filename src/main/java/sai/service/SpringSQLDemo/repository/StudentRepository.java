package sai.service.SpringSQLDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sai.service.SpringSQLDemo.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	Student findByRollNumber(Integer id);
	
}
