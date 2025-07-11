package com.java.basics;

public class BlockDemo {

	// instance block
	{
		System.out.println("I am Instance Block");
	}

	// static block
	static
	{
		System.out.println("I am static Block");
	}
	
	void m1()
	{
		System.out.println("m1");
	}
	
	void m2()
	{
		System.out.println("m2");
		new BlockDemo();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BlockDemo bd=new BlockDemo();//nameless object
		bd.m1();
		bd.m1();
		bd.m1();
		bd.m1();
		bd.m1();
		
	}

}
