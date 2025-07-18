package com.java.oops.methodoverriding;


public class People {
	
	public static void main(String[] a,String b) {
		System.out.println("I am not main method");
	}
	
	public static void main() {
		System.out.println("I am not main method");
	}

	public static void main(String b) {
		System.out.println("I am not main method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		main();
		
		main("");
		
		main(new String[] {},"");

		RBI rbi=new SBI();
		rbi.getInterestRate();
	}

}
