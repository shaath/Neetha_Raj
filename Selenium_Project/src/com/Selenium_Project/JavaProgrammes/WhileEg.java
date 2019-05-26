package com.Selenium_Project.JavaProgrammes;

public class WhileEg {

	public static void main(String[] args) 
	{
		int i=50;
		int value=500;
		while(i <= value )
		{
			System.out.println(i);
			if (i==70)
			{
				break;
			}
			i++;
			
		}
		System.out.println("**********");
		i=100;
		value=1;
		while(i>=value)
		{
			System.out.println(i);
			i--;
		}

	}

}
