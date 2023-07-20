package com.tnsif.daysix.staticblock;

public class MyClass {
	
	private int section;  //non static
	private static int srNo; //static
	
	//static block
	static {
		System.out.println("in Static block");
		//section=12; can not use non static member
		srNo=100;
	}

	//default constructor
	public MyClass() {
		System.out.println("Default constructor");
		srNo++;
		section++;
	}

	@Override
	public String toString() {
		return "MyClass [section=" + section + ",srNo=" + srNo + "]";
	}
	
	//static method
	static void display()
	{
		System.out.println(srNo);
		//System.out.println(section);

	}
	
	//non static method
		public void print()
		{
			System.out.println(srNo);
			System.out.println(section);

		}
	
	
	
	

}
