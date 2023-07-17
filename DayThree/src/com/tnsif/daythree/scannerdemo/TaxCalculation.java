//To Demonstrate tax calculation
package com.tnsif.daythree.scannerdemo;

public class TaxCalculation {
	//method for tax calculation
	
	public void calculateTax(Person person)
	{
		if(person.getAge()>65 || person.getGender().equalsIgnoreCase("female"))
		{
			person.setTax(0);
			System.out.println("Tax is not applicable");
		}
		
		else {
			if (person.getIncome()<=160000)
			{
				person.setTax(0);
				System.out.println("Male Pesron-Tax is not applicable");
			}else if (person.getIncome()>160000 && (person.getIncome()<=500000))
			{
			person.setTax((person.getIncome()-160000)*10/100);	
			}
			else if (person.getIncome()>500000 && (person.getIncome()<=800000))
			{
				person.setTax((person.getIncome()-160000)*20/100+34000);
			}
			else if (person.getIncome()>800000 && (person.getIncome()<=2000000))
			{
				person.setTax((person.getIncome()-160000)*30/100);
			}
		}
			
	}

}
