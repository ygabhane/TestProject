package com.javaPrograms;

public class LinearSearch {
	public static int linears(int[]arr, int key)
	
	{
		for (int i=0; i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				return i;
			}
		}
		return -1;
	}
	
		
	public static void main(String []args)
	{
		int [] a1= {10,20,30,10,50,40};
		int key=30;
		System.out.println(key+" is found at index: "+linears(a1, key));
		
		}
		
	}


