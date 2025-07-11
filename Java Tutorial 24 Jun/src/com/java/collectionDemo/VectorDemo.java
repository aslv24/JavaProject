package com.java.collectionDemo;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Object> al=new Vector<>();
		
		al.add(1);
		al.add(14646.44F);
		al.add(74557347857845547L);
		al.add('s');
		al.add(null);
		al.add(null);
		al.add(null);
		al.add(true);
		al.add("java");
		al.add(1);
		al.add(1);
		al.add(1);
		System.out.println(al);
	
		al.remove(0);
		
		System.out.println(al);
		
		al.add(7,"selenium");
		
		System.out.println(al);
	}

}
