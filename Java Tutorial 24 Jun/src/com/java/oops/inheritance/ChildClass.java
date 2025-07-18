package com.java.oops.inheritance;

public class ChildClass extends ParentClass{

	
	public static void c1()
	{
		System.out.println("I am c1");
	}
	
	public void c2()
	{
		System.out.println("I am c2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		c1();
		
		new ChildClass().c2();
		
		m1();
		
		new ChildClass().m2();
	}

}
