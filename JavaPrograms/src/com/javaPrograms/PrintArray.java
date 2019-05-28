package com.javaPrograms;

public class PrintArray {
	 public void printArra(int a [] )
	{
		
		 for (int i=0;i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
	}
public static void main(String[]args)
	{
	int a []= {10,20,30,50,40};
	PrintArray objarr=new PrintArray();
	objarr.printArra(a);;
	}

}
