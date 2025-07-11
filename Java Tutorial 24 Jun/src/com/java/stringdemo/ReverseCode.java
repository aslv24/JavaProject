package com.java.stringdemo;

public class ReverseCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="saran";
		
		int length=name.length()-1;
		
		for (int i = 0; i <=length; i++) {
			System.out.print(name.charAt(i));
		}
		
		System.out.println();
		
		for (int i = 0; i <=length ; i++) {
			System.out.print(name.charAt(length-i));
		}
		
	}

}
