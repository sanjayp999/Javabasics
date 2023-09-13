package com.patterns;

public class Diamond {
	public static void main(String[] args) {
		int c=5;
		for(int a=1;a<=5;a++) {

			for(int b=a;b<=c;b++) {
				System.out.print(" ");
			}
			for(int b=1;b<=a;b++) {
				System.out.print("* ");

			}

			System.out.println();		
		}	
		for(int a=1;a<=5;a++) {	
			
			for(int b=1;b<=a;b++) {
			System.out.print(" ");
		}
		for(int b=a;b<=c;b++) {
			System.out.print("* ");
		}
		System.out.println();	
		}
	}
}