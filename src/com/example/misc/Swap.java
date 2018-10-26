package com.example.misc;

public class Swap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int i= 2;
		int j= 3;
		int temp;
		
		System.out.println(i +" " + j);
		
		temp = i;
		i= j;
		j = temp;
		
		System.out.println(i +" " + j);
				
	}

}
