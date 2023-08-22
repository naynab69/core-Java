package com.tnsif.daytwentystreamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasics {

	public static void main(String[] args) {
		//create a stream from set of values
		//Way 1
		Stream<Integer> stream=Stream.of(10,20,30,40,50);
		
		//count no of elements 
		System.out.println("No of elements:"+stream.count());
		
		//way 2
		//Array of integers
		Integer[ ] values=new Integer[] {1,2,3,4,5,6,7,8,9,1,2,3};
		//create a stream from array
		stream=Arrays.stream(values);
		
		//map
		//Square of all elements
		//stream=stream.map(num->num*num).forEach(System.out::println);
		stream=stream.map(num->num*num);
		stream.forEach(System.out::println);
		
		//limit
		System.out.println("First 3 elements of the stream:");
		Arrays.stream(values).limit(3).forEach(System.out::println);
		//stream=Arrays.stream(values).limit(3);  //1,2,3
		
		//skip
		System.out.println("Elements excepts first 4:");
		stream=Arrays.stream(values).skip(4);
		stream.forEach(System.out::println);
		
		//distinct
		System.out.println("Distinct elemets are");
		Arrays.stream(values).distinct().forEach(System.out::println);
		
		
		System.out.println("Without Intermediate method");
		Arrays.stream(values).forEach(System.out::println);
		
		//way 3
		List<String> words=Arrays.asList("Java","Spring","Hibernate","Angular");
		
		//create a stream from list
		Stream<String> stream1=words.stream();
		
		//map
		System.out.println("Strings in uppercase:");
		
		stream1=stream1.map(str->str.toUpperCase());
		List<String> l1=stream1.collect(Collectors.toList());
		System.out.println(l1);
		
		
		

		
	}

}
