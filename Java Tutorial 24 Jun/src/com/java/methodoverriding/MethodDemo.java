package com.java.methodoverriding;

public class MethodDemo {

	public static void add()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	
	public static int add(int a,int b)
	{
		return a+b;
	}
	
	public static int sub(int a,int b)
	{
		return b-a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int addMethodValue = add(12,14);
		int subMethodValue = sub(234,546);

		int value=addMethodValue+subMethodValue;
		System.out.println(value);
		
	}

}
