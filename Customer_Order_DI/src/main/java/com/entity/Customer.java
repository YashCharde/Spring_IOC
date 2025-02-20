package com.entity;

public class Customer {
	private String customerId;
	private String name;
	private String email;

	private Order order;

	public Customer() {

	}

	public Customer(String customerId, String name, String email, Order order) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.email = email;
		this.order = order;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", email=" + email + ", order=" + order + "]";
	}

}
