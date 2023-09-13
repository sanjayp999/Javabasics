package com.oops;

public class Constructors {

	public String name;
	public int rollno;
	
	
	public static void main(String[] args) {
		
		Constructors a=new Constructors(233344,"sanjay");
		a.hi();
		
	}
	public Constructors(int a,String s) {
	     name=s;
	    rollno=a;
	}
public void hi() {
	System.out.println(name+"   "+":"+"   "+rollno);
}
}
