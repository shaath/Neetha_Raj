package com.Selenium_Project.JavaProgrammes;

import java.util.Scanner;

public class DoWhileEg {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int value=sc.nextInt();
		do
		{		
			System.out.println(i);
			i++;
		}
		while(i <= value);

	}

}
