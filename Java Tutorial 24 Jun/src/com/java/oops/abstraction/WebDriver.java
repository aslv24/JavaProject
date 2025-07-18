package com.java.oops.abstraction;

public interface WebDriver {

	
	public abstract void maximize();
	
	public abstract void get();
	
	public abstract void getTitle();
	
	public abstract void getCurrentUrl();
	
	public abstract void findElement();
	
	public void findElements();
	
	public abstract void switchTo();
}
