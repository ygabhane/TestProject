package com.javaPrograms;

public class DuplicateArray {
	
	public static void main(String[]args)
	{
		int [] arr= new int []{1,1,1, 2, 3, 8, 8,8, 3};
		System.out.println("Duplicate elements in given array");
		for(int i=0; i <arr.length; i++)
		{
			for (int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				
					System.out.println(arr[j]);
				
			}
			
		}
	}

}
