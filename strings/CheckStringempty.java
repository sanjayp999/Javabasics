package com.strings;

public class CheckStringempty {
	public static void main(String[] args) {
		
	
	 String str1="hello this is";
     String str2 = "";
     boolean a=false;
     boolean b=true;{
     
     if(str1.length()==0){
         a=true;
     }
     if(str2.length()==0){
         b=true;
     }
     System.out.println("Is string \"" + str1+ "\" empty? "+ a);
     System.out.println("Is string \"" + str2+ "\" empty? "+ b);
 }

	}}
