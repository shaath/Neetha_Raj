package com.Selenium_Project.JavaProgrammes;

public class ObjectEg {

	public static void main(String[] args) 
	{
		Object[] x={10000,"Selenium",'M',true,4444.444};

		System.out.println(x.length);
		
		for (int i = 0; i < x.length; i++)
		{
			System.out.println(x[i]);
		}
	}

}
