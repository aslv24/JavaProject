package com.java.basics;

public class Constructor {
	
	public Constructor() {
		System.out.println("I am Constructor");
	}
	
	public Constructor(int a) {
		System.out.println("I am Int Constructor");
	}
	
	public Constructor(String a) {
		System.out.println("I am String Constructor");
	}
	
	public Constructor(char a) {
		System.out.println("I am Char Constructor");
	}
	
	public Constructor(boolean a) {
		System.out.println("I am Boolean Constructor");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Constructor(234);  
		new Constructor();
		new Constructor("");
		new Constructor('s');
		new Constructor(false);
		
		
	}

}
