package sai.service.SpringSQLDemo.loadData;

import lombok.AllArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import sai.service.SpringSQLDemo.Entity.Student;
import sai.service.SpringSQLDemo.repository.StudentRepository;

import java.time.OffsetDateTime;
import java.util.ArrayList;

@Service
@AllArgsConstructor
public class InitdataLoad {
	private final StudentRepository repository;

	@EventListener(ApplicationReadyEvent.class)
	public void loadDataInSQL() {
		var studentList = new ArrayList<Student>();
		studentList.add(new Student(681147, "sai", "714512", "sai@email.com", OffsetDateTime.now().plusDays(5)));
		studentList.add(new Student(681137, "keerthi", "123231", "keerthi@email.com",OffsetDateTime.now().minusDays(5)));
		studentList.add(new Student(681157, "sri", "890345", "srikonga@email.com",OffsetDateTime.now().plusDays(5)));
		studentList.add(new Student(681167, "resh", "45623", "reshu@email.com",OffsetDateTime.now().plusDays(5)));
		studentList.add(new Student(681177, "tony", "714512", "iron@email.com",OffsetDateTime.now().plusDays(5)));
		studentList.add(new Student(681127, "jack", "714512", "jacksparrow@email.com",OffsetDateTime.now().minusDays(5)));
		
		
		repository.saveAll(studentList);
		
		System.out.println("Data as been put into the MySQL DB");
	}
}
