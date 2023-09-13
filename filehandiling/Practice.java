package com.filehandiling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Practice {
	public static void main(String[] args) throws IOException {
//		
//		File f= new File("new file1");
//		boolean f2 = f.createNewFile();
//	        System.out.println(f.isFile());  
//	        
		//creating directory and creating file in the directory
	        File f1=new File("new directory1");
	        boolean mkdir = f1.mkdir();
	        System.out.println(f1.isDirectory());
	        
	     File f2= new File(f1,"data");
	     f2.createNewFile();
		
	     //file creating and writing data in the file    
	     FileWriter f3= new FileWriter("rex.txt");
	     f3.write("java was independent and robust,OOPS is the pillar of java");
	    f3.write("hello this is jack");
	     f3.flush();
	     f3.close();   
	     
	     //reading files content
	     FileReader f4=new FileReader("rex.txt");
	     int read = f4.read();
	    System.out.println(read);
	     
	     
	     
	     
	     
	}

}
