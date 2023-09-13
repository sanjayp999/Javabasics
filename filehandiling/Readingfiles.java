package com.filehandiling;
import java.io.File;
import java.io.IOException;
public class Readingfiles {
	public static void main(String[] args) {

		File a=new File("E:\\JAVA FULL STACK DEVELOPER\\DAY 1");
		String[]b=a.list();//is used to store  and view the content inside url path

		
		for(String c:b){//displaying each element using for each loop
			
			File f1 = new File(a,c);//in "a" ref check for files and directories
			
			if(f1.isFile()) {		 
				System.out.println("file :"+c);
			}
			if(f1.isDirectory()) {
				System.out.println("direc :"+c);
			}
		}

	}

}
