package com.tnsif.vectordemo;

import java.util.*;

public class VectorDemo {
	

		public static void main(String[] args) {
			Vector<String> animals = new Vector<>();
			animals.add("Dog");
			animals.add("Horse");
			animals.add("Cat");

			System.out.println("Initial Vector: " + animals);
			// Using get()
			String element = animals.get(2);
			System.out.println("Element at index 2: " + element);

			// Using iterator()
			Iterator<String> iterate = animals.iterator();
			System.out.print("Vector: ");
			while (iterate.hasNext()) {
				System.out.print(iterate.next());
				System.out.print(", ");
			}
			// Using remove()
			element = animals.remove(1);
			System.out.println("Removed Element: " + element);
			System.out.println("New Vector: " + animals);

			// Using clear()
			animals.clear();
			System.out.println("Vector after clear(): " + animals);
		}

	}


