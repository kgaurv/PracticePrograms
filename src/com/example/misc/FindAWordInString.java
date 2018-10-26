package com.example.misc;

public class FindAWordInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s = "Hello Guyz I am Ashna";
		 int i, len = s.length();
		String find = "Guyz"; 
		
		String arr[]= s.split(" ");
		
		for (String v : arr){
			if(v.equals(find)){
				System.out.println("String contains your word:  "+v);
			}
		}
		
		
	}

}
