package com.example.misc;

import java.io.FileReader;
import java.io.FileWriter;

public class IOTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
		try {
			FileWriter fw = new FileWriter("E:\\IO.txt");
			fw.write("my name is aashi");
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Success");

		try {
			FileReader fw = new FileReader("E:\\IO.txt");
			int i ;
			while((i=fw.read())!=-1){
				System.out.print((char)i);
			}
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
