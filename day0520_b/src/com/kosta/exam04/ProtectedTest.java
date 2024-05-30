package com.kosta.exam04;

import com.kosta.exam03.B;

public class ProtectedTest {

	public static void main(String[] args) {
		B ob = new B();
		ob.setTitle("hello");
		ob.setYear(24);
		ob.setData("java");
		ob.info();
	}

}
