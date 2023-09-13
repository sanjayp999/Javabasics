package com.arrayprograms;

public class displaynegitiveandpositive {
	public static void main(String[] args) {
		//  Separate positive and negative numbers in an array:
		int arr [] = {-25,-20,-15, -10, -5, 0, 5, 10, 15,20,25};
		for(int k=0;k<arr.length;k++) {			
			if(arr[k]>0) {
				System.out.print(" "+arr[k]);

			}
		}
		System.out.println();
		for(int k=0;k<arr.length;k++) {
			if(arr[k]<0) {
				System.out.print(arr[k]+" ");
			}
		}

	}
}

