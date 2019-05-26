package com.Selenium_Project.JavaProgrammes;

public class ReuseEg {

	public static void main(String[] args) 
	{
//		MethodsEg.Function1();
		MethodsEg m=new MethodsEg();
		int res=m.Sum(500 , 600);
		System.out.println(res);

		System.out.println(m.Sum(20, 30,40));
		
	}

}
