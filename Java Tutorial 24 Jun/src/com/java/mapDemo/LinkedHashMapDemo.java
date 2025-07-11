package com.java.mapDemo;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Object, Object> hm=new LinkedHashMap<Object,Object>();
		hm.put(100, "java");
		hm.put(110, "java");
		hm.put(104, "java");
		hm.put(null, "java");
		hm.put(103, "java");
		hm.put(107, "java");
		hm.put(102, "java");
		hm.put(99, "java");
		hm.put(110, "java");
		
		System.out.println(hm);
	}

}
