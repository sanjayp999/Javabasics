package com.filehandiling;

import java.io.*;

import java.io.IOException;

public class Filehandle {
	public static void main(String[] args) throws IOException {
		
//		File f= new File("hi.txt");
//		boolean status=f.createNewFile();
//		System.out.println(status);
//		
//
//		File f1= new File("folder1");
//		boolean b=f1.mkdir();
//		System.out.println(b);
//		
//		File c=new File(f1,"hello.txt");
//		c.createNewFile();
//		
		FileReader fr = new FileReader ("files.txt");
		int  i = fr.read ( );

		while ( i != -1 ){
			System.out.print( (char) i );
			
			i = fr.read ( );	// read next character and re-initialize i var
		}
		fr.close ( );
	}


		
	}


