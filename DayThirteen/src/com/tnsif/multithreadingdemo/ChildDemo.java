package com.tnsif.multithreadingdemo;

public class ChildDemo {

	public static void main(String[] args) {
		ChildThread t1=new ChildThread(10,"Hello");
		ChildThread t2=new ChildThread(5,"Hi");
		
		t1.start();
		t2.start();
		
		System.out.println("End of the program");
		

	}

}
