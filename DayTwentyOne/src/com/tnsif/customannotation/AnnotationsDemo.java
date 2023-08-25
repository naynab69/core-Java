package com.tnsif.customannotation;

import java.lang.annotation.Annotation;

public class AnnotationsDemo {

	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		
		AndroidSeries as=new AndroidSeries("M10",40);
		System.out.println(as.model);
		System.out.println(as.ScreenSize);
		
		System.out.println("SmartPhone Deatils");
		
		
		@SuppressWarnings("rawtypes")
		Class c=as.getClass();
		
		
		Annotation an=c.getAnnotation(SmartPhone.class);
		SmartPhone s= (SmartPhone)an;
		System.out.println(s.os());
		System.out.println(s.version());
		
       System.out.println("SmartTV Deatils");
		
		
		@SuppressWarnings("rawtypes")
		Class c1=as.getClass();
		
		
		Annotation an1=c1.getAnnotation(SmartTV.class);
		SmartTV s1= (SmartTV)an1;
		System.out.println(s1.os());
		System.out.println(s1.height());
		System.out.println(s1.width());

	}

}
