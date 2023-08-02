//Program to demonstrate array in Java
package com.tnsif.singledimarraydemo;

class ArrayOperations
{
	//print int array
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "\t");
		System.out.println();
	}
	
	// variable argument function
	
		public static int getSum(int... n) {
		int sum = 0;
		for (int no : n)
			sum += no;
		return sum;
	}
	
	//count no. of odd elements
	public static int getOddCount(int b[])
	{
		int count=0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] % 2 != 0)
				count++;		
		}
		return count;
	}
	
	//count no. of even elements
	public static int getEvenCount(int b[])
	{
		return b.length-getOddCount(b);
	}
}

//Driver class
public class ArrayDemoOne {
	
	public static void main(String args[])
	{
		int n = 10;
		int a[]; // declaration
		a = new int[n]; // instantiation  //length=10 ,value=0

		// displaying the array
		ArrayOperations.printArray(a);

		// assigning values in array a
		for (int i = 0; i < a.length; i++)
			a[i] = 5 * i;

		ArrayOperations.printArray(a);

		int b[] = { 10, 20, 30, 40, 50 }; // initialization at the time of declaration
		ArrayOperations.printArray(b);

		//calling variable argument function
		System.out.println("sum of array elements is : " + ArrayOperations.getSum(b));
		System.out.println("sum of array elements is : " + ArrayOperations.getSum(10,20,30,60));

		b[2] = 999; // assigning single element
		// RTE - ArrayIndexOutOfBoundsException
		//b[20]=10;
		ArrayOperations.printArray(b);

		// Display total no. of Odd and Even Numbers in array b
	
		System.out.println("Odd numbers : " + ArrayOperations.getOddCount(b) + "\tEven numbers : " + ArrayOperations.getEvenCount(b));
		System.out.println();
		System.out.println("---------------------------------------");

		int c[];		
		//ArrayOperations.printArray(c); //CTE

	}

}
