package com.patterns;

public class Nestedcharactercentre {
	public static void main(String[] args) {
		
		int c=10;
		 for(int a=1;a<c;a++) {
			 int p='A';
			 for(int b=a;b<=c;b++) {
				 System.out.print(" ");
			 }
			 for(int b=1;b<a;b++) {
				 System.out.print((char)p++ +"");
				 
			 }
				 for(int b=1;b<=a;b++) {
					 System.out.print((char)p++ +"");
					 	 
			 }
			 
			 System.out.println();
			 
			 
			 
		 }
		
		
	}

}
