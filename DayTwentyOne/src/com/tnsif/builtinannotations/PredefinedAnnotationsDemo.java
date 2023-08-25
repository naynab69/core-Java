package com.tnsif.builtinannotations;


import java.util.*;
public class PredefinedAnnotationsDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		List s=new ArrayList();
		s.add(12);
		s.add(12.6f);
		s.add(new Student(101,"Megana","CSE"));
		s.add("abc");
		
		
	}

}
