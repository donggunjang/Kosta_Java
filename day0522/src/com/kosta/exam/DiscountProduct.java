package com.kosta.exam;

public class DiscountProduct extends Product {
	private double discount;

	public DiscountProduct(String name, int price, double discount) {
		super(name, price);
		this.discount = discount;
	}
	public DiscountProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "DiscountProduct [discount=" + discount + ", name=" + name + ", price=" + price + "]";
	}
	public int getPrice() {
		return price - (int)(price * discount);
	}
	
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
}
