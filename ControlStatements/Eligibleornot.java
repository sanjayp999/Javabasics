package com.ControlStatements;
import java.util.Scanner;
public class Eligibleornot {

	public static void main(String[] args) {

		Scanner a=new Scanner(System.in);
		int b=a.nextInt();

		
		


		if(b>=21 && b<=37) {
			System.out.println("you are eligible");
		}else {
			System.out.println("you are  not eligible");

		}	
	}
}
