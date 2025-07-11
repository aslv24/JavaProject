package com.java.stringdemo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pageUrl="https://books.vikatan.com/category/health";
	
		String name="admini";//object Creation
		
		String nameNew="Admini";//object Creation
		
		System.out.println(name.hashCode());
		
		System.out.println(nameNew.hashCode());
		
		System.out.println(name.length());
		
		System.out.println(name.charAt(0));
		
		System.out.println(name.indexOf('i'));
		
		System.out.println(name.lastIndexOf('i'));
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name.toLowerCase());
		
		System.out.println(name==nameNew);
		
		System.out.println(name.equals(nameNew));
		
		System.out.println(name.equalsIgnoreCase(nameNew));
		
		System.out.println(name.startsWith("s"));
		
		System.out.println(name.endsWith("s"));
		
		System.out.println(name.contains("s"));
		
		System.out.println(name.concat(" ind"));
		
		String replace = name.replace('i', 'e');
		
		System.out.println(replace);
		
		System.out.println(name);
		
		int lastIndexOf = pageUrl.lastIndexOf('/')+1;
		
		System.out.println(pageUrl.substring(lastIndexOf));
		
		
	}

}