package com.tnsif.dayone.loopingdemo;

public class DecisionMakingWithOperators {
	
	public static void main(String[] args) {
		int x = 8, y = 7;
		int a = 10;
		int b = 11;

		if (x >= y) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (!(a < b) || (a == b)) {
			System.out.println("Condition is TRUE");
		} else

		{
			System.out.println("Condition is FALSE");
		}
	}
}
