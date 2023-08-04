package com.tnsif.dayeleven.nestedcatchdemo;

public class NestedTryCatch {

	public static void check()
	{
		String str="TNS";
		int slength=str.length();
		System.out.println("length is "+slength);
		
		String anotherString=null;
		int y=5; 
		try
		{
			try
			{
				System.out.println(str.charAt(y));
							}
			catch(StringIndexOutOfBoundsException s)
			{
			
				System.err.println("Error occurred.."+s.getMessage());
			}
			System.out.println(anotherString.length());
		}
			catch(NullPointerException np)
			{
				System.err.println("Null pointer "+np.getMessage());
			}
		}
		
		
		
	}


