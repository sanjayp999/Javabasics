package com.ControlStatements;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		
	

	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER YOUR GRADE IN CAPITAL LETTERS");
	char a=sc.next().charAt(0);
	
	if(a=='A'||a=='a') {
	System.out.println("RESULT IS FIRST RANK");
	}else if(a=='B'||a=='b') {
		System.out.println("SECOND RANK");
	}else if(a=='C'||a=='c') { 
		System.out.println("FIRST CLASS");
	}else if(a=='D'||a=='d') {
		System.out.println("SECOND CLASS");
	}else if(a=='E'||a=='e') {
		System.out.println("JUST PASS");
	}else if(a=='F'||a=='f') {
		System.out.println("FAIL");
	}else
		System.out.println("invalid");
	
}

}
