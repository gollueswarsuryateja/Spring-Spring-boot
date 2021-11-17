package com.ltts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ltts.entity.Student;

@SpringBootApplication
public class DemoSpringBoot1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DemoSpringBoot1Application.class, args);
		Student s=context.getBean(Student.class);
		s.setStdid(101);
		s.setStdname("Eswar Surya Teja....@");
		s.setStdaddress("vizag");
		System.out.println(s);
		
	}

}
