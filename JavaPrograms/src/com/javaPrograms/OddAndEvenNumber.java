package com.javaPrograms;

public class OddAndEvenNumber {
	
	public void number(int num)
	{
        if (num%2==0)
		{
			System.out.println("Number is Even Number");
		}
		else
		{
			System.out.println("Number is odd");
		}
	}
	public static void main(String[]args)
	{
		OddAndEvenNumber obj=new OddAndEvenNumber();
		obj.number(3);
	}
	
	

}
