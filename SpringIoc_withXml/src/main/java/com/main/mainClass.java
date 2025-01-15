package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Student;

public class mainClass {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		Student s = context.getBean("std", Student.class);
		System.out.println(s);
		
//		s.setId(1);
//		s.setName("harsh");
//		s.setAge(22);
//		s.setCity("satara");
//		System.out.println(s);

//		Student s1 = new Student();
//		s1.setId(2);
//		s1.setName("mahesh");
//	    s1.setAge(22);
//	    s1.setCity("nagar");
//	    
//	    System.out.println(s1);
	}
}
