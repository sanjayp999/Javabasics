package com.filehandiling;

public class Mmanagement2 {
	public static void main(String[] args) {
		//for heap
		
		  int size=10; 
		  for(int i=10;i<Integer.MAX_VALUE;i++) { 
			  int arr[]=new int[size];
		  size=size*2;
		  System.out.println(size); }
		 
		//for stack area
		
		  Mmanagement2 a= new Mmanagement2();
		  a.add(1);
		    
	}
public void add(int i) {
	 System.out.println(i);
	     i++;
	     add(i);
  
}
}