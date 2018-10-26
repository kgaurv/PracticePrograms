package com.interviews;

import java.util.Scanner;

public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number till which you want prime number to be printed");
		 int n = sc.nextInt();
		 
		 for (int i = 2; i<=n; i++){
			 if(i%2 ==0){
				 System.out.println(i);
			 }
			 
		 }
	}

}
