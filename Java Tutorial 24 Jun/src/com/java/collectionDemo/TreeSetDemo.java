package com.java.collectionDemo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Object> al=new TreeSet<>();
		
		al.add(1345);
		al.add(1464);
		al.add(546);
		al.add(4234);
		al.add(243);
		al.add(1);
		al.add(1);
		al.add(1);
		
		
		System.out.println(al);
		
//		for(Object aa:al)
//		{
//			System.out.println(aa);
//		}
		
		Iterator<Object> di = al.descendingIterator();
		
		while(di.hasNext())
		{
			System.out.println(di.next());
		}
	}

}
