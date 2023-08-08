//Program to demonstrate Bank interface
package com.tnsif.dayfourteen.synhronozation;

public interface Bank {
	static final int MINBAL=5000;
	static final int DAILY_LIMIT=25000;
	void deposit(int amt) throws DepositLimitExceedsException;
	void withdraw(int amt)throws InsufficientBalanceException;
}
