package com.javaPrograms;

public class FactorialUsingMethod {
	
	public static void factorial(int arr [])
	{
		
		for (int j=0; j<=arr.length; j++)
			
		{
			int i, fact=1;
		for(i=1;i<=arr [j]; i++)
		
			fact=fact*i;
		
		System.out.println("Fact of number is="+fact);
		}
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] arg)
	{
		int arr []= {5, 6, 3, 9,11};
		FactorialUsingMethod factobj=new FactorialUsingMethod();
		factobj.factorial(arr);
	}

}
