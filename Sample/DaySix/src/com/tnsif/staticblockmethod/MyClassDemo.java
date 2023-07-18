//Program to demonstrate static method
package com.tnsif.staticblockmethod;

public class MyClassDemo {

	public static void main(String[] args) {

		MyClass o1 = new MyClass();
		System.out.println(o1);

		// static method with class name
		MyClass.display();

		MyClass o2 = new MyClass();
		System.out.println(o2);
		MyClass.display();
		MyClass o3 = new MyClass();
		System.out.println(o3);
		MyClass.display();

	}

}
