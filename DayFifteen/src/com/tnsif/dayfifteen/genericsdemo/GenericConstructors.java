//Program to demonstrate generic constructors
package com.tnsif.dayfifteen.genericsdemo;

public class GenericConstructors {
private double v;

//Generic Constructors
public <T extends Number  >GenericConstructors(T t)
{
	//v=(double) t;
	v=t.doubleValue();
}

void show()
{
	System.out.println("Value of v in double type is: "+v);
}


public static void main(String[] args) {
	  System.out.println("Number to Double Conversion:");
	  GenericConstructors obj=new GenericConstructors(10);
	  obj.show();
	  
	  GenericConstructors obj1=new GenericConstructors(136.8F);
	  obj1.show();
	  
		/*
		 * GenericConstructors obj2=new GenericConstructors('A'); obj1.show();
		 * 
		 * GenericConstructors obj3=new GenericConstructors(true); obj1.show();
		 */
	}
}