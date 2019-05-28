package com.javaPrograms;

public class PimeNumberPract {
	
	public static void main(String[]args)
	{
		int i, num=8; boolean b=false;
		
		for (i=2; i<=num/2; i++)
		{
			if(num%i==0)
			{
				b=true;
			}
		}
		if(b)
		{
			System.out.println("Number is not prime ");
		}
		else
		{
			System.out.println("Number is prime");
		}
	}

}
