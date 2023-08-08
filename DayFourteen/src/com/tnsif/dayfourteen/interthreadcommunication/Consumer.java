//Program to demonstrate InterThread Communication - Consumer Thread Class
package com.tnsif.dayfourteen.interthreadcommunication;

public class Consumer extends Thread {
	Queue obj; 

	public Consumer(Queue obj) {
		this.obj = obj;
		start();
	}

	public void run() {
			while (true) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				System.out.println(e);
			}
			obj.get();
		}
	}
}
