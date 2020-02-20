package sai.service.SpringSQLDemo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

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
	
	public Student(Integer rollNumber, String name, String phoneNumber, String email) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

}
