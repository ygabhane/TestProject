package com.javaPrograms;

public class DonateBloodNestedIF {
	

	public void donateBlood(int age, int weight, int calories)
	{
		//Creating two variables for age and weight  
		
		if (age>=18)
		{
			if(weight>=50)
			{
				if (calories>=5100)
				{
					System.out.println("Eligible to donate the blood");
				}
				
			}
			else
			{
				System.out.println("Not eligible to donate the blood");
			}
		}
		
	}
	public static void main(String[]args)
	{
		DonateBloodNestedIF objB=new DonateBloodNestedIF();
		objB.donateBlood(45,50 , 6542);
	}
}
