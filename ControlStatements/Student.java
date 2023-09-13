package com.ControlStatements;

public class Student {
	public static void main(String[] args) {
		Student s=new Student();
		s.move(5, 7);
		System.out.println();
		
		m1(3,5);
		System.out.println();
		
		
	}
	
	

		
	public static void m1(int c,int d) {
		System.out.println(c-d);
	}
	

	
	private void move(int a,int b) {
		System.out.println(a+b);
		
	}

	
	
}
