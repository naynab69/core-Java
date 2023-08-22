package com.tnsif.lambdaexpdemo;

public class lambdaWithParaDemo {

	public static void main(String[] args) {
		//way 1
		Cube c=(a)->{return a*a*a;};
		System.out.println(c.calculate(3));

		//way 2
		Cube c1=(a)->a*a*a;
		System.out.println(c.calculate(2));
		
		IsOdd id=(a)->a%2!=0;
		System.out.println(id.checkOdd(3));
		System.out.println(id.checkOdd(6));
		
		
	}

}
