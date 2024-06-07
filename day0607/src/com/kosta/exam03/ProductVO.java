package com.kosta.exam03;

public class ProductVO {
	private int no;
	private String item;
	private int qty;
	private int price;
	
	//매개변수를 갖는 생성자
	public ProductVO(int no, String item, int qty, int price) {
		super();
		this.no = no;
		this.item = item;
		this.qty = qty;
		this.price = price;
	}
	//매개변수를 갖지 않는 기본 생성자
	public ProductVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//toString
	@Override
	public String toString() {
		return "ProductVO [no=" + no + ", item=" + item + ", qty=" + qty + ", price=" + price + "]";
	}
	
	//Setter Getter
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
