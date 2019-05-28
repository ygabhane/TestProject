package com.javaPrograms;

public class PrimeNumber {
	
	public static void main(String[]args)
	{
		int i, num=27; boolean flag=false;
		for (i=2; i<=num/2; ++i)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println(num +" Number is not prime number");
		}
		else
		{
			System.out.println(num +" Number is prime number");
		}
	}

}
