package com.tnsif.daynine.stringsdemo;

public class SampleStringDemo {

	public static void main(String[] args) {
		//initialize string
		char c[]= {'I','n','d','i','a'};
		
		String s1=new String(c);
		String s2=new String (s1);
		
		System.out.println(s1);
		System.out.println(s2);
		
		//concatenation to prevent long lines
		String longStr="This is  to show" +" how long senetenses"+"can be printed";
		
		System.out.println(longStr);
		
	}

}
