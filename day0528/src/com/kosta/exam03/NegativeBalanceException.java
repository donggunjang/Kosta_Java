package com.kosta.exam03;

class NegativeBalanceException extends Exception{
	public NegativeBalanceException(String message){
		super(message);
	}
}