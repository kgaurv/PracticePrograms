package com.example.misc;

public class Fibonacci {

	
	public static void main(String[] args) {

		int i = 0;
		int j = 1;
		int n= 10;
		
		for (int k=0; k<= n; k ++ ){
			System.out.print(i + "\t");
			int sum = i +j ;
			i=j;
			j=sum;
						
		}
		
	}
}
