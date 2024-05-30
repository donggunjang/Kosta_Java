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
		//아무리 상속받은 자식클래스라 해도
		//부모클래스의 private 영역에는 접근할 수 없다.
		//만약에 외부의 다른클래스에서 저근하려면 
	}
}
