package com.tnsif.dayseven.compiletimedemo;

public class OverloadingDemo {

	public static void main(String[] args) {
		
		//constructor overloading
		Point p1=new Point();
		System.out.println(p1);
		
		Point p2=new Point(2.0f);
		System.out.println(p2);
		
		Point p3=new Point(4,6);
		System.out.println(p3);
		
		
		//method overloading
		MethodOverloading m=new MethodOverloading();
		System.out.println(m.addition(12, 14));
		m.addition(12.7f,78.50f);
		m.addition(34, 89);
		m.addition(45.8f, 67, 12);

	}

}
