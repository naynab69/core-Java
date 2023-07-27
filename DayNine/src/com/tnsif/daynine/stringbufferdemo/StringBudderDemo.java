package com.tnsif.daynine.stringbufferdemo;

public class StringBudderDemo {

	public static void main(String[] args) {
		
		

    StringBuffer sb=new StringBuffer("Hello");
    System.out.println(sb);
    
    //length and capacity 
    System.out.println("length: "+sb.length()); 
    System.out.println("Capacity: "+sb.capacity());
    
   // append and insert
    
    String s ;
    int a=42;
    sb=new StringBuffer();
    StringBuffer sb1=new StringBuffer(1);
    s=sb.append("a: ").append(a).append("!").toString();
    System.out.println(s);
    System.out.println(sb);
    
    sb=new StringBuffer("I Java ");
    sb.insert(2,"like ");
    System.out.println(sb);
    
    //delete
    sb.delete(2, 3);
    System.out.println(sb);
    
    //reverse
    System.out.println(sb.reverse());
    

	}

}
