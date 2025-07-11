package com.java.basics;

public class Sample 
{
	
	// This is main method
		public static void main(String[] args) {
			
			new Sample();//nameless Object
			Sample sample=new Sample();//named Object
			sample.m1();
			sample.m2();
			sample.m3();
			sample.m4();
			System.out.println("Hello world");
		}
		
		public void m1()
		{
			System.out.println("1");
		}
		
		public void m2()
		{
			System.out.print("2");
		}
		
		public void m3()
		{
			System.out.print("3");
		}
		
		public void m4()
		{
			System.out.print("4");
		}

	
}
