package com.tnsif.dayeight.interfacedemo;

public interface Bank {
	final static float MINBAL = 5000;
	final static float DEPOSIT_LIMIT = 25000;

	public void deposit(float amount);

	public void withdraw(float amount);

}
