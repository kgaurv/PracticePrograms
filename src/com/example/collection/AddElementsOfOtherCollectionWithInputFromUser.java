package com.example.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Vector;

public class AddElementsOfOtherCollectionWithInputFromUser {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] r = new int[3];
	    String[] name = new String[3];
	    for(int i=0;i<3;i++)
	    {
	        System.out.println("Enter the name of students");
	        name[i] = br.readLine();
	    }  
		
	}

}
