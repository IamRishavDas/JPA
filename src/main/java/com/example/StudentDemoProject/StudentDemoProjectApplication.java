package com.example.StudentDemoProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.StudentDemoProject.model.Student;
import com.example.StudentDemoProject.repository.StudentRepository;

@SpringBootApplication
public class StudentDemoProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(StudentDemoProjectApplication.class, args);

		Student student1 = context.getBean(Student.class);
		Student student2 = context.getBean(Student.class);
		Student student3 = context.getBean(Student.class);

		student1 = new Student(1, "a", 100);
		student2 = new Student(2, "b", 200);
		student3 = new Student(3, "c", 300);

		StudentRepository studentRepository = context.getBean(StudentRepository.class);
		studentRepository.save(student1);
		studentRepository.save(student2);
		studentRepository.save(student3);

		
	}

}
