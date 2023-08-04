package com.tnsif.dayeleven.uncheckeddemo;

public class TryCatchExample {

	static void divide(int x, int y)
	{
		System.out.println("I am in divide method");
		int z;
		try {
		z=x/y;
		
		System.out.println("result is z: "+z);
		System.exit(0);
		}
		catch(ArithmeticException ae)
		{
			System.err.println("I am in catch block"+ae.getMessage());
			
		}
		
		finally
		{
			System.out.println("Bye Bye");
		}
			}

}
