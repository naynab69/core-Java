package com.tnsif.dayeight.abstractclassdemo;

//abstract class
public abstract class Shape {
	protected float area;

	//abstract method
	public abstract void calArea();
	
	//solid method
	public void show()
	{
		System.out.println("Area of the shape is "+area);
	}

}
