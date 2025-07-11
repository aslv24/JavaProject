package com.java.collectionDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Object> al=new LinkedHashSet<>();
		
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
		al.remove(true);
		System.out.println(al);
	}

}
