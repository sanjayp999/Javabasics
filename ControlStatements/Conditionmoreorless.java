package com.ControlStatements;
import java.util.Scanner;
public class Conditionmoreorless {
	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		System.out.println("enter your amount");
		int a=sc.nextInt();

		int d=(a/100)*25;
		int e=(a/100)*10;
		
		
		if(a<5000) {
			int result1=a-e;
			System.out.println("your payable bill "+result1);
		}
		else if(a>5000) {
			int result=a-d;
			System.out.println("your payable bill is "+result);
		}	
	}
}
