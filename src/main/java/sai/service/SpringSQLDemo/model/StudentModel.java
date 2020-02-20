package sai.service.SpringSQLDemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentModel {
	private Integer rollNumber;
	private String name;
	private String phoneNumber;
	private String email;

}
