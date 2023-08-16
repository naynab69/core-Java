//Program to demonstrate generic interface
package com.tnsif.dayfifteen.genericsdemo;

////Generic Interface
interface MinMax<T extends Comparable<T>> {
	T min();

	T max();
}

//Generic Class implements Generic Interface
public class GenericInterfaceDemo<T extends Comparable<T>> implements MinMax<T> {
	T[] values;

	// Generic Constructor
	GenericInterfaceDemo(T[] obj) {
		values = obj;
	}

	// Generic method
	@Override
	public T min() {
		T o1 = values[0];

		for (int i = 1; i < values.length; i++)
			if (values[i].compareTo(o1) < 0)
				o1 = values[i];
		return o1;
	}

	// Generic method
	@Override
	public T max() {
		T o1 = values[0];
		for (int i = 1; i < values.length; i++)
			if (values[i].compareTo(o1) > 0)
				o1 = values[i];
		return o1;
	}

	public static void main(String s[]) {
		Float arr[] = { 3.22f, 6.8f, 222.8f, 88.9f, 6.0f };
		GenericInterfaceDemo<Float> obj1 = new GenericInterfaceDemo<Float>(arr);

		System.out.println("Minimum value is : " + obj1.min());
		System.out.println("Maximum value is : " + obj1.max());

		String arr1[] = { "Ankit", "Pooja", "Neha", "Sakshi", "Amol" };
		GenericInterfaceDemo<String> obj2 = new GenericInterfaceDemo<String>(arr1);

		System.out.println("Minimum value is : " + obj2.min());
		System.out.println("Maximum value is : " + obj2.max());
	}
}