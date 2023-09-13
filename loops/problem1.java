package com.loops;
import java.util.Scanner;
public class problem1 {
	public static void main(String[] args) {
//Write a program to print user name 20 times with serial number 
      
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String a=sc.next();
		sc.close();
		
		for(int i=1;i<=20;i++) {
			System.out.println(i+". "+a);
		}
	}

}
