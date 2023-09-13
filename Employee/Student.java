package com.Employee;

public class Student {
	public static void main(String[] args) {
		Student a=new Student();	
		
		if(a instanceof Student) {
			System.out.println("yes it is correct");
		}else {
			System.out.println("it is not correct");
		}
		}

}
