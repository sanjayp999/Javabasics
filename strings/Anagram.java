package com.strings;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		
	     //  String a="heart";
		//String b="earth";
	go("heart", "earth");
	System.out.println();
	lift("heart","earth");
	System.out.println();
	
	}
		public static void go(String a,String b) {

			if(a.length()!=b.length()) {
			
				System.out.println("it is not a anagram");
			return ;}	
		}
		
	public static void lift(String a,String b) {
    char c[]=a.toCharArray();
    char d[]=b.toCharArray();
     Arrays.sort(c);
    Arrays.sort(d);
	//}
	
	
	//public static void to(char c[],char d[]) {
    
		if(Arrays.equals(c, d))
    
    System.out.println("it is a anagram");
    else
    	System.out.println("not a anagram");
   
	}	
	
}
