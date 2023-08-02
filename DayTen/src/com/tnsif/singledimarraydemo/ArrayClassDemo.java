package com.tnsif.singledimarraydemo;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {

		
		
		//get the array
		int intArr[]= {69,20,12,40,35};
		
		//print the array
		System.out.println(Arrays.toString(intArr));
		
		//sort
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
		//binarysearch
		//int key=12;
		System.out.println(Arrays.binarySearch(intArr, 40));
		
		System.out.println(Arrays.binarySearch(intArr, 0, 2, 99));
		
		
	
		
	}

}
