package com.Selenium_Project.JavaProgrammes;

public class TaskEg {

	public static void main(String[] args) 
	{
		String course="Seleeenium";
		int count=0;
		int len=course.length();
		
		for (int i = 0; i < len; i++)
		{
			char x=course.charAt(i);
			
			System.out.println(i+"------"+x);
			if (x=='e')
			{
				count=count+1;
			}	
		}

//		System.out.println(count);
		
		
		
	}

}
