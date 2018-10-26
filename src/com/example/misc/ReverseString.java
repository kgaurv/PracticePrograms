package com.example.misc;

public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
 
		String s = "MALAMAAL";
		 int i, len = s.length();

		    for (i = (len - 1); i >= 0; i--){
		       char c =  s.charAt(i);
		        System.out.print(c);
		    }
	}

}                
