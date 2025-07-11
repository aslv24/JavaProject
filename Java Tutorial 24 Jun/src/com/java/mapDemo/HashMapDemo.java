package com.java.mapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Object,Object> hm=new HashMap<>();
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
		
		Set<Object> keySet = hm.keySet();
		
		Collection<Object> values = hm.values();
		
		Set<Entry<Object, Object>> entrySet = hm.entrySet();
		
		System.out.println(keySet);
		
		System.out.println(values);
		
		System.out.println(entrySet);
		
		Iterator<Object> ki = keySet.iterator();
		while(ki.hasNext())
		{
			
			System.out.println(ki.next());
		}
		
		Iterator<Entry<Object, Object>> ei = entrySet.iterator();
		
		while(ei.hasNext())
		{
			Map.Entry me=(Map.Entry)ei.next();
			System.out.println(me.getKey()+"="+me.getValue());
		}
	}

}
