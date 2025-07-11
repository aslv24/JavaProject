package com.java.exceptionDemo;

public class CompileTime {
	 

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		try {
		System.out.println(1);
		Thread.sleep(2000);
		System.out.println(1);
		Thread.sleep(2000);
		System.out.println(1);
		Thread.sleep(2000);
		System.out.println(1);
		Thread.sleep(2000);
		System.out.println(1);
		}
		catch(InterruptedException e)
		{
			System.out.println();
		}
	}

}
