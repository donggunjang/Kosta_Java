package com.kosta.exam02;

class NegativeBalanceException extends Exception{
	public NegativeBalanceException(String message){
		super(message);
	}
}