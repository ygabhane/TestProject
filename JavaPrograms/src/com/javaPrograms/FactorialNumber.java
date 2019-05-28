package com.javaPrograms;

public class FactorialNumber {
	
	static public   void main(String args[])
	{
		int fact=1, i;
		int number=3 ;
		
		for(i=1; i<=number; i++)
		{
			fact=fact*i;
		}
		
		System.out.println("Factorial of number="+fact);
		
	}

}
