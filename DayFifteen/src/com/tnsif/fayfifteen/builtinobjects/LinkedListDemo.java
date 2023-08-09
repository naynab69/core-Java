//Program to demonstrate LinkedList class
package com.tnsif.fayfifteen.builtinobjects;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(40);
		ll.addFirst(5);
		ll.add(2, 60);
		ll.addLast(25);
		ll.add(30);

		System.out.println("Number List is " + ll);

		System.out.println("First Element is " + ll.getFirst());
		System.out.println("Last Element is " + ll.getLast());
		System.out.println(ll.get(4));

		ll.removeFirst();
		ll.removeLast();
		ll.remove(2);
		ll.remove();

		System.out.println("Number List after removing first and last element is " + ll);

		ListIterator<Integer> li = ll.listIterator();

		while (li.hasNext())
			System.out.print(li.next() + "\t");

		
		li = ll.listIterator(ll.size());
		while (li.hasPrevious()) {
			int n = li.previous();
			System.out.print(n + "\t");
			if (n == 40)
				li.add(99999);
			if (n == 60)
				li.set(5555);
		}
		
		System.out.println("Number List is " + ll);
		
		Collections.sort(ll);
		System.out.println("Number List in Ascending order is " + ll);
		
		Collections.reverse(ll);
		System.out.println("Number List in Descending order is " + ll);

	}
}
