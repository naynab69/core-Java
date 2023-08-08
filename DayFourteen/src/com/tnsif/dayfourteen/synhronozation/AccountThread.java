//Program to demonstrate Thread Synchronization - Account Thread Class
package com.tnsif.dayfourteen.synhronozation;

public class AccountThread extends Thread {
	private Account acc;
	private int amt;

	// constructor
	public AccountThread(Account acc, int amt) {
		this.acc = acc;
		this.amt = amt;
		start();
	}

	@Override
	public void run() {
		try {
			acc.withdraw(amt);
		} catch (InsufficientBalanceException e) {
			System.err.println(e.getMessage());
		}
	}
}
