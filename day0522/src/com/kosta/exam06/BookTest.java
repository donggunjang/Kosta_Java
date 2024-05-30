package com.kosta.exam06;

abstract class Book{
	public abstract int getLatefees(int days);
	public void Pro() {}
}

class Novel extends Book{
	@Override
	public int getLatefees(int days) {
		return days * 300;
	}
}

class Poet extends Book{
	@Override
	public int getLatefees(int days) {
		return days * 200;
	}
}

public class BookTest {
	public static void main(String[] args) {
		Book b1 = new Novel();
		Book b2 = new Poet();
		b1.Pro();
		b2.Pro();
		b1.getLatefees(1);
		b2.getLatefees(1);
	}
}
