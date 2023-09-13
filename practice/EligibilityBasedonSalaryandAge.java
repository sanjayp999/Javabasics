package com.practice;
import java.io.*;
public class EligibilityBasedonSalaryandAge {

    public static void main (String... args) throws Exception {
		
		InputStreamReader isr = new InputStreamReader( System.in );
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter Your Age");
		String str1 = br.readLine ( );
		int age = Integer.parseInt ( str1 );

		System.out.println("Enter Your Salary");
		String str2 = br.readLine ( );
		double salary = Double.parseDouble(str2);
	
		if(age<=30 && salary>=100000) {
		System.out.print("Eligible for marriage");
    }else {
    	System.out.println("Not Eligible for marriage");
    }
    }
	
	
	
	
	
	
	
	
	
	
	
	
}

