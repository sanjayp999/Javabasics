package com.patterns;

public class PyramidStar {
	public static void main(String[] args) {
		int c=5;
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=c;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		for(int i1=1;i1<=5;i1++) {
			

		for(int j=1;j<=i;j++) {
			System.out.print(" ");

			}
			for(int j=i;j<=i;j++) {
			System.out.print("*");
			}
			for(int j=i;j<=i;j++) {
				System.out.print("*");
				}
			
			System.out.println();
		}
	}
}
}