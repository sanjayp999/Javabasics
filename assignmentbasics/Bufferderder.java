package com.assignmentbasics;

public class Bufferderder {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6,7,8,9,9};

		int temp=0;

		for(int i=0;i<a.length;i++) {
			temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		}

			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]);
			}
		}


	}









