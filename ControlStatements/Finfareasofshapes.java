package com.ControlStatements;
import java.util.Scanner;
public class Finfareasofshapes {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 for area of circle");
		System.out.println("enter 2 for area of triangle");
		System.out.println("enter 3 for area of square");
		System.out.println("enter 4 for area of rectangle");

		int a=sc.nextInt();
		

		if(a==1) {
			System.out.println("enter radius");
			int b=sc.nextInt();

			double c=(3.14*(b*b));
			System.out.println("area of circle ="+c);
		}else if(a==2) {
			System.out.println("enter your base");
			int c=sc.nextInt();

			System.out.println("enter your height");
			int d=sc.nextInt();

			double p=(0.5*c*d);
			System.out.println("area of traingle is :"+p);

		}else if(a==3) {			
			System.out.println("enter your height");
			int e=sc.nextInt();
			int g=e*e;
			System.out.println("area of sqaure is :"+g);

		}else if(a==4) {
			System.out.println("enter your width");
			int j=sc.nextInt();

			System.out.println("enter your length");
			int k=sc.nextInt();

			int q=k*j;
			System.out.println("area of rectangle :"+q);

		}else {
		
			System.out.println("invalid");	
		}}}

