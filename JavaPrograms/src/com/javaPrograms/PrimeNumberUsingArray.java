package com.javaPrograms;

public class PrimeNumberUsingArray {
	
	public void arrMethod(int arr [])
	{
		
		for (int j=0; j<arr.length; ++j)
		{
			int i=0;
			boolean flag=false;
		for( i=2; i<=arr[j]/2; ++i)
		{ 
			if (arr[j]%i==0)
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println(arr[j]+ " Number is not prime number");
		}
		else
		{
			System.out.println(arr[j]+ " Number is prime number");
		}
	}}
	
	public static void main(String []args)
	{
		int arr []= {10, 13, 15, 7};
		PrimeNumberUsingArray prime=new PrimeNumberUsingArray();
		prime.arrMethod(arr);
	}

}
