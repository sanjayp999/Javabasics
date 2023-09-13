package com.ControlStatements;
import java.util.Scanner;
public class switchcase1 {
	public static void main(String[] args) {
		
   Scanner sc=new Scanner(System.in);
   System.out.println("enter your grade");
   char ch=sc.next().charAt(0);

		
		
		switch (ch){
		case ('A'|'a'):
			System.out.println("FIRST RANK");
			break;
		case ('B'|'b'):
			System.out.println("SECOND RANK");
			break;
		case ('C'|'c'):
			System.out.println("FIRST CLASS");
			break;
		case ('D'|'d'):
			System.out.println("SECOND CLASS");
			break;
		case ('E'|'e'):
			System.out.println("JUST PASS");
			break;
		case ('F'|'f'):
			System.out.println("FAILED");
			break;
	
	default:
		System.out.println("INVALID GRADE");
		}
	
	
	}
}


