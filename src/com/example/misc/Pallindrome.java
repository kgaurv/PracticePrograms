package com.example.misc;

public class Pallindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int i = 59845;
		int temp = i;
		int sum = 0;
		
		while(i>0){
			int remin = i%10;
			sum= (sum*10) + remin;
			i= i/10;
		}		
		if (temp== sum){
			System.out.println("the number is pallindrome");
		}else{
			System.out.println("the number is not pallindrome");
		}
	}

}
