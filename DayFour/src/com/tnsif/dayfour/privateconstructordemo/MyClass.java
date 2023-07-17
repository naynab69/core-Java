
//Singleton Class
package com.tnsif.dayfour.privateconstructordemo;

public class MyClass {
	
	private MyClass()
	{
	System.out.println("MyClass object is created");
	}
	private static MyClass obj=null;
	
	//factory method
	public static MyClass getObject()
	{
		if(obj==null) {
		 obj=new MyClass(); //Lazy Initialization
		}
		return obj;
	}
	

}
