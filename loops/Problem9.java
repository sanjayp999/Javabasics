package com.loops;

public class Problem9 {
	public static void main(String[] args) {
		//write a program to print natural numbers from 1 to 25 except 5 using continue
		
		for(int i=1;i<=25;i++) {
			if(i==5) {
				continue;
			}
		System.out.println(i);
		}
		
	}

}
