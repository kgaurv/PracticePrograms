package com.example.misc;

import java.io.IOException;
import java.util.Scanner;

public class FizzBuzz {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String args[]) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no.s");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (i % (3 * 5) == 0)
				System.out.println("FizzBuzz");
			else if (i % 5 == 0)
				System.out.println("Buzz");
			else if (i % 3 == 0)
				System.out.println("Fizz");
			else
				System.out.println(i);
		}
	}

}
