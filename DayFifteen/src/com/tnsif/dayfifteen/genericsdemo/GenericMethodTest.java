package com.tnsif.dayfifteen.genericsdemo;

public class GenericMethodTest {
		
	public<E> void displayArray(E[] elements)
	{
		for(E number:elements)
		System.out.println(number);
	}

	public static void main(String[] args) {
		
		GenericMethodTest obj=new GenericMethodTest();
		Integer[] intArray= {10,20,30,40};
		String [] StringArray= {"Atharava","Jaya","Sachita"};
		Float [] floatArr= {12.45f,56.9f,56.33f};
		
		obj.displayArray(intArray);
		obj.displayArray(StringArray);
		obj.displayArray(floatArr);
	}

}
