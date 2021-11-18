package com.ltts.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltts.entity.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> {
	

}
