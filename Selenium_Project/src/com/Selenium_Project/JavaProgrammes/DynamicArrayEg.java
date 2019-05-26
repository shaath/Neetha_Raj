package com.Selenium_Project.JavaProgrammes;

public class DynamicArrayEg {

	public static void main(String[] args)
	{
		String[] x=new String[5];

		System.out.println(x.length);
		
		x[2]="UFT";
		x[4]="Sharath";
		x[2]="Selenium";
		for (int i = 0; i < x.length; i++) 
		{
			System.out.println(x[i]);
		}
	}

}
