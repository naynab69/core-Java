package com.tnsif.dayeleven.uncheckeddemo;

public class UncheckedException {

	public static void main(String[] args) {

		//declare array
		int x[];
		try {
		x=new int[] {1,2,3,4,5};
		System.out.println(x[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.err.println("specified index does not exist "+e.getMessage());
		}
		
	}

}
