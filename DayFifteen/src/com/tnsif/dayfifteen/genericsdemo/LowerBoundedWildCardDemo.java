//Program to demonstrate lower bound wild card
package com.tnsif.dayfifteen.genericsdemo;

import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildCardDemo {

	public static void displayNumbers(List<? super Integer> list) // any super class of Integer class
	{
		for (Object n : list) {
			System.out.println(n);
		}
	}

	public static void main(String args[]) {
		List<Float> ll = Arrays.asList(1.0f, 2.9f, 3.0f);
		System.out.println("display values");
		//displayNumbers(ll);

		List<Number> l2 = Arrays.asList(1.0, 2.0, 3.0);
		System.out.println("display values");
		displayNumbers(l2);

		List<Integer> l3 = Arrays.asList(1, 2, 3);
		System.out.println("display values");
		displayNumbers(l3);

		/*
		 * List<Double> l3= Arrays.asList(1.0,2.0,3.0);
		 * System.out.println("display values"); displayNumbers(l3);
		 */
	}
}