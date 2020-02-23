package sai.service.SpringSQLDemo.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.OffsetDateTime;

@NoArgsConstructor
@Data
@Entity
@Table(name = "student_db")
public class Student{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer rollNumber;
	private  String name;
	private String phoneNumber;
	private String email;
	private OffsetDateTime createdDateTime;
	private OffsetDateTime expirationDateTime;
	
	public Student(Integer rollNumber, String name, String phoneNumber, String email,OffsetDateTime expirationDateTime) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.createdDateTime = OffsetDateTime.now();
		this.expirationDateTime = expirationDateTime;
	}

}
