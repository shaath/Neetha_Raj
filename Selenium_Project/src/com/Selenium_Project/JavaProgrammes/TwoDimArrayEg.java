package com.Selenium_Project.JavaProgrammes;

public class TwoDimArrayEg {

	public static void main(String[] args) 
	{
		int[][] x=new int[2][3];

		System.out.println(x.length);
		System.out.println(x[0].length);
		
		x[0][1]=60000;
		x[1][2]=100000;
		
//		System.out.println(x[1][2]);
		
		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < x[i].length; j++)
			{
				System.out.println(x[i][j]);
			}
		}
	}

}
