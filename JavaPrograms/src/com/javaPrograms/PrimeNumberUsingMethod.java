package com.javaPrograms;

public class PrimeNumberUsingMethod {
	public void primeNumber(int num)
	{
		int i; boolean flag=false;
		for (i=0; i<=num/2;i++)
		{
			if(num%10==0)
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Number is not prime");
		}
		else
		{
			System.out.println("Number is prime number");
		}
	
		
	}
	
	public static void main(String[] args)
	{
		//int num=10;
		PrimeNumberUsingMethod primeobj=new PrimeNumberUsingMethod();
		primeobj.primeNumber(7);
		
	}

}
