package com.tnsif.daynine.stringsdemo;

public class StringComaprison {

	public static void main(String[] args) {
		//creating strings using literals //heap memory
		String s1="TNSIF";
		String s2="TNSIF";
		
		//creating strings using new operator //Heap memory
		String s3=new String("tnsif");
		String s4=new String("TNSIF");
		
		//== & equals
		//==-> object reference
		//equals ->data
		System.out.println("case 1: " + (s1 == s2)); //true
		System.out.println("case 2: " + (s1 == s3)); //false
		System.out.println("case 3: " + s2.equals(s1));//true
		System.out.println("case 4: " + s2.equals(s4));//true
		System.out.println("case 5: " + (s3 == s4));//false
		System.out.println("case 6: " + s3.equals(s4));//true
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		//compareTo
		System.out.println(s1.compareTo("TNSIF"));  //unicode value
		
		System.out.println(s1.compareToIgnoreCase("tnsif"));
		System.out.println(s1.compareTo(s3));
		


	}

}
