package com.java.collectionDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Object> al=new HashSet<>();
		
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
				
		Iterator<Object> i = al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
