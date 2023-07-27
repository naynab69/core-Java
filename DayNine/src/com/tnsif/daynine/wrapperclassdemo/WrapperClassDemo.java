package com.tnsif.daynine.wrapperclassdemo;

public class WrapperClassDemo {

	public static void main(String[] args) {
		//unboxing
		Integer i=new Integer(10);
		System.out.println(i);
		int b=i.intValue();
		System.out.println(b);
		
		
		//without using intValue()
		int c=i;
		System.out.println(c);
		
		//Autoboxing
		int a=100;
		Integer a1=a;
		System.out.println(a1);
		

	}

}
