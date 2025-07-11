package com.java.exceptionDemo;

public class CreateException {
	
	public static void m1() 
	{
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
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		m1();

		throw new IllegalStateException();
		
		
	}

}
