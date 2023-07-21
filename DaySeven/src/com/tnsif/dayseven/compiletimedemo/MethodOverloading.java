package com.tnsif.dayseven.compiletimedemo;

public class MethodOverloading {
	// method 1
	public static int addition(int a, int b) {
		return a + b;
	}

	// method 2
	public static float addition(int a, float b) {
		return a + b;
	}

	// method 3
	public static float addition(float a, float b) {
		return a + b;
	}

	// method 4
	public static float addition(float a, int b,int c) {
		return a + b+c;
	}

}
