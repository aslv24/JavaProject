package com.java.oops.inheritance;

public class ParentClass{

	
	public static void m1()
	{
		System.out.println("I am m1");
	}
	
	public void m2()
	{
		System.out.println("I am m2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubChildClass2 scc2=new SubChildClass2();
		scc2.scc2();
		scc2.c2();
		scc2.m2();
	}

}
