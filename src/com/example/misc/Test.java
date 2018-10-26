package com.example.misc;

public class Test {
	public static void main(String[] args) {
		int first=0;
		int second=1;
		for(int k=0;k<=10;k++){
			System.out.print(first+" ");
			int sum=first+second;
			first=second;
			second=sum;
					
		}
	}
	
	
}
