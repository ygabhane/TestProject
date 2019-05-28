package com.javaPrograms;

public class MonthwithSwitchCase {
	
	public void monthString(int month)
	{
		switch(month)
		{
		case 1 : System.out.println("Month is jan");
		break;
		case 2 : System.out.println("Month is feb");
		break;
		case 3 : System.out.println("Month is march");
		break;
		case 4 : System.out.println("Month is Apr");
		break ;
		case 5 : System.out.println("Month is May");
		break;
		case 6 : System.out.println("Month is June");
		break;
		case 7 : System.out.println("Month is July");
		break;
		default: System.out.println("Month not declaired");
	}}
		
	public static void main(String[]args)
	{
		MonthwithSwitchCase objmonth=new MonthwithSwitchCase();
		objmonth.monthString(1);
	}

}
