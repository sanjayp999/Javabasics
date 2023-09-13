package com.arrayprograms;

public class Secondlargest {
	public static void main(String[] args) {
		//find  any largest and smallest values in the array
		int a[]= {12,34,56,78,48,909,354,376};

		int temp=0;
		//if we use > symbol we get largest number
		//if use < symbol we get smallest number
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];

					a[i]=a[j];//compared values now equaled to a[i]
					a[j]=temp;// now temp values are stored on a[j]
				}
			}
		}
		//System.out.println(Arrays.toString(a));
		System.out.println(a[a.length-3]);

	}
}