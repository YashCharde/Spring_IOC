package com.entity;

public class Order {
	private int orderId;
	private String product;
	private int quantity;

	public Order() {

	}

	public Order(int orderId, String product, int quantity) {
		super();
		this.orderId = orderId;
		this.product = product;
		this.quantity = quantity;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", product=" + product + ", quantity=" + quantity + "]";
	}

}
