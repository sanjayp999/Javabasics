package com.arrays;

public class Arrayminmax {
	public static void main(String[] args) {
		
		
		
		
		int []a= {54,987,45,98,5,654,22,206};
	//	int min = a[0];
		int max= 0;
		 
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max) {
				max=a[i];
			}
		//	if (a[i]<min);
		//	min=a[i];
		}
	//	System.out.println("minimum value:"+ min);
		System.out.println("maximum value:"+ max);
			
		
			
		}
}

