package com.ControlStatements;

import java.util.Scanner;

public class Switchcase3 {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	   System.out.println("enter your category");
	   String a=sc.next();

			switch (a){
			case ("male"):
				System.out.println("rs.100");
				break;
			case ("female"):
				System.out.println("rs.80");
				break;
			case ("transgender"):
				System.out.println("rs.20");
				break;
			case ("children"):
				System.out.println("rs.5");
				break;
			case ("seniorcitizen"):
				System.out.println("free");
			break;
			
		default:
			System.out.println("invalid");
			}

}
}