package com.javaPrograms;

public class FibonancciSeries {
	
	public static void main(String[]args)
	{
		int x=0,y=1,z, count=7;
		
		System.out.print(x+ " " +y);
		
		for (int i=2; i<=count; i++)
		{
			z=x + y;
			
			System.out.print ( " "+z );
			x= y;
			y= z;
		}
		
		
	}

}
