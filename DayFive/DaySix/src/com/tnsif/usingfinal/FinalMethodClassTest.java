//Program to demonstrate final method 
package com.tnsif.usingfinal;

public class FinalMethodClassTest extends FinalMethodClass {
	// Compile time error because we cannot override the final method
	/*
	 * @Override void show() {
	 * 
	 * System.out.println("This is the final method of FinalMethodEx class"); }
	 */

	public static void main(String[] args) {

		FinalMethodClass f = new FinalMethodClass();
		f.show();
	}

}