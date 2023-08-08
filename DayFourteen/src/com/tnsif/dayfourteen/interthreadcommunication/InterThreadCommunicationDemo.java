//Program to demonstrate interthread communication
package com.tnsif.dayfourteen.interthreadcommunication;

public class InterThreadCommunicationDemo {
	public static void main(String[] args) {
		
		//Shared Resource
		Queue obj=new Queue();
		
		Producer p1=new Producer(obj); //Producer thread
		Consumer c1=new Consumer(obj); //Consumer thread
					
		try {
			p1.join();
			c1.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}






