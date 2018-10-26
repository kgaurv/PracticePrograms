package com.example.misc;

public class Armstrong {

	public static void main(String args[]) {

		int n = 371;
		int temp = n;
		int squ= 0;

		while (n > 0) {
			int remin = n % 10;
			System.out.println(remin);
			n = n / 10;
			System.out.println(n);
			squ = squ + (remin*remin*remin);
			System.out.println(squ);
		}
		if (temp== squ){
			System.out.println("number is armstrong");
		}else{
			System.out.println("number is not armstrong");
		}
		
		
	}
}
	
	

