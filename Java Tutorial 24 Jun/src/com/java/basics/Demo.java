package com.java.basics;

public class Demo extends Sample{
	
	protected int m=100;

	static int global_var=10;
	public static void m8() {
		int a=10;
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m8();
		System.out.println(new Demo().m);
		new Demo().m2();
	}

}
