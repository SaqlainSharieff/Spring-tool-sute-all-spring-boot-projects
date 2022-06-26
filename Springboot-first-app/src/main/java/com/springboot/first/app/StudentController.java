package com.springboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Sharuk", "Khan");
	}
	
	@GetMapping("/students")
		public List<Student> getStudents(){
			List<Student> students = new ArrayList<>();
			students.add(new Student("Salman", "Khan"));
			students.add(new Student("Salman1", "Khan"));
			students.add(new Student("Salman2", "Khan"));
			students.add(new Student("Salman3", "Khan"));
			students.add(new Student("Salman4", "Khan"));
			students.add(new Student("Salman5", "Khan"));
			students.add(new Student("Salman6", "Khan"));
			return students;
		}
	}
	


