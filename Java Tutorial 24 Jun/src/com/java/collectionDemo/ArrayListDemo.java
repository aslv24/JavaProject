package com.java.collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> al=new ArrayList<>();
		
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
		
		for(int i=0; i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		Iterator<Object> i = al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}

}
