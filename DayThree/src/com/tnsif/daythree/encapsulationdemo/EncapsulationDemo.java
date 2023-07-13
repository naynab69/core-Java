package com.tnsif.daythree.encapsulationdemo;

public class EncapsulationDemo {

	public static void main(String[] args) {
		OopsDemo oops=new OopsDemo();
		
				
		oops.setAge(23);
		oops.setName("Tushar");
		oops.setSerialNum(2);
		
		System.out.println(oops.getAge());
		System.out.println(oops.getSerialNum());
		System.out.println(oops.getName());
		
		System.out.println(oops);
		
		
		
		

	}

}
