//To f=demonstrate operators

package com.tnsif.dayone.loopingdemo;

public class OperatorDemo {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int x=10;
		
		System.out.println("a="+a+" "+"b= "+b+" "+"x="+x) ;
		
		
		/*
		 * System.out.println(a++); 
		 */		
		
		++a; //11
		int c=++a+b+a--; //44
		System.out.println("value of c is "+c); 
		
		int d=c++ +a +b--; //75
		System.out.println("d= "+d);  
		
		System.out.println("b="+b); //19
		
		
		  //ternary operator
		 
		  x=(10==x)? 1:0; 
		  System.out.println("x="+x);
		 
		
		
		
		
		
	}

}
