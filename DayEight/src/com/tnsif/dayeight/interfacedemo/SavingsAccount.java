//to demonstrate interface and multiple inheritance
package com.tnsif.dayeight.interfacedemo;

public class SavingsAccount extends Customer implements Bank {
	private int accNo;
	private float balance;

	// constructor
	public SavingsAccount(String name, String city, int accNo, float balance) {
		super(name, city);
		this.accNo = accNo;
		this.balance = balance;
	}

	
	//getters and setters
	public int getAccNo() {
		return accNo;
	}



	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}



	public float getBalance() {
		return balance;
	}



	public void setBalance(float balance) {
		this.balance = balance;
	}

//implement Bank methods
	@Override
	public void deposit(float amount) {
		if(amount< 0 && amount>DEPOSIT_LIMIT)
		{
			System.out.println("Please deposit valid amount");
		}
		else
		{
			balance+=amount;
			System.out.println("Rs."+amount+"is deposited successfully");
		}

	}

	@Override
	public void withdraw(float amount) {
		if (amount<=balance-MINBAL)
		{
			balance-=amount;
			System.out.println("Rs."+amount+"withdrawal is successful");
		}
		else
		{
			System.out.println("Insufficient balance");
		}

	}


	@Override
	public String toString() {
		return "SavingsAccount [accNo=" + accNo + ", balance=" + balance + ", getName()=" + getName() + ", getCity()="
				+ getCity() + "]";
	}
	
	

}
