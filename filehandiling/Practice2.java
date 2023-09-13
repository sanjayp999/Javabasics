package com.filehandiling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) throws IOException {
		File f= new File("./practice.txt");
		if(!f.exists())
		f.createNewFile();
		//reading with INPUTSTREAM READER
		/*
		 * FileInputStream fis= new FileInputStream(f); int a; //it is reading character
		 * by character //we are type casting ascii code into char
		 * while((a=(char)fis.read())!=-1) { System.out.print((char)a); }
		 */
		//using Scanner class
		
		Scanner sc= new Scanner(f);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
	sc.close();	
	}

}
