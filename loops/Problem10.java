package com.loops;

public class Problem10 {
	public static void main(String[] args) {
		//write a program to print natural numbers from 1 to 25 except 5 using continue and while loop
		
		int a=1;
		while(a<=25) {
			if(a==5) {
			
				continue;
			}else {
				System.out.println(a);
				a++;	
			}

	}
		System.out.println("sys");		
	}
}


