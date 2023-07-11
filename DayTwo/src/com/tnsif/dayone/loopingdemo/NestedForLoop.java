package com.tnsif.dayone.loopingdemo;

public class NestedForLoop {

	public static void main(String[] args) {
		
		int beg=10;
		int end=20;
		for(int i=beg;i<=end;i++) // outer loop to vary from 10 to 20
		{
			for(int j=1;j<=10;j++)  //inner loop to vary from 1 to 10
			{
				System.out.println(i*j);
			}
			System.out.println();
		}

	}

}
