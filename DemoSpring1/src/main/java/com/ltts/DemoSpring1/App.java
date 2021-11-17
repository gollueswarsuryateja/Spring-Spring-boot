package com.ltts.DemoSpring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
      Student s=(Student) context.getBean("std");
      System.out.println(s);
    }
}
