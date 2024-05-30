package com.kosta.exam03;

import com.kosta.exam02.A;

public class B extends A {
	private String data;
	
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}


	public void info() {
		System.out.println(title+","+year+","+data);
	}
}
