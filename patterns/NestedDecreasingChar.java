package com.patterns;

public class NestedDecreasingChar {
	public static void main(String[] args) {

		int c=10;

		for(int a =1;a<=c;a++) {
			int p='E';
			for(int b=a;b<=c;b++) {
				System.out.print(" ");
			}
			for(int b=1;b<=a;b++) {
				System.out.print((char)p-- +"" );
			}

			for(int b=1;b<a;b++) {
				System.out.print((char)p-- +"" );
			}

			System.out.println();


		}}}






		
	


