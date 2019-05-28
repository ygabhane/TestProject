package com.javaPrograms;

public class GradeSystem {
	public static void main(String[]args)
	{
		//It is a program of grading system for fail, D grade, C grade, B grade, A grade and A+. 
		int marks=34;
		
		if(marks>=75)
		{
			System.out.println("Student passed with distinction");
		}
		else if(marks<75 && marks >=60)
		{
			System.out.println("Student Pass with A grade");
		}
		else if (marks<60 && marks >=45)
		{
			System.out.println("Student Pass with B grade");
		}
		else if (marks<45 && marks >=35)
		{
			System.out.println("Student Pass with C grade");
		}
		else 
		{
			System.out.println("Student is fail");
		}
	}

}
