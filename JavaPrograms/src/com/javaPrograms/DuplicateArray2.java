package com.javaPrograms;

public class DuplicateArray2 {
	public void duplicate(int arr[])
	{
		System.out.println("Duplicate Array is");
		for(int j=0;j<arr.length;j++)
		{
			for (int i=j+1;i<arr.length; i++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}
	
	}
	public static void main(String[]args)
	{
		int arr[]= {10,10,5,6,5,4,6,8,4};
		DuplicateArray2 arrobj=new DuplicateArray2();
		arrobj.duplicate(arr);
		
	}
}



