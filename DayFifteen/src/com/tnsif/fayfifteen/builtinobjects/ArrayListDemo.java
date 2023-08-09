package com.tnsif.fayfifteen.builtinobjects;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo  {

	public static void main(String[] args) {
		List list1=new ArrayList();//dynamic binding
		
		System.out.println(list1.isEmpty());
		list1.add(10);
		list1.add(20);
		list1.add("Megana");
		list1.add("Tushar");
		list1.add(false);
		list1.add(true);
		list1.add(20);
		list1.add(12.4f);
		list1.add(10);
		System.out.println("List is "+list1);
		System.out.println(list1.isEmpty());
		System.out.println(list1.size());
		
		System.out.println("Is list contains 10? "+list1.contains(10));
		
		list1.remove(false);
		System.out.println("List is "+list1);
		
		/*
		 * list1.remove(20); System.out.println("List is "+list1);
		 */
		
		System.out.println(list1.get(5));
		
		System.out.println(list1.remove(list1.lastIndexOf(20)));
		System.out.println("List is "+list1);
		
		
		System.out.println(list1.indexOf(20));
		
		
		System.out.println(list1.remove(list1.indexOf(20)));
		System.out.println("List is "+list1);
		
		/*
		 * Collections.sort(list1); //RTE //classcastException
		 * System.out.println(list1);
		 */
		
		list1.clear();
		System.out.println("List is "+list1);
		

		System.out.println("_________________________________");
		
		
		//Generics
		
		List<String> names=new ArrayList<>();
		
		names.add("Dilip");
		names.add("Varapradha");
		names.add("Dhanashri");
		names.add("Jaya");
		names.add("Shoheb");
		//names.add(null);
		//names.add(null);
		names.add("Varapradha");
		names.add("Jaya");
		//names.add(10);  //CTE
		System.out.println(names);
		
		Collections.reverse(names);
		System.out.println(names);
		
		System.out.println(names.contains("Jaya"));

		
		Collections.sort(names);
		System.out.println(names);
		
		Collections.reverse(names);
		System.out.println(names);
		
		
		//Traversing a list
		
		Iterator<String> i=names.iterator();
		
		while(i.hasNext())
		{
			String nm=i.next();
			System.out.println(nm);
			if(nm.equals("Jaya"))
				i.remove();
		}
		System.out.println(names);
		
		ListIterator<String> li=names.listIterator(names.size());
		while(li.hasPrevious())
		{
			String nm=li.previous();
			System.out.println(nm);
			
		}
		
		
		
	}
	

}
