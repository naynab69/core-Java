//Program to demonstrate Jagged array 
package com.tnsif.singledimarraydemo;

class JaggedArray {
	static void printArray(int d[][]) {
		for (int i = 0; i < d.length; i++) {  //row 
			for (int j = 0; j < d[i].length; j++) //column
				System.out.print(d[i][j] + " ");
			System.out.println();
		}

	}
}

public class JaggedArrayDemo {

	public static void main(String[] args) {

		int d[][] = { { 10, 20, 30 }, { 40 }, { 12, 21 }, { 11 } };
		
		/*
		 * int data[][]=new int [3][]; //row 0 data[0][0]=10; data [0][1]=20;
		 * data[0][2]=30;
		 * 
		 * //row 1 data[1][0]=40;
		 * 
		 * //row 2 data[2][0]=12; data[2][1]=21;
		 * 
		 * //row 3 data[3][0]=11;
		 */
		
		
		System.out.println("Total Rows in Array d : " + d.length);

		JaggedArray.printArray(d);
	}

}
