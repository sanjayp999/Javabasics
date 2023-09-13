package com.patterns;

public class NestedDiamond {
		public static void main(String[] args) {
			
			int c=5;
			
			for(int a=1,p=1;a<=c;a++,p++) {
				
				for(int b=a;b<=c;b++) {
					System.out.print(" ");
				}
			for(int b=1;b<a;b++) {
				System.out.print(p+"");
				
			}
				for(int b=1;b<=a;b++) {
					System.out.print(p+"");
				}
				
				
				System.out.println();
					
			}	
			for(int a=1,p=5;a<=c;a++,p--) {
				for(int b=1;b<=a;b++) {
					System.out.print(" ");
				}
			for(int b=a;b<c;b++) {
				System.out.print(p+"");
				
			}
				for(int b=a;b<=c;b++) {
					System.out.print(p+"");
				}
				
				
				System.out.println();
						
					
		}
				
		}		

			
		}
