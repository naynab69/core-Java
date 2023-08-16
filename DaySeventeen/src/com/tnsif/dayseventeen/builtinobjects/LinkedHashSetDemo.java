//Program to demonstrate LinkedHashSet Collection
package com.tnsif.dayseventeen.builtinobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// ordered, unsorted set
		LinkedHashSet<Integer> lhset = new LinkedHashSet<Integer>();
		lhset.add(10);
		lhset.add(40);
		lhset.add(20);
		lhset.add(70);
		lhset.add(60);
		lhset.add(30);
		lhset.add(10);
		
		System.out.println("LinkedHashSet : " + lhset);
		//Collections.sort(lhset); //CTE - cannot directly sort HashSet/LinkedHashSet

		// sort using ArrayList/TreeSet

		// Convert LinkedHashSet to an ArrayList
		ArrayList<Integer> array = new ArrayList<>(lhset);

		// sort ArrayList
		Collections.sort(array);

		// Print after sort
		System.out.println("After sort: " + array);

	}

}
