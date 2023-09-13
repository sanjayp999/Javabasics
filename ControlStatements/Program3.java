package com.ControlStatements;
import java.util.Scanner;
public class Program3 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		if(a==1) {
		System.out.println("east");
		}else if(a==2) {
			System.out.println("west");
		}else if(a==3) {
			System.out.println("north");
		}else if(a==4) {
			System.out.println("south");
		}else if(a==5) {
			System.out.println("northeast");
		}
		
		
	}

}
