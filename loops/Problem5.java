package com.loops;
import java.io.*;
public class Problem5 {
	public static void main(String[] args) throws IOException {
	//	Write a program to print natural numbers in the user defined range
	InputStreamReader isr=new InputStreamReader(System.in);
	System.out.println(" enter your range");
	BufferedReader br=new BufferedReader(isr);
	String s=br.readLine( );
	int a=Integer.parseInt(s);
	
	for(int i=1;i<=a;i++) {
		System.out.println(i);
	}
	}

}
