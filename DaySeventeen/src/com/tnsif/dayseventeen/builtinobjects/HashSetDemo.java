//Program to demonstrate HashSet Collection
package com.tnsif.dayseventeen.builtinobjects;

import java.util.Collections;
import java.util.HashSet;
import java.util.Spliterator;

public class HashSetDemo {
	static void addElements(HashSet<Integer> numberHashSet) {
		numberHashSet.add(61);
		numberHashSet.add(41);
		numberHashSet.add(91);
		numberHashSet.add(51);
		numberHashSet.add(80);
		numberHashSet.add(11);
		numberHashSet.add(20);
		numberHashSet.add(11); //No CTE
		//System.out.println(numberHashSet.add(51)); //returns false - not allow to insert duplicate element
	}

	public static void main(String[] args) {
		//Unordered and unsorted set
		HashSet<Integer> numberHashSet = new HashSet<Integer>();
		addElements(numberHashSet);
		System.out.println(numberHashSet);

		HashSet<Integer> numberHashSet1 = new HashSet<Integer>();
		numberHashSet1.add(20);
		numberHashSet1.add(80);
		numberHashSet1.add(11);
		numberHashSet1.add(50);
		numberHashSet1.add(60);
		numberHashSet1.add(10);
		numberHashSet1.add(51);

		System.out.println("Set 1: " + numberHashSet);
		System.out.println("Set 2: " + numberHashSet1);

		HashSet<Integer> numberHashSet2 = new HashSet<Integer>();
		addElements(numberHashSet2);

		// Union of two sets
		numberHashSet2.addAll(numberHashSet1);
		System.out.println("Union Set : " + numberHashSet2);

		numberHashSet2.clear();
		addElements(numberHashSet2);
		// Intersection of two SETs
		numberHashSet2.retainAll(numberHashSet1);
		System.out.println("Intersection Set : " + numberHashSet2);

		numberHashSet2.clear();
		addElements(numberHashSet2);
		// SET Difference
		numberHashSet2.removeAll(numberHashSet1);
		System.out.println("Difference Set : " + numberHashSet2);

		//SplitIterator 
		Spliterator<Integer> spit=numberHashSet1.spliterator();
		spit.forEachRemaining(System.out::println);//method reference
	
		
	}

}
