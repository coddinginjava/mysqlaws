package sai.service.SpringSQLDemo.loadData;

import java.util.ArrayList;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import sai.service.SpringSQLDemo.Entity.Student;
import sai.service.SpringSQLDemo.repository.StudentRepository;

@Service
@AllArgsConstructor
public class InitdataLoad {
	private final StudentRepository repository;

	@EventListener(ApplicationReadyEvent.class)
	public void loadDataInSQL() {
		var studentList = new ArrayList<Student>();
		studentList.add(new Student(681147, "sai", "714512", "sai@email.com"));
		studentList.add(new Student(681137, "keerthi", "123231", "keerthi@email.com"));
		studentList.add(new Student(681157, "sri", "890345", "srikonga@email.com"));
		studentList.add(new Student(681167, "resh", "45623", "reshu@email.com"));
		studentList.add(new Student(681177, "tony", "714512", "iron@email.com"));
		studentList.add(new Student(681127, "jack", "714512", "jacksparrow@email.com"));
		
		
		repository.saveAll(studentList);
		
		System.out.println("Data as been put into the MySQL DB");
	}
}
