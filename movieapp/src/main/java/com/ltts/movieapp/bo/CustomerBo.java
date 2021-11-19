package com.ltts.movieapp.bo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.ltts.movieapp.model.Customer;
@Repository  //it is an annotation
@EnableJpaRepositories
public interface CustomerBo extends JpaRepository<Customer,String> {

}
