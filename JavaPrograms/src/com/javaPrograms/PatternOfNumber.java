package com.javaPrograms;

import java.util.Scanner;

@SuppressWarnings("unused")
public class PatternOfNumber {
	public static void main(String[]args)
	{
		int i,j,k,l;
		
		for (i=1; i<=4; i++)
		{
			for (j=4;j>=i; j--)
			{
				System.out.print(" ");
			}
			for (k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			for (l=2; l<=i; l++)
			{
				System.out.println("*");
			}
			System.out.println();
			
		}
	}

}
