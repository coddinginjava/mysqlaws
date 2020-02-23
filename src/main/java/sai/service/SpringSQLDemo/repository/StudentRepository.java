package sai.service.SpringSQLDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sai.service.SpringSQLDemo.Entity.Student;

import java.time.OffsetDateTime;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	Student findByRollNumber(Integer id);

	List<Student> findAllByExpirationDateTimeGreaterThan(OffsetDateTime time);
}
