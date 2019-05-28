package com.javaPrograms;

public class ArmstrongNumber {
	public static void main(String[]args)
	{
	int num=371, originalNumber, remainder,result=0;
	originalNumber=num;
	while(originalNumber>0)
	{
		remainder=originalNumber%10;
		/*result += Math.pow(remainder, 3);
        originalNumber /= 10;*/
	    result=result+(remainder*remainder*remainder);
	    originalNumber=originalNumber/10;   
	}
	if (result==num)
	
		System.out.println("Number is Armstrong Number");
	
	else
	
		System.out.println("Number is not Armstrong Number");
	

}
}