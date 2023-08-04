package com.tnsif.dayeleven.mutilecatchdemo;

import java.util.Scanner;
public class Division {
	
	public static void divide()
	{
		int a,b,c;
		int [ ] arr= {13,78};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers ");
		try
		{a=sc.nextInt();
		b=sc.nextInt();
		
		c=a/b;
		System.out.println("C= "+c);
		System.out.println(arr[c]);
		}
		catch(ArithmeticException |ArrayIndexOutOfBoundsException ae)
		{
			System.err.println("I am in catch block"+ae.getMessage());
		}
		/*
		 * catch(ArrayIndexOutOfBoundsException ae) {
		 * System.err.println("Error occured..."+ae.getMessage()); }
		 */
		
		finally
		{
			System.out.println("Bye");
			sc.close();
		}
	}
	
	

}
