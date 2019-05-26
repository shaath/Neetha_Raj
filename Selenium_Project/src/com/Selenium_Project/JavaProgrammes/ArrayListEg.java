package com.Selenium_Project.JavaProgrammes;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args)
	{
		ArrayList<Object>  x=new ArrayList<>();
		
		//Write
		x.add("Selenium");
		x.add("Raj");
		x.add("Neetha");
		x.add(60000);
		x.add("Selenium");
		x.add(2, true);
		x.set(3, 100000);
		
//		x.add(8, "Sharath");
				
		System.out.println(x.size());
		
//		System.out.println(x.get(2));
		
		for (int i = 0; i < x.size(); i++)
		{
			System.out.println(x.get(i));
		}
		

	}

}
