package com.tnsif.dayfour.firstpackage;

public class Base {
	
	//declare all types of data members
	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	//declare methods of different types
	
	void methodDefault()
	{
		System.out.println("Default method");
		System.out.println("varDefault "+varDefault);
	}

	public void methodPublic()
	{
		System.out.println("Public method");
		System.out.println("varPublic "+varPublic);
	}
	private void methodPrivate()
	{
		System.out.println("Private method");
		System.out.println("varPrivate "+varPrivate);
	}
	protected void methodProtected()
	{
		System.out.println("Protected method");
		System.out.println("varProtected "+varProtected);
	}
	
	public void access()
	{
		
		varProtected=12;
		methodProtected();
		varPrivate=45;
		methodPrivate();
		
	}
	
	public static void main(String[] args) {
		Base b=new Base();
		b.methodDefault();
		b.methodPrivate();
		b.methodProtected();
		b.methodPublic();
	}
}
