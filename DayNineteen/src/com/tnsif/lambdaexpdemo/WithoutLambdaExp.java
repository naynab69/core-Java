package com.tnsif.lambdaexpdemo;

interface Message
{
	public void greet(String name);
	
}

public class WithoutLambdaExp {
	
	public static void main(String[] args) {
		//without lambda
		
		Message m=new Message()
				
		//anonymous class
				{
			public void greet(String name)
			{
				System.out.println("Good Afternoon "+name);
			}
				};
				m.greet("Athrava");
				
				//using lambda exp
				Message m1=(name)->System.out.println("Good Afternoon "+name);
				
				m1.greet("Latha");

	}

}
