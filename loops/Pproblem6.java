package com.loops;
import java.io.*;
public class Pproblem6 {
	public static void main(String[] args) throws IOException {
		
		//write a program to print username 20 times with serial nos by using while loop
	    
		InputStreamReader isr=new InputStreamReader(System.in);
		System.out.println("enter your name");
		BufferedReader    br=new BufferedReader(isr);
		String s=br.readLine();
		
	for(int i=1;i<=20;i++) {
		System.out.println(i+". "+s);
	}
	
	}

}
