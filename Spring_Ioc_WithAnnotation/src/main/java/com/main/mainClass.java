package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cofig.Myconfig;
import com.entity.Employee;

public class mainClass {
   public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(Myconfig.class);
	Employee e = context.getBean(Employee.class);
	System.out.println(e);
}
}
