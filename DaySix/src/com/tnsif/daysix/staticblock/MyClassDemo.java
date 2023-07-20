package com.tnsif.daysix.staticblock;

public class MyClassDemo {

	public static void main(String[] args) {
		MyClass c1=new MyClass();
		System.out.println(c1);
		
		MyClass c2=new MyClass();
		System.out.println(c2);
		
		MyClass.display();
		c2.print();
		
		


	}

}
