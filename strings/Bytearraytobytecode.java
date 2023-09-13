package com.strings;

public class Bytearraytobytecode {
	public static void main(String[] args) {
        // Initializing String
     //   String a = "Hello GeeksforGeeks";
  
  here("HELLO GEEKSFORGEEKS");
        System.out.println();
        
	}
      
        public static void here(String a) {
        // Converting string to byte array
        // Using getBytes() method
        	 String a1 = "HELLO GEEKSFORGEEKS";
        	 System.out.println(a1);
        byte[] b = a.getBytes();
  
        System.out.println("Byte Array:"+b);
        
        // Display the string after conversion
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }
    }


	}


