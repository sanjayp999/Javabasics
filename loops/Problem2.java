package com.loops;
import java.util.Scanner;
import java.io.*;
public class Problem2 {
	public static void main(String[] args) throws IOException {
	//	Write a program to print user name user defined times with serial number using scanner for user name and bufferReader for no of times	

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("enter your name");
		String str = br.readLine ( );
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of times");
		int a=sc.nextInt();
		
		
		for(int i=1;i<=a;i++) {
			System.out.println(i+". "+str);
		}
		
		
		
		
	}

}
