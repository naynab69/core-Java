package com.tnsif.daysix.finalvariabledemo;

public class FinalVariable {
	//declare variable
	//final int x; //final variable must be initialized
	
	final int x=34;
	
	//declare static and final variable
	final static int y;
	
	//declare static and final variable
	final static int z=100;
	
	//instance method
	public void change()
	{
		//x=30;
		//y=20;
		z=23;
	}
	
	//declare static block
	static
	{
		//x=34; //non static not allowed
		y=50;
		z=60;
	}

}
