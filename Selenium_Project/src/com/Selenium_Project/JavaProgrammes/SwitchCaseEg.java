package com.Selenium_Project.JavaProgrammes;

public class SwitchCaseEg {

	public static void main(String[] args)
	{
		String course="Selenium";
		
		switch (course) 
		{
		case "Manual":
			System.out.println("You are selected Manual");		
			break;
		case "UFT":
			System.out.println("You are selected UFT");
			break;
		case "Selenium":
			System.out.println("You are selected Selenium");
			break;
		default:
			System.out.println("Select a proper course");
			break;
		} 

	}

}
