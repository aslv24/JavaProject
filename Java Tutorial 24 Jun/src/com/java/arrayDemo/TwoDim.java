package com.java.arrayDemo;

public class TwoDim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][][] m= {
				{
					{},
					{},
					{},
				},
				{
					{},
					{},
					{},
				}
				
		};

		int[][] a=new int[2][3];
		
		int[][] b= {
				{1,2,3,4,5,6,7},
				{2,3,4,5,6},
				{3,4,5},
				{4,},
				{5,6,7,8,9,10,11,12},
				{6,7},
				{7}	
		};
		
		int len=b.length-1;
		
		for(int bb[]:b)
		{
			System.out.print("[");
			for(int cc :bb)
			{
				System.out.print(cc+",");
			}
			System.out.print("]");
			System.out.println();
		}
		
		System.out.println("===================================");
		
		for(int i=0; i<=len;i++)
		{
			System.out.print("[");
			for(int j=0; j<=b[i].length-1;j++)
			{
				System.out.print(b[i][j]+",");
			}
			System.out.print("]");
			System.out.println();
		}
	}

}
