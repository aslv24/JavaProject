package com.java.basics;

public class Car {

	int speed=100;

	
	public static void increaseSpeed(Car c)
	{
		c.speed+=10;
		System.out.println(c.speed);
	}
	
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car obj=new Car();
		Car.increaseSpeed(obj);
		
		Car.add(123, 345);
	}

}
