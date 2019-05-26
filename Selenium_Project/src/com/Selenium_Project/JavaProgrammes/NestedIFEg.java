package com.Selenium_Project.JavaProgrammes;

public class NestedIFEg
{

	public static void main(String[] args) 
	{
		int a=30000;
		int b=200;
		int c=1000;
		
		if(a>b & a>c)
		{
			System.out.println("A is Greater");
		}
		else if(a>b & a>c)
		{
			System.out.println("B is Greater");
		}
		else if(c>a & c>b)
		{
			System.out.println("C is Greater");
		}

	}

}
