package com.Selenium_Project.JavaProgrammes;

public class ReuseInterfaceEg 
{
	public static void main(String[] args)
	{
		InterfaceImplementsEg1 im=new InterfaceImplementsEg1();
		
		im.Vehicle();
		im.Ship();
		im.Flight();
		
		InterfaceImplementsEg2 im1=new InterfaceImplementsEg2();
		im1.Vehicle();
		im1.Ship();
		im1.Flight();
		
	}

}
