package com.java.conditionalStatement;

public class IfLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mark=101;
		
		if(mark==35)
		{
			System.out.println("just Pass");
		}
		
		else if(mark>35 && mark<=100)
		{
			System.out.println("Pass");
		}
		
		else if(mark<35 && mark>=0)
		{
			System.out.println("Fail");
		}
		
		else
		{
			System.out.println("Invaild");
		}
	}

}
