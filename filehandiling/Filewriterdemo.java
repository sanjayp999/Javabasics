package com.filehandiling;
import java.io.*;
import java.io.IOException;
public class Filewriterdemo {
	public static void main(String[] args) throws IOException {
		
		
		
		FileWriter  fw = new FileWriter("files.txt");

		fw.write("hello this is jack");

		fw.write("\n");  // it represents new line

		fw.write("How are you?");

		fw.flush ( );

		fw.close( ) ;
		
	}

}
