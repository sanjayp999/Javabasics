package com.patterns;

public class NestedLoopRightAngleTriangle {
	public static void main(String[] args) {
		
		
        
	int c=5;
		for(int a=1;a<=c;a++) {
	
	for(int b=a;b<=c;b++) {
		System.out.print(" ");
	
	}
		for(int b=1;b<a;b++) {
			System.out.print(b);
			
			
		}	for(int b=1;b<=a;b++) {
			System.out.print(b);
		}
		System.out.println();
		}
		
	}
}	