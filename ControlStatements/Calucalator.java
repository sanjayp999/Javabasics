package com.ControlStatements;
import java.util.Scanner;
public class Calucalator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome to simple calculator");
		System.out.println("enter number for operation");
		int a=sc.nextInt();

		if(a<6&&a>0) {
			Scanner sc7=new Scanner(System.in);
			System.out.println("enter number 1");
			int b=sc7.nextInt();

			Scanner sc2=new Scanner(System.in);
			System.out.println("enter number 2");
			int c=sc2.nextInt();

			if(a==1) {
				int d=b+c;
				System.out.println(" performing ADDITION : "+d);
			}else if(a==2) {
				int e=b-c;
				System.out.println(" performing SUBTRACTION : "+e);
			}else if(a==3) {
				int f=b*c;
				System.out.println(" performing MULTIPLICATION : "+f);
			}else if(a==4) {
				int g=b/c;
				System.out.println(" performing DIVISON(QUOIENT) : "+g);
			}else if(a==5) {
				int h=b%c;
				System.out.println("performin DIVISION(REMINDER) : "+h);
			}	
		}
		else if(a>=6&& a<=8) {
			Scanner sc4=new Scanner(System.in);
			System.out.println("enter number to check");
			int r=sc4.nextInt();
			if(a==6) {
				if(r%2==0) 
					System.out.println("it is even");
				else 
					System.out.println("it is odd");

			}else if(a==8) {

				if(r>21 && r<32) 
					System.out.println("eligible for ips exam");
				else
					System.out.println("not eligible for ips exam");

			}else if(a==7) {

				if(r>18) 
					System.out.println("eligible for vote");
				else
					System.out.println("not eligible for vote");

			}
				
		}
		else {
			System.out.println("invalid number");
		}
	}

}



