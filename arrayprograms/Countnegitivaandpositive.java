package com.arrayprograms;

public class Countnegitivaandpositive {

	public static void main(String[] args) {

		int arr [] = {-25,-20,-15, -10, -5, 0, 5, 0, 15,25};
		int positive =0;
		int negitive =0;
		int zero=0;
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]>0) {
				positive++;
			}
			else if(arr[i]<0) {
				negitive++;
			}
			else if(arr[i]==0) {
				zero++;

			}
		}
		System.out.println("Positive numbers in the array = "+ positive);
		System.out.println("zero numbers in array ="+zero);
		System.out.println("Negative numbers in the array = " + negitive);	
	}
}
