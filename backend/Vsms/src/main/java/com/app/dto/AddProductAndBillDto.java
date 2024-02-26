package com.app.dto;

import java.util.Arrays;

public class AddProductAndBillDto {
	private String [] products;
	private double billAmount;
	public AddProductAndBillDto() {
		// TODO Auto-generated constructor stub
	}
	public String[] getProducts() {
		return products;
	}
	public void setProducts(String[] products) {
		this.products = products;
	}
	
	
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	@Override
	public String toString() {
		return "AddProductArrayDto [products=" + Arrays.toString(products) + "]";
	}
	
	
	
}
