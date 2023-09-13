package com.practice;
import java.io.*;
public class Pffinding {

	    public static void main (String[] args) throws Exception {
			
			InputStreamReader isr = new InputStreamReader( System.in );
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Enter Basic Salary");
			String str = br.readLine ( );
			
//  here basic salary is string it is converted into double because we get output in decimals
			
			double basicSalary = Double.parseDouble ( str );
			
			
			double a =(basicSalary *12/100);
			
			System.out.println(a);			
			
			
	    }
	    
}

