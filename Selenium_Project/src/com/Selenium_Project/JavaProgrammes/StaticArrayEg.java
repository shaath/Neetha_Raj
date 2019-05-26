package com.Selenium_Project.JavaProgrammes;

public class StaticArrayEg {

	public static void main(String[] args)
	{
		int[] x={10000,20000,30000,40000,50000}; 
	
//		System.out.println(x.length);
		
//		System.out.println(x[2]);
		
//		for(int i=0; i < x.length; i++)
//		{
//			System.out.println(x[i]);
//		}
		
		for (int data : x) 
		{
			System.out.println(data);
		}
	}

}
