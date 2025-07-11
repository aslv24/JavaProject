package com.java.Looping;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(char i='A'; i<='E'; i++)//1 2 3 4 5
		{
			for(char j='A'; j<=i; j++)// 1 2 3 4 5
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
