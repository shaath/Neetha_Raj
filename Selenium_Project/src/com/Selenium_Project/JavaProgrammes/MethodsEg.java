package com.Selenium_Project.JavaProgrammes;

public class MethodsEg 
{

	public static void main(String[] args) 
	{
		Function1();
		String res=Function2();
		System.out.println(res);
		
		MethodsEg m=new MethodsEg();
		m.Function3();
		
		boolean flag=m.Function4();
		System.out.println(flag);
	}

	
	//static method without returning any value
	public static void Function1()
	{
		System.out.println("This is Function1 code");
	}
	//Static method with returning value
	public static String Function2()
	{
		System.out.println("This is Function2 code");
		return "Pass";
	}
	
	//Non static method without returning any value
	
	public void Function3()
	{
		System.out.println("This is Function3 code");
	}
	
	//Non static method with returning value
	public boolean Function4()
	{
		System.out.println("This is Function4 code");
		return true;
	}
	
	public int Sum(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	public int Sum(int c, int d, int f)
	{
		int e=c+d+f;
		return e;
	}
}
