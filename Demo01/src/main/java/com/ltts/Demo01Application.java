package com.ltts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ltts.entity.Student;
import com.ltts.repository.StudentRepository;

@SpringBootApplication
public class Demo01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Demo01Application.class, args);
		StudentRepository repo=context.getBean(StudentRepository.class);
		Student s=new Student();
		s.setStdid(101);
		s.setStdname("Eswar");
		s.setStdaddress("Vizag.....");
		repo.save(s);
		
	}

}
