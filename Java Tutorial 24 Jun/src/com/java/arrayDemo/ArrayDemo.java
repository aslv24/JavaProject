package com.java.arrayDemo;

public class ArrayDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=5;
		int power=1;
		
		for(int i=1; i<=num;i++)
		{
			power=power*10;
			int n=(i*(power/9));
			System.out.println(n);
		}
		
		int b[]=new int[100];
		
		int a[]= {
				1,
				2,
				3,
				4,
				5,
				6,
				7,
				8,
				9
				};
		
		Object c[]= {1,2,3,4,5,6,7,8,9,true,3737.40f,48375687463458L,"string",null,'s'};
		
		
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("=================");
		
		for(int aa:b)
		{
			System.out.println(aa);
		}

	}

}
