package com.Selenium_Project.JavaProgrammes;

public class ReverseStringEg {

	public static void main(String[] args)
	{
		String course="Selenium";
		StringBuilder sb=new StringBuilder(course);
		
		System.out.println(sb.reverse());
		
		StringBuilder x=sb.reverse();
		
		System.out.println(x.toString().equalsIgnoreCase(course));
		if (x.toString().equalsIgnoreCase(course)) 
		{
			System.out.println("The given String is a polyndrome");
		}
		else
		{
			System.out.println("The give string is not a polyndrome");
		}
	}

}
