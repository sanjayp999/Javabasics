package com.important;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1="heart";
		String s2="earth";
		if(s1.length()==s2.length()) {
		char a[]=s1.toCharArray();
		char b[]=s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);	
		if(s1.length()==s2.length()) {
		if(Arrays.equals(a,b)) 
		    System.out.println("it is a anagram");
		
		else
			System.out.println("it is not an anagram");
		}
          else 
		System.out.println("it not a anagram");
	
}}}