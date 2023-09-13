package com.strings;

public class Introduction {
	public static void main(String[] args) {
		// both are same because variables are pointed to same variable
		String a=new String("hello");
		String b= new String ("hello");
		
		if(a==b) {
			System.out.println("both are same");
			
		}else {
			System.out.println("both are not same");
		}
		
		
	}

}
