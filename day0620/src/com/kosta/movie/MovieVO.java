package com.kosta.movie;

import javax.swing.JFrame;

public class MovieVO{
	private String theaterName;
    private int count;
    private int pricesum;
	public MovieVO(String theaterName, int count, int pricesum) {
		super();
		this.theaterName = theaterName;
		this.count = count;
		this.pricesum = pricesum;
	}
	public MovieVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPricesum() {
		return pricesum;
	}
	public void setPricesum(int pricesum) {
		this.pricesum = pricesum;
	}
	
    
	
}