package com.java.exceptionDemo;

public class RunTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c[]= {0,1,2,3,4,5,6,7,9};

		int a = 10;

		int b = 0;
		
		try {
			System.out.println(a / c[10]);
		} 
		
		catch(ArithmeticException e)
		{
			System.err.println("Please enter non zero numbers");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Please verify size of array :: "+c.length);
		}
		
		finally {
			System.out.println("Always Executable");
		}
	}

}
