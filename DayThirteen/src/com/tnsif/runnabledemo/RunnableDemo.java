package com.tnsif.runnabledemo;

public class RunnableDemo {

	public static void main(String[] args) {
		
		
		//UsingRunneable r=new UsingRunneable(10,1,"Hiii");
		
		/*Runnable r1=new Runnable()
				{//anonymous class
			public void run()
			{
				System.out.println("runnable with anonymous class");
			}
				};
				
				Thread t1=new Thread(r1);
				t1.start();
	}*/
		
		//lambda Expression
		
		Runnable r2=()->System.out.println("runnable with Lambda Expression");
		new Thread(r2).start();
		
	}
}
