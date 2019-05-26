package com.Selenium_Project.JavaProgrammes;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEg {

	public static void main(String[] args)
	{
		HashSet<String> s=new HashSet<>();
		
		s.add("Selenium");
		s.add("Boll");
		s.add("zebra");
		s.add("Tiger");
		s.add("Boll");
	
		Iterator<String> it=s.iterator();
		
		while(it.hasNext())
		{
			String y=it.next();
			System.out.println(y);
		}
		
	}

}
