package com.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("1")
	private int e_id;
	@Value("abhi")
	private String name;
	@Value("40000")
	private int salary;

	public Employee() {

	}

	public Employee(int e_id, String name, int salary) {
		super();
		this.e_id = e_id;
		this.name = name;
		this.salary = salary;
	}

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", name=" + name + ", salary=" + salary + "]";
	}

}
