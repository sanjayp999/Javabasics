package com.arrayprograms;

public class Copyofarray {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		int b[]=  new int[5];
		  b= a;
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
		}
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		
		
		
		
		
		
	}

}
