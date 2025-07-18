package com.java.oops.encapulsation;

public class EncapDemo {

	String empName;
	
	public void setEmpName(String empName)
	{
		this.empName=empName;
	}
	
	public String getEmpName()
	{
		
		return empName;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
EncapDemo encapDemo = new EncapDemo();
EncapDemo encapDemo1 = new EncapDemo();
encapDemo.setEmpName("bharath");
encapDemo1.setEmpName("akash");
String empName29 = encapDemo.getEmpName();
String empName30 = encapDemo1.getEmpName();
System.out.println(empName29);
System.out.println(empName30);
	}

}
