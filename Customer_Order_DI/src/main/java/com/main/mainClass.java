package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Customer;
import com.entity.Order;

public class mainClass {
    public static void main(String[] args) {
      
    	ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
    	Customer c = context.getBean("cust",Customer.class);
    	System.out.println(c);
    	}
}
