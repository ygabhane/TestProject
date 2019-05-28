package com.javaPrograms;

public class PalindromeNumber {
	
	public static void main(String[]args)
	{
		int num=1221, reverseInteger=0, originalInteger, remainder;
		
		originalInteger=num;
		while (num > 0)
		{
			remainder=num %10;
			reverseInteger=reverseInteger*10+remainder;
			num /=10;
		}
		if(originalInteger==reverseInteger)
		{
			System.out.println("Number is Palindrome Number ");
		}
		else
		{
			System.out.println("Number is not Palindrome Number ");
		}
	}

}
