package com.ControlStatements;
import java.util.Scanner;
public class Switchseasons {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter your month no");
		int a=sc.nextInt();



		switch (a){
		case 3:case 4:case 5:
			System.out.println("summer");
		break;
		case 6:case 7:case 8:
			System.out.println("rainy");
		break;
		case 9:case 10:case 11:
			System.out.println("spring");
		break;
		case 12:case 1:case 2:
			System.out.println("winter");
		break;

		default:
			System.out.println("invalid month");
		}
	}
}