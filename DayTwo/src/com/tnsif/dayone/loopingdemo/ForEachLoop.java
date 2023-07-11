//To demonstrate ForEach Loop
package com.tnsif.dayone.loopingdemo;

public class ForEachLoop {

	public static void main(String[] args) {
     int a[]= {10,20,30,40,50};
     
     //for integer array
     for(int i:a)
     {
    	System.out.println(i); 
     }
      System.out.println();
     
    //for char array
     char ch[]= {'j','a','v','a'};
     
     for(char i:ch)
     {
    	System.out.print(i); 
     }
     
     
     System.out.println();

   //for String array
     String s[]= {"Java","Programming","Learning"};
     
     for(String i:s)
     {
    	System.out.println(i); 
     }


	}

}
