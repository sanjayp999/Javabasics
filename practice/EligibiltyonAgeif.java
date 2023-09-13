package com.practice;
import java.io.*;
public class EligibiltyonAgeif {
	public static void main(String[] args)throws Exception {
		
		InputStreamReader isr = new InputStreamReader( System.in );
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter Your Age");
		String str1 = br.readLine ( );
		int age = Integer.parseInt ( str1 );
	
	if(age>30) {
	System.out.println("not eligible for marriage");
	}
	System.out.println("eligible for marriagae");
	
		
	}	
}
