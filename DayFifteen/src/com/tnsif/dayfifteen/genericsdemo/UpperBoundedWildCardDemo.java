//Program to demonstrate upper bound wild card
package com.tnsif.dayfifteen.genericsdemo;

import java.util.ArrayList;

public class UpperBoundedWildCardDemo {

	public static Double add(ArrayList<? extends Number> al) // any subclass of Number class
	{
		double sum = 0.0;
		for (Number n : al) {
			sum = sum + n.doubleValue();
		}
		return sum;
	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		System.out.println("display the sum" + add(al));

		ArrayList<Double> al1 = new ArrayList<Double>();
		al1.add(10.0);
		al1.add(20.0);
		al1.add(30.0);
		System.out.println("display the sum" + add(al1));
	}
}