package com.Selenium_Project.JavaProgrammes;

public class ReverseEg {

	public static void main(String[] args)
	{
		String course="madam";	// muineleS
							// madam		madam
							//malayalam		malayalam
							//dad			daa
		
		
		String Rev="";
		int len=course.length();
		
//		for (int i = 0; i < len; i++) 
//		{
//			System.out.println(course.charAt(i));
//		}
		
		for (int i = len-1; i >= 0; i--) 
		{
//			System.out.print(course.charAt(i));
			Rev=Rev+course.charAt(i);
		}
		
		System.out.println(Rev);
		
		if (course.equalsIgnoreCase(Rev)) 
		{
			System.out.println("The given String is a polyndrome");
		}
		else
		{
			System.out.println("The give string is not a polyndrome");
		}
	}

}
